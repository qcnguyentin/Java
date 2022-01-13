package deTai6;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PromotionManagement {
//	private List<Promotion> listProm = new ArrayList<>();
	private List<Product> listProd = new ArrayList<>();
	
	// them san pham
	public void addProd(Product p) {
		this.listProd.add(p);
	}

	// them san pham khong tham so
	public void addProd() {
		this.listProd.add(new Product());
	}

	public List<Product> search(String name) {
		String tmp = name.toLowerCase();
		return this.listProd.stream().filter(p -> p.getName().toLowerCase().contains(tmp)).collect(Collectors.toList());
	}

	public List<Product> searchProm(String kindOfProm) throws ClassNotFoundException {
		Class<?> myClass = Class.forName(kindOfProm);
		return this.listProd.stream().filter(p -> p.getListPromotion().stream().anyMatch(pr -> myClass.isInstance(pr)))
				.collect(Collectors.toList());

	}

	public List<Product> search(double priceHead, double priceTail) {
		return this.listProd.stream().filter(p -> p.getPrice() >= priceHead && p.getPrice() <= priceTail)
				.collect(Collectors.toList());
	}

	public List<Promotion> promXOnDate(int x) {
		List<Promotion> listResult = new ArrayList<Promotion>();
		LinkedHashSet<Promotion> check = new LinkedHashSet<Promotion>();
		this.listProd.forEach(p -> p.xDayToOut(x).forEach(h -> {
			if (check.add(h))
				listResult.add(h);
		}));
		return listResult;
	}

	public void delOutDateProm() {
		// kiem tra cac khuyen mai het hieu luc
		this.listProd.forEach(p -> p.delPromotion());
	}

	public void show() {
		for (Product x : listProd) {
			x.show();
			x.viewProm();
		}
	}

	public void sortProd() {
		this.listProd.sort((h1, h2) -> h1.compare(h2));
	}

	public List<Product> getListProd() {
		return listProd;
	}

	public void setListProd(List<Product> listProd) {
		this.listProd = listProd;
	}

	public boolean viewProm(int id) {// ma
		List<Product> ans = this.listProd.stream().filter(p -> p.getId() == id).collect(Collectors.toList());
		if (!ans.isEmpty()) {
			ans.forEach(p -> p.viewProm());
			return true;
		}
		return false;
	}

	public boolean viewProm(String name) {// ten
		List<Product> ans = this.listProd.stream().filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
				.collect(Collectors.toList());
		if (!ans.isEmpty()) {
			ans.forEach(p -> p.viewProm());
			return true;
		}
		return false;
	}

	public void menu() throws ClassNotFoundException, NumberFormatException, ParseException {
		boolean exit = false;
		while (!exit) {
			System.out.println("====QUAN LY====");
			System.out.print("1. Them san pham\n" + "2. Tim kiem\n" + "3. Them khuyen mai\n"
					+ "4. Xoa khuyen mai het han\n" + "5. Nhap so ngay kiem tra khuyen mai sap het han\n"
					+ "6. Hien thi thong tin khuyen mai\n" + "7. Tra cuu san pham theo khuyen mai\n"
					+ "8. Sap xep san pham\n" + "9. Thoat\n" + "Chon: ");
			int chose = Integer.parseInt(Promotion.sc.nextLine());
			switch (chose) {
			case 1: {
				this.listProd.add(new Product());
				System.out.println("+ Them thanh cong");
				System.out.println();
				break;
			}
			case 2: {
				System.out.print("1. Tim kiem theo ten\n" + "2. Tim kiem theo khoang gia chi dinh\n"
						+ "3. Tim kiem theo loai khuyen mai\n" + "Chon: ");
				chose = Integer.parseInt(Promotion.sc.nextLine());
				while (true) {
					switch (chose) {

					case 1: {
						System.out.println("Nhap ten sp muon tim: ");
						String stringName = Promotion.sc.nextLine();
						this.search(stringName).forEach(p -> p.show());
						break;
					}
					case 2: {
						System.out.println("Tu: ");
						int begin = 0, end = 0;
						begin = Integer.parseInt(Promotion.sc.nextLine());
						System.out.println("Den: ");
						end = Integer.parseInt(Promotion.sc.nextLine());
						List<Product> rs = this.search(begin, end); 
						if(rs.isEmpty())
							System.out.println("+ Khong co san pham!");
						else
							rs.forEach(p -> p.show());
						break;
					}
					case 3: {
						System.out.println("Chon loai khuyen mai\n" + "1. Khuyen mai A\n" + "2. Khuyen mai B\n"
								+ "3. Khuyen mai C\n" + "Chon: ");
						while (true) {
							chose = Integer.parseInt(Promotion.sc.nextLine());
							List<Product> rs;
							switch (chose) {
							case 1: {
								rs = this.searchProm("deTai6.PromotionA");
								if(!rs.isEmpty())
									rs.forEach(h -> h.show());
								else
									System.out.println("+ Khong co san pham");
								break;
							}
							case 2: {
								rs = this.searchProm("deTai6.PromotionB");
								if(!rs.isEmpty())
									rs.forEach(h -> h.show());
								else
									System.out.println("+ Khong co san pham");
								break;
							}
							case 3: {
								rs = this.searchProm("deTai6.PromotionC");
								if(!rs.isEmpty())
									rs.forEach(h -> h.show());
								else
									System.out.println("+ Khong co san pham");
								break;
							}

							}
							if (chose > 0 || chose < 4)
								break;
						}
						break;
					}

					default:
						break;
					}
					if (chose > 0 || chose < 4)
						break;
				}
				System.out.println();
				break;
			}
			case 3: {
				System.out.println("Id \t Name");
				this.listProd.forEach(p -> System.out.println(p.getId() + "\t" + p.getName()));
				System.out.println("Chon san pham theo Id: ");
				chose = Integer.parseInt(Promotion.sc.nextLine());
				boolean isId = true;
				while (true) {
					Promotion p;
					while (true) {
						System.out.println("Chon loai khuyen mai\n" + "1. Khuyen mai A\n" + "2. Khuyen mai B\n"
								+ "3. Khuyen mai C\n" + "Chon: ");
						int chose2 = Integer.parseInt(Promotion.sc.nextLine());
						switch (chose2) {
						case 1:
							p = new PromotionA();
							break;
						case 2:
							p = new PromotionB();
							break;
						case 3:
							p = new PromotionC();
							break;
						default:
							throw new IllegalArgumentException("Unexpected value: " + chose);
						}
						if (chose > 0 || chose < 4)
							break;
					}
					for (Product x : listProd) {
						if (x.getId() == chose) {
							x.addPromotion(p);
							System.out.println("Them thanh cong");
							x.show();
							x.viewProm();
							isId = false;
						}
					}
					if (!isId) {
						break;
					}
				}
				System.out.println();
				break;
			}
			case 4: {
				this.delOutDateProm();
				System.out.println("SUCCESS");
				this.listProd.forEach(h -> h.viewProm());
				System.out.println();
				break;
			}
			case 5: {
				System.out.println("Nhap so ngay: ");
				int x = Integer.parseInt(Promotion.sc.nextLine());
				this.promXOnDate(x).forEach(p -> p.show());
				System.out.println();
				break;
			}
			case 6: {
				System.out.println("Nhap ten hoac ma san pham: ");
				String strIn = Promotion.sc.nextLine();

				try {
					int id = Integer.parseInt(strIn);
					if (!this.viewProm(id))
						System.out.println("Khong tim thay san pham yeu cau\n");
				} catch (NumberFormatException ex) {
					if (!this.viewProm(strIn))
						System.out.println("Khong tim thay san pham yeu cau\n");
					// TODO: handle exception
				}
				System.out.println();
				break;
			}
			case 7: {
				System.out.println("Chon loai khuyen mai\n" + "1. Khuyen mai A\n" + "2. Khuyen mai B\n"
						+ "3. Khuyen mai C\n" + "Chon: ");
				while (true) {
					chose = Integer.parseInt(Promotion.sc.nextLine());
					switch (chose) {
					case 1: {
						this.searchProm("deTai6.PromotionA").forEach(h -> {
							h.show();
							h.viewProm();
						});
						break;
					}
					case 2: {
						this.searchProm("deTai6.PromotionB").forEach(h -> {
							h.show();
							h.viewProm();
						});
						break;
					}
					case 3: {
						this.searchProm("deTai6.PromotionC").forEach(h -> {
							h.show();
							h.viewProm();
						});
						break;
					}

					}
					if (chose > 0 || chose < 4)
						break;
				}
				System.out.println();
				break;
			}
			case 8: {
				this.sortProd();
				System.out.println("Sap xep thanh cong!");
				this.show();
				System.out.println();
				break;
			}
			case 9: {
				exit = true;
				break;
			}
			default:
				break;
			}
		}
	}
}