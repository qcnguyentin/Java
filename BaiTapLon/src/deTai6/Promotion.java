package deTai6;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

abstract class Promotion {

	public static SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");

	public static Scanner sc = new Scanner(System.in);

	public abstract void show();

	public abstract int gift();

	public abstract String getId();

	public abstract GregorianCalendar getOnDate();

	public abstract void setOnDate(GregorianCalendar onDate);

	public abstract GregorianCalendar getOutDate();

	public abstract void setOutDate(GregorianCalendar outDate);
	
	public abstract boolean isOutDate();
//	public abstract boolean isXDayLess(int x);
	// gift -> ? void
}
