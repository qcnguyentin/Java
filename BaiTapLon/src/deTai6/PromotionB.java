package deTai6;

import java.text.ParseException;
import java.util.GregorianCalendar;

public class PromotionB extends Promotion{
	private static int count = 999;
	private String id;
	private GregorianCalendar onDate;
	private GregorianCalendar outDate;
	
	private TicketGift listTicket;
	{
		id = (String.format("B%04d", ++count));
	}
	
	public PromotionB(String onDate, String outDate) throws ParseException {
		super();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.listTicket = new TicketGift();
		
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
		System.out.println(listTicket.toString());
	}
	public static void main(String[] args) throws ParseException {
		Promotion prB = new PromotionB("20/8/2020", "20/8/2021");
		prB.show();
	}
}
