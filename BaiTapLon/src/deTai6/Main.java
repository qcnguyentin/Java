package deTai6;

import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws ParseException, ClassNotFoundException {
		Product p1 = new Product("ASUS A01", 15000000, TypeProduct.LAPTOP);
		Product p2 = new Product("ASUS A02", 25000000, TypeProduct.LAPTOP);
		Product p3 = new Product("ASUS A03", 35000000, TypeProduct.LAPTOP);
		Promotion pr1 = new PromotionA("11/11/2020", "13/1/2022", 20);
		Promotion pr2 = new PromotionB("11/11/2021", "14/1/2022", "Ve xem phim");//in ra
		Promotion pr3 = new PromotionA("11/11/2020", "13/1/2022", 20);//k in
		Promotion pr4 = new PromotionA("11/11/2020", "15/1/2022", 50);//k in
		Promotion pr5 = new PromotionA("11/11/2020", "15/1/2022", 30);//k in
		p1.addPromotion(pr1);
		p1.addPromotion(pr4);
		p1.addPromotion(pr2);
		p1.addPromotion(pr3);
		p2.addPromotion(pr2);
		p2.addPromotion(pr1);
		p2.addPromotion(pr3);
		p2.addPromotion(pr5);
		p2.addPromotion(pr4);
		p3.addPromotion(pr5);
		p3.addPromotion(pr1);
		PromotionManagement pm = new PromotionManagement();
		pm.addProd(p1);
		pm.addProd(p2);
		pm.addProd(p3);
		pm.menu();


	}
}
