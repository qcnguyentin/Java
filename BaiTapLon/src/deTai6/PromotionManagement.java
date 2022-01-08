package deTai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PromotionManagement {
	private List<Promotion> listProm = new ArrayList<>();
	private List<Product> listProd = new ArrayList<>();
	
	//them san pham
	public void addProd(Product p) {
		this.listProd.add(p);
	}
	
	//them san pham khong tham so
	public void addProd() {
		this.listProd.add(new Product());
	}
	
	public List<Product> search(String name) {
		return this.listProd.stream().filter(p -> p.getName().contains(name) == true).collect(Collectors.toList());
	}
	
	public List<Product> searchProm(String kindOfProm) throws ClassNotFoundException{
		Class myClass = Class.forName(kindOfProm);
		return this.listProd.stream().filter(p -> p.getListPromotion().stream().anyMatch(pr -> 
		myClass.isInstance(pr))).collect(Collectors.toList());
		
	}
	
	
	public List<Product> search(double priceHead, double priceTail) {
		return this.listProd.stream().filter(p -> p.getPrice() >= priceHead && p.getPrice() <= priceTail).collect(Collectors.toList());
	}
	
//	public List<Product> search(String name) {
//		return this.listProd.stream().filter(p -> p.getPrice() >= priceHead && p.getPrice() <= priceTail).collect(Collectors.toList());
//	}
	
	public List<Promotion> promXOnDate(int x) {
		//kiem tra cac khuyen mai con x ngay
		
		return null;
	}
	
	public List<Promotion> promCheck() {
		//kiem tra cac khuyen mai het hieu luc
		
		return null;
	}
	
	public void show() {
		for(Product x: listProd)
			x.show();
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
