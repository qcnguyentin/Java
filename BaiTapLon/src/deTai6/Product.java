package deTai6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedHashSet;

public class Product {
	private static int count;
	private int id = ++count;
	private String name;
	private double price;
	private TypeProduct typeProduct;
	private List<Promotion> listPromotion = new ArrayList<>();
	private LinkedHashSet<Promotion> check = new LinkedHashSet<Promotion>();

	// khoi tao san pham
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
			} catch (InputMismatchException ex) {
				System.err.println("==Nhap sai gia tri!==");
				Promotion.sc.nextLine();
			}
		} while (true);
		Promotion.sc.nextLine();

		do {
			try {
				System.out.printf("Chon loai san pham:\n1. LapTop\n2. Dien thoai\n3. May tinh bang\n"
						+ "4. Chuot\n5. Tai nghe\n");
				chose = Promotion.sc.nextInt();
				if (chose < 6 && chose > 0) {
					break;
				}
			} catch (InputMismatchException ex) {
				System.err.println("==Nhap sai gia tri!==");
				Promotion.sc.nextLine();
			}
		} while (true);
		Promotion.sc.nextLine();
		TypeProduct tp = null;
		switch (chose) {
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
			tp = TypeProduct.CHUOT;
			break;
		case 5:
			tp = TypeProduct.TAI_NGHE;
			break;
		}

		this.name = name;
		this.price = price;
		this.typeProduct = tp;
	}

	public int compare(Product p) {
		int a = this.countPromIsOnDate();
		int b = p.countPromIsOnDate();
		return (a < b) ? 1 : (a > b) ? -1 : 0;
	}

	public int countPromIsOnDate() {
		int promIsOnDate = 0;
		for (Promotion x : listPromotion) {
			if (!x.isOutDate())
				promIsOnDate++;
		}
		return promIsOnDate;
	}

	// them san pham
	public void addPromotion(Promotion p) {
		if (this.check.add(p))
			this.listPromotion.add(p);
	}

	// xoa san pham
	public void delPromotion() {// xoapro het han
		this.listPromotion.stream().filter(h -> h.isOutDate()).collect(Collectors.toList())
				.forEach(p -> this.listPromotion.remove(p));
	}

	// xuat san pham
	public void show() {
		// TODO Auto-generated method stub
		int percent_Minus = 0;
		Class<?> promA;
		try {
			promA = Class.forName("deTai6.PromotionA");
			List<Promotion> check = this.listPromotion.stream().filter(p -> promA.isInstance(p) && !p.isOutDate())
					.collect(Collectors.toList());
			if (!check.isEmpty()) {
				for (Promotion x : check)
					percent_Minus += x.gift();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		}
		System.out.printf("+ Ma san pham: %d\n", this.id);
		System.out.printf("Ten san pham: %s\n", this.name);
		System.out.printf("Gia san pham: %.1f\n", this.price - (this.price * percent_Minus / 100));
		System.out.printf("Danh muc san pham: %s\n", this.typeProduct);
	}

	public void viewProm() {
		System.out.println("==DANH MUC CAC KHUYEN MAI==");
		this.listPromotion.forEach(l -> l.show());
		System.out.println();
	}

	// getter && setter
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