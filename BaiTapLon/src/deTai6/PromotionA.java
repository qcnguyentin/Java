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
	}
	
	public PromotionA(String onDate, String outDate, int pro_percent) throws ParseException {
		super();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.pro_percent = pro_percent;
	}
	
	@Override
	public void setGift() {
		// TODO Auto-generated method stub
		
	}
	public String getId() {
		return id;
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
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.id);
		System.out.println(fm.format(this.onDate.getTime()));
		System.out.println(fm.format(this.outDate.getTime()));
		System.out.printf("Giam gia: %d%s\n", pro_percent,(char)37);
	}
	public static void main(String[] args) throws ParseException {

		Promotion a = new PromotionA("23/3/2018","23/3/2019",25);
		a.show();
	}
}
