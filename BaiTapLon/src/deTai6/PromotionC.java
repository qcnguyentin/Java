package deTai6;

import java.text.ParseException;
import java.util.GregorianCalendar;

public class PromotionC extends Promotion{
	private static int count;
	private String id;
	private GregorianCalendar onDate;
	private GregorianCalendar outDate;
	
	{
		id = (String.format("C%04d", ++count));
	}
	
	public PromotionC(String onDate, String outDate) throws ParseException {
		super();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		
	}
	public String getId() {
		return id;
	}

	public GregorianCalendar getOnDate() {
		return onDate;
	}

	public void setOnDate(GregorianCalendar onDate) {
		this.onDate = onDate;
	}

	public GregorianCalendar getOutDate() {
		return outDate;
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
		
	}
}
