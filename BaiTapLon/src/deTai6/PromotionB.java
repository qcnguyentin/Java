package deTai6;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class PromotionB extends Promotion{
	private static int count = 999;
	private String id;
	private GregorianCalendar onDate;
	private GregorianCalendar outDate;
	
	private List<String> listTicket = new ArrayList<>();
	{
		id = (String.format("B%04d", ++count));
	}
	
	public PromotionB() throws ParseException {
		// TODO Auto-generated constructor stub
		System.out.println("+ Nhap ngay tao: ");
		String onDate = Promotion.sc.nextLine();
		System.out.println("+ Nhap ngay het hieu luc: ");
		String outDate = Promotion.sc.nextLine();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		String a = "z";
		while(true) {
			System.out.println("+ Nhap dich vu tang kem (Nham phim 'z + enter' de ket thuc': ");
			String ticket = Promotion.sc.nextLine();
			if(ticket.compareTo(a) == 0)
				break;
			else
				this.listTicket.add(ticket);
		}
	}
	
	public PromotionB(String onDate, String outDate, String ticket) throws ParseException {
		super();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.listTicket.add(ticket);
	}
	
	public PromotionB(String onDate, String outDate, String ticket, String ticket1) throws ParseException {
		super();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.listTicket.add(ticket);
		this.listTicket.add(ticket1);	
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
		this.listTicket.forEach(h -> System.out.println(h));
	}
	public static void main(String[] args) throws ParseException {
		Promotion prB = new PromotionB("20/8/2020", "20/8/2021", "Ve xem phim", "Ve xem ca nhac");
		Promotion prB1 = new PromotionB("20/8/2020", "20/8/2021", "Ve xem phim");
		Promotion prB2 = new PromotionB();
		prB.show();
		prB1.show();
		prB2.show();
	}

	@Override
	public boolean isOutDate() {
		// TODO Auto-generated method stub
		return this.outDate.before(new GregorianCalendar());
	}

	@Override
	public int gift() {
		// TODO Auto-generated method stub
		return 0;
	}

}
