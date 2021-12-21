package deTai6;

import java.util.ArrayList;
import java.util.List;

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