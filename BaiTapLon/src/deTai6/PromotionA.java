package deTai6;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class PromotionA extends Promotion {
	private static int count;
	private String id;
	private GregorianCalendar onDate;
	private GregorianCalendar outDate;
	private int pro_percent;
	{
		id = (String.format("A%02d", ++count));
	}

	public PromotionA() throws ParseException {
		// TODO Auto-generated constructor stub
		System.out.println("Nhap ngay tao: ");
		String onDate = Promotion.sc.nextLine();
		System.out.println("Nhap ngay het hieu luc: ");
		String outDate = Promotion.sc.nextLine();
		System.out.println("Nhap phan tram khuyen mai: ");
		int pro_percent = Integer.parseInt(Promotion.sc.nextLine());
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.pro_percent = pro_percent;
	}

	public PromotionA(String onDate, String outDate, int pro_percent) throws ParseException {
		super();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.pro_percent = pro_percent;
	}

	public boolean isOutDate() {
		return this.outDate.before(new GregorianCalendar());
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("Ma khuyen mai: %s\n", this.id);
		System.out.printf("Ngay tao: %s\n", fm.format(this.onDate.getTime()));
		System.out.printf("Ngay het han: %s\n", fm.format(this.outDate.getTime()));
		System.out.printf("Giam gia: %d%s\n", pro_percent, (char) 37);
		if (this.isOutDate())
			System.out.println("***HET HAN***");
	}

	@Override
	public int gift() {
		// TODO Auto-generated method stub
		return this.pro_percent;
	}

	public String getId() {
		return this.id;
	}

	public GregorianCalendar getOnDate() {
		return this.onDate;
	}

	public void setOnDate(GregorianCalendar onDate) {
		this.onDate = onDate;
	}

	public GregorianCalendar getOutDate() {
		return this.outDate;
	}

	public void setOutDate(GregorianCalendar outDate) {
		this.outDate = outDate;
	}

	@Override
	public boolean xDayToOut(int x) {
		GregorianCalendar tmp = new GregorianCalendar();
		tmp.add(Calendar.DAY_OF_MONTH, x);
		if (fm.format(tmp.getTime()).compareTo(fm.format(this.getOutDate().getTime())) == 0)
			return true;
		return false;
	}
}
