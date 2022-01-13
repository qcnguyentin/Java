package deTai6;

import java.text.ParseException;
import java.util.GregorianCalendar;

public class PromotionA extends Promotion{
	private static int count;
	private String id;
	private GregorianCalendar onDate;
	private GregorianCalendar outDate;
	private int pro_percent;
	{
		id = (String.format("A%02d", ++count));
//		PromotionManagement.ad
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
	public boolean isOutDate() {
		return this.outDate.before(new GregorianCalendar());
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.id);
		System.out.println(fm.format(this.onDate.getTime()));
		System.out.println(fm.format(this.outDate.getTime()));
		System.out.printf("Giam gia: %d%s\n", pro_percent,(char)37);
	}
	public static void main(String[] args) throws ParseException {

//		Promotion a = new PromotionA("23/3/2018","23/3/2019",25);
//		System.out.println(a.isOutDate());
		Promotion b = new PromotionA("23/3/2018","9/1/2022",25);
//		System.out.println(b.isOutDate());
//		b.getOutDate().
		GregorianCalendar ou = b.getOutDate();
//		String ouSt = fm.format(ou);
//		System.out.println((ou.getTimeInMillis()-(new GregorianCalendar()).getTimeInMillis())/(24*3600*1000));
//		a.show();
		ou.add(GregorianCalendar.DAY_OF_MONTH, 4);
	}

	@Override
	public int gift() {
		// TODO Auto-generated method stub
		return this.pro_percent;
	}

	
}
