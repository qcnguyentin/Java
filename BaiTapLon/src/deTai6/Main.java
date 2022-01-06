package deTai6;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("ASUS A01", 15000000, TypeProduct.LAPTOP);
		PromotionManagement pm = new PromotionManagement();
		pm.addProd(p1);
		pm.addProd();
		pm.hienThi();
		System.out.println("HEL");
		// menu ->
	}
}
