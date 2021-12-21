package deTai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromotionManagement {
	private List<Promotion> listProm = new ArrayList<>();
	private List<Product> listProd = new ArrayList<>();
	
	//them san pham
	public void addProd(Product p) {
		this.listProd.add(p);
	}
	
	//them san pham khong tham so
	public void addProd() {
		try (Scanner sc = new Scanner(System.in)) {
			int chose;
			System.out.printf("Nhap ten san pham: ");
			String name = sc.nextLine();
			System.out.printf("Nhap gia san pham: ");
			double price = sc.nextDouble();
			sc.nextLine();
			do {
			System.out.printf("Chon loai san pham:\n1. LapTop\n2. DienThoai\n3. MayTinhBang\n");
			chose = sc.nextInt();
			}while(chose <= 0 && chose >= 4);
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
			}
			this.listProd.add(new Product(name, price, tp));
		}
	}
	
	public List<Promotion> promXOnDate(int x) {
		//kiem tra cac khuyen mai con x ngay
		
		return null;
	}
	
	public List<Promotion> promCheck() {
		//kiem tra cac khuyen mai het hieu luc
		
		return null;
	}
	
	public void hienThi() {
		for(Product x: listProd)
			System.out.println(x);
	}
	
	public void checkPromListOf(int id) {
		
	}
	
	public void checkPromListOf(String name) {
		
	}
	
	public void checkProdListOf(Promotion p) {
		
	}
	
	public List<Product> sortProd() {
		return null;
	}
	
	
	public List<Promotion> getListProm() {
		return listProm;
	}
	public void setListProm(List<Promotion> listProm) {
		this.listProm = listProm;
	}
	public List<Product> getListProd() {
		return listProd;
	}
	public void setListProd(List<Product> listProd) {
		this.listProd = listProd;
	}
	
	
}
