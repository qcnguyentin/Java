package deTai6;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public class PromotionC extends Promotion{
	private static int count;
	private String id;
	private GregorianCalendar onDate;
	private GregorianCalendar outDate;
	private List<Product> listProd = new ArrayList<>();
	
	{
		id = (String.format("C%04d", ++count));
	}
	
	public PromotionC(String onDate, String outDate) throws ParseException {
		super();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.setGift();
	}
	public PromotionC() throws ParseException {
		// TODO Auto-generated constructor stub
		System.out.println("Nhap ngay tao: ");
		String onDate = Promotion.sc.nextLine();
		System.out.println("Nhap ngay het hieu luc: ");
		String outDate = Promotion.sc.nextLine();
		this.onDate = new GregorianCalendar();
		this.onDate.setTime(fm.parse(onDate));
		this.outDate = new GregorianCalendar();
		this.outDate.setTime(fm.parse(outDate));
		this.setGift();
	}
	
	public void addProd() {
		this.listProd.add(new Product());
	}
	
//	public void showProm(Product p) {
//		Random rd = new Random();
//		int perCent = Math.abs(rd.nextInt(30)) + 10;
//		System.out.print(p.toString());
//		System.out.printf("Giam gia: %d%s\n", perCent, (char) 37);
//	}
	
	@Override
	public void setGift() {
		int n;
		System.out.print("Nhap so luong san pham duoc khuyen mai khi kem: ");
		n = Integer.parseInt(Promotion.sc.nextLine());
		for(int i = 1; i <= n; i++)
		this.addProd();
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
		//show list sp mua kem
		this.listProd.forEach(p -> { 
			Random rd = new Random();
			int perCent = Math.abs(rd.nextInt(30)) + 10;
			p.show();
			System.out.printf("Giam gia: %d%s\n", perCent, (char) 37);
		});
	}
	
	@Override
	public boolean isOutDate() {
		// TODO Auto-generated method stub
		return this.outDate.before(new GregorianCalendar());
	}

	public static void main(String[] args) throws ParseException {
		Promotion pr = new PromotionC("11/11/2020", "11/11/2022");
		pr.show();
	}

	
	
}
