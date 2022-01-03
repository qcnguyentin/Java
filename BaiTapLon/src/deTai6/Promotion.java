package deTai6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

abstract class Promotion {
	
	public static SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
	
	public static Scanner sc = new Scanner(System.in);
	
	public abstract void show() ;
	
	public abstract String getId() ;
	
	public abstract Date getOnDate();
	
	public abstract void setOnDate(Date onDate);
	
	public abstract Date getOutDate();
	
	public abstract void setOutDate(Date outDate);
	
	//gift -> ? void
}
