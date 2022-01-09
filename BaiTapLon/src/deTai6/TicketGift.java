package deTai6;

import java.util.ArrayList;
import java.util.List;
//import java.util.Random;

public class TicketGift {
	private List<String> list = new ArrayList<>();
	{
		this.getList().add("Ve xem phim");
		this.getList().add("Ve xem ca nhac");
		this.getList().add("Ve xem hai");
		this.getList().add("Ve xem xiec");
	}
//	private int[] arr = new int[2];
//	{
//		Random rd = new Random();
//		int[] check = {0,0,0,0};
//		for (int i = 0; i < arr.length; i++) {
//			while(true)
//			{
//				arr[i] = Math.abs(rd.nextInt()%4);
//				if(check[arr[i]]==0) {
//					check[arr[i]] = 1;
//					break;
//				}	
//			}
//		}
//	}
//	public String toString() {
//		return String.format("Danh sach dich vu:\n%s\n%s", list[arr[0]], list[arr[1]]);
//	}
	public static void main(String[] args) {
		TicketGift tk = new TicketGift();
		System.out.println(tk.toString());
	}
	public List<String> getList() {
		return list;
	}
}
