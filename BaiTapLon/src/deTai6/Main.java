package deTai6;

import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws ParseException, ClassNotFoundException {
//		Product p1 = new Product("ASUS A01", 20000000, TypeProduct.LAPTOP);
//		Product p2 = new Product("Iphone XSMAX", 15000000, TypeProduct.DIEN_THOAI);
//		Product p3 = new Product("P90", 1800000, TypeProduct.TAI_NGHE);
//		Product p4 = new Product("Macbook M1", 40000000, TypeProduct.LAPTOP);
//		Product p5 = new Product("LOGITECH", 3000000, TypeProduct.CHUOT);
//		
//		Promotion pr1 = new PromotionA("13/12/2020", "13/1/2022", 20);//het
//		Promotion pr2 = new PromotionB("14/1/2022", "14/02/2022", "Ve xem phim");
//		Promotion pr3 = new PromotionC("1/1/2022", "3/1/2022", 20, p1);//het
//		Promotion pr4 = new PromotionA("1/1/2022", "7/2/2022", 30);
//		Promotion pr5 = new PromotionC("8/1/2020", "8/3/2022", 30, p4);
//		Promotion pr6 = new PromotionB("1/1/2021", "1/3/2022", "Ve xem phim", "Ve ca nhac");
//		
//		p1.addPromotion(pr1);
//		p1.addPromotion(pr2);
//		
//		p2.addPromotion(pr1);
//		p2.addPromotion(pr3);
//		p2.addPromotion(pr6);
//		
//		p3.addPromotion(pr4);
//		p3.addPromotion(pr5);
//		
//		p4.addPromotion(pr1);
//
//		p5.addPromotion(pr4);
//		p5.addPromotion(pr5);
//		p5.addPromotion(pr6);

		PromotionManagement pm = new PromotionManagement();
//		
//		pm.addProd(p1);
//		pm.addProd(p2);
//		pm.addProd(p3);
//		pm.addProd(p4);
//		pm.addProd(p5);
		pm.menu();
	}
}
