package deTai6;

import java.util.Date;

public class PromotionC {
	private static int count;
	private String id;
	private Date onDate;
	private Date outDate;
	
	{
		id = (String.format("C%04d", ++count));
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
}
