package deTai6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PromotionA extends Promotion{
	private static int count;
	private String id;
	private Date onDate;
	private Date outDate;
	// xem lai
	private double pro_percent;
	{
		id = (String.format("A%02d", ++count));
	}
	
	public PromotionA(Date onDate, Date ouDate, double pro_percent) {
		super();
		this.onDate = onDate;
		this.outDate = ouDate;
		this.pro_percent = pro_percent;
	}
	public String getId() {
		return id;
	}

	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.id);
		System.out.println(fm.format(this.onDate.getTime()));
		System.out.println(fm.format(this.outDate.getTime()));
	}
	public static void main(String[] args) throws ParseException {
		Date onDate = (Date) fm.parse("30/04/2019");
		Date outDate = (Date) fm.parse("30/04/2020");
		Promotion a = new PromotionA(onDate,outDate,25);
		a.show();
	}
}
