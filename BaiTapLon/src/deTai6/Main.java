package deTai6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("ASUS A01", 15000000, TypeProduct.LAPTOP);
		Product p2 = new Product("ASUS A02", 25000000, TypeProduct.LAPTOP);
		PromotionManagement pm = new PromotionManagement();
		pm.addProd(p1);
		pm.addProd(p2);
		pm.addProd();
		pm.hienThi();
		System.out.println("##TIM KIEM THEO TEN");
		List<Product> kq = new ArrayList<>();
		kq = pm.search("ASUS");
		kq.forEach(h -> System.out.println(h));
		System.out.println("##TIM KIEM THEO GIA");
		List<Product> kq2 = new ArrayList<>();
		kq2 = pm.search(20000000, 25000000);
		kq2.forEach(h -> System.out.println(h));
		// menu ->
	}
}
