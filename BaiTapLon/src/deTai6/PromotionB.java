package deTai6;

import java.util.Date;
import java.util.List;

public class PromotionB extends Promotion{
	private static int count = 999;
	private String id;
	private Date onDate;
	private Date outDate;
	
	private List<TicketGift> listTicket;
	{
		id = (String.format("B%04d", ++count));
	}
	
	public PromotionB(Date onDate, Date outDate, List<TicketGift> listTicket) {
		super();
		this.onDate = onDate;
		this.outDate = outDate;
		this.listTicket = listTicket;
		
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
