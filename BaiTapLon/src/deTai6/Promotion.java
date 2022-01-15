package deTai6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

	public abstract boolean xDayToOut(int x);
}
