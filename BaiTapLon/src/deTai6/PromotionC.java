package deTai6;

import java.util.Date;

public class PromotionC extends Promotion{
	private static int count;
	private String id;
	private Date onDate;
	private Date outDate;
	
	{
		id = (String.format("C%04d", ++count));
	}
	
	public PromotionC(Date onDate, Date outDate) {
		super();
		this.onDate = onDate;
		this.outDate = outDate;
		
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
}
