package deTai6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	private static int count;
	private int id = ++count;
	private String name;
	private double price;
	private TypeProduct typeProduct;
	private List<Promotion> listPromotion = new ArrayList<>();
	
	//khoi tao san pham
	public Product(String n, double p, TypeProduct t) {
		this.name = n;
		this.price = p;
		this.typeProduct = t;
	}
	public Product() {
		int chose = 0;
		System.out.printf("Nhap ten san pham: ");
		String name = Promotion.sc.nextLine();
		double price;
		do {
			try {
				System.out.printf("Nhap gia san pham: ");
				price = Promotion.sc.nextDouble();
				break;
			} catch(InputMismatchException ex) {
				System.err.println("DITMEMAYNGUVAILOLTAOBAONHAPTIENNOLASODEOPHAICHU");
				Promotion.sc.nextLine();
			}
		} while(true);
		Promotion.sc.nextLine();
		
		do {
			try {
				System.out.printf("Chon loai san pham:\n1. LapTop\n2. DienThoai\n3. MayTinhBang\n"
						+ "4. CHUOT\n5. TAI NGHE\n");
				chose = Promotion.sc.nextInt();
				if(chose < 6 && chose >0) {
					break;
				}
			} catch(InputMismatchException ex) {
				System.err.println("DITMEMAYNGUVAILOLTAOBAONHAPTIENNOLASODEOPHAICHU");
				Promotion.sc.nextLine();
			}
		} while(true);
		Promotion.sc.nextLine();
		TypeProduct tp = null;
		switch(chose) {
		case 1:
			tp = TypeProduct.LAPTOP;
			break;
		case 2:
			tp = TypeProduct.DIEN_THOAI;
			break;
		case 3:
			tp = TypeProduct.MAY_TINH_BANG;
			break;
		case 4:
			tp = TypeProduct.MOUSE;
		case 5:
			tp = TypeProduct.HEAD_PHONE;
		}
		
		this.name = name;
		this.price = price;
		this.typeProduct = tp;
	}
//	public List<Promotion> search(String kindOfProm) {
//		return this.listPromotion.stream().filter(s -> {
//			try {
//				Class myClass = Class.forName(kindOfProm);
//
//				return myClass.isInstance(s);
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return false;
//		}).collect(Collectors.toList());
//	}
	
	//them san pham
	public void addPromotion(Promotion p) {
		this.listPromotion.add(p);
	}
	
	//xoa san pham
	public void delPromotion() {//xoapro het han
//		list.stream().filter(p->p.)
//		this.listPromotion.stream().filter(h -> h.isOutDate()).collect(Collectors.toList()));
		this.listPromotion.forEach(h ->{
			if(h.isOutDate()) this.listPromotion.remove(h);
		});
//		List<Promotion> list = this.listPromotion.stream().filter(h->h.isOutDate()).collect(Collectors.toList());
	}
	public List<Promotion> xDayToOut(int x){
		return this.listPromotion.stream().filter(h->{
			GregorianCalendar tmp = new GregorianCalendar();
			tmp.add(Calendar.DAY_OF_MONTH, x);
//			if(Promotion.fm.format(tmp.getTime()).equalsIgnoreCase(Promotion.fm.format(h.getOutDate().getTime())))
			if(Promotion.fm.format(tmp.getTime()).compareTo(Promotion.fm.format(h.getOutDate().getTime()))==0)
			return true;
			return false;
		}).collect(Collectors.toList());
//
	}
	//xuat san pham
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("Ma san pham: %d\nTen san pham: %s\nGia san pham: %.1f\nDanh muc san pham: %s\n", 
				this.id, this.name, this.price, this.typeProduct);
	}
	public void viewProm() {
		System.out.println("==DANH MUC CAC KHUYEN MAI==");
		this.listPromotion.forEach(l -> l.show());
		System.out.println();
	}
	//getter && setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public TypeProduct getTypeProduct() {
		return typeProduct;
	}
	public void setTypeProduct(TypeProduct typeProduct) {
		this.typeProduct = typeProduct;
	}
	public List<Promotion> getListPromotion() {
		return listPromotion;
	}
}