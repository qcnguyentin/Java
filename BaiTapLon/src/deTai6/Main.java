package deTai6;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws ParseException, ClassNotFoundException {
		Product p1 = new Product("ASUS A01", 15000000, TypeProduct.LAPTOP);
		Product p2 = new Product("ASUS A02", 25000000, TypeProduct.LAPTOP);
		Promotion pr1 = new PromotionA("11/11/2020", "11/11/2022", 20);
		Promotion pr2 = new PromotionB("11/11/2021", "11/11/2023");
		Promotion pr3 = new PromotionA("11/11/2020", "11/11/2025", 20);
		p1.addPromotion(pr1);
		p2.addPromotion(pr2);
		p1.addPromotion(pr3);
		PromotionManagement pm = new PromotionManagement();
		pm.addProd(p1);
		pm.addProd(p2);
		pm.show();
		System.out.println("##TIM KIEM THEO TEN");
		List<Product> kq = new ArrayList<>();
		kq = pm.search("ASUS");
		kq.forEach(h -> h.show());
		System.out.println("##TIM KIEM THEO GIA");
		List<Product> kq2 = new ArrayList<>();
		kq2 = pm.search(20000000, 25000000);
		kq2.forEach(h -> h.show());
		List<Product> kq3 = new ArrayList<>();
		kq3 = pm.searchProm("deTai6.PromotionA");
		System.out.println("##TIM KIEM THEO LOAI KHUYEN MAI");
		kq3.forEach(h -> h.show());
		// menu ->
	}
}
