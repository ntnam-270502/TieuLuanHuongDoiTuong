package com.namnt2008110229;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class LocalDateConverter {
    public static LocalDate stringToDate(String s) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return LocalDate.parse(s, formatter);
		} catch (Exception e) {
			return null;
		}
		
		
	}
	
	
	public static String dateToString(LocalDate date) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String s = formatter.format(date);
			return s;
		} catch (Exception e) {
			return null;
		}
		
	}
}
