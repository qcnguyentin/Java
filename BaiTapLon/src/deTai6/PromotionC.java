package deTai6;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class PromotionC extends Promotion{
	private static int count;
	private String id;
	private int percent;
	private GregorianCalendar onDate;
	private GregorianCalendar outDate;
	private List<Product> listProd = new ArrayList<>();
	
	{
		id = (String.format("C%04d", ++count));
	}
	
	public PromotionC(String onDate, String outDate, int pc) throws ParseException {
		super();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.percent = pc;
		this.gift();
	}
	
	public PromotionC(String onDate, String outDate, int pc, Product p) throws ParseException {
		super();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.percent = pc;
		this.listProd.add(p);
	}
	
	public PromotionC() throws ParseException {
		// TODO Auto-generated constructor stub
		System.out.println("Nhap ngay tao: ");
		String onDate = Promotion.sc.nextLine();
		System.out.println("Nhap ngay het hieu luc: ");
		String outDate = Promotion.sc.nextLine();
		System.out.println("Nhap ti le phan tram giam: ");
		int percent = Integer.parseInt(Promotion.sc.nextLine());
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.percent = percent;
		this.gift();
	}
	
	@Override
	public int gift() {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Nhap so luong san pham duoc khuyen mai khi kem: ");
		n = Integer.parseInt(Promotion.sc.nextLine());
		for(int i = 1; i <= n; i++)
		this.addProd();
		return 0;
	}
	
	public void addProd() {
		this.listProd.add(new Product());
	}
	
	@Override
	public void show() {

		// TODO Auto-generated method stub
		System.out.printf("Ma khuyen mai: %s\n", this.id);
		System.out.printf("Ngay tao: %s\n",fm.format(this.onDate.getTime()));
		System.out.printf("Ngay het han",fm.format(this.outDate.getTime()));
		//show list sp mua kem
		this.listProd.forEach(p -> { 
			p.show();
			System.out.printf("Giam gia: %d%s\n", this.percent, (char) 37);
		});
	}
	
	@Override
	public boolean isOutDate() {
		// TODO Auto-generated method stub
		return this.outDate.before(new GregorianCalendar());
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
	
}
