package deTai6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Product {
	private static int count;
	private int id = ++count;
	private String name;
	private double price;
	private TypeProduct typeProduct;
	private List<Promotion> listPromotion = new ArrayList<>();
	
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
	
	public void addPromotion(Promotion p) {
		this.listPromotion.add(p);
	}
	
	public void addpromotion() {
		
	}
	
	public void delPromotion(Promotion p) {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ma san pham: %d\nTen san pham: %s\nGia san pham: %.1f\nDanh muc san pham: %s\n", 
				this.id, this.name, this.price, this.typeProduct);
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