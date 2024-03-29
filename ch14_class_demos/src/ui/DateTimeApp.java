package ui;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate halloween2019 = LocalDate.of(2019,  10,  31);
		System.out.println("Halloween 2019 = " + halloween2019);
		
		LocalDate Christmas2019 = LocalDate.of(2019,  12,  25);
		System.out.println("Christmans 2019 = " + Christmas2019);
		System.out.println("Christmans Day = " + Christmas2019.getDayOfMonth());
		
		LocalDateTime thanksgiving2019 = LocalDateTime.of(2019,11,28,0,0,0);
		System.out.println("Thanksgiving 2019 = " + thanksgiving2019);
		
		LocalDateTime demoDay2019 = LocalDateTime.parse("2019-12-17T14:00:00");
		System.out.println("Demo Day = " + demoDay2019);
		
		System.out.println("Compare dates/times");
		System.out.println(halloween2019.isBefore(Christmas2019));
		System.out.println(Christmas2019.isBefore(halloween2019));
		
		System.out.println(halloween2019.compareTo(Christmas2019));
		System.out.println(Christmas2019.compareTo(halloween2019));
		
		// adjusters
		
		LocalDate newDate = halloween2019.withMonth(11);
		System.out.println(newDate);
		
		LocalDate date1 = LocalDate.of(2017, 2, 28);
	//	LocalDate newDate1 = date1.withDayOfMonth(29);  // throws exception since no 2/29 in 2017.
		
		// adding & substracting
		// date1 and adjust to current date??
		LocalDate newDate2 = date1.plusYears(2).plusMonths(8).minusDays(6);
		System.out.println(newDate2);
		
		LocalDate newDate3 = date1.plus(32, ChronoUnit.MONTHS);
		System.out.println(newDate3);
		
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println((df.format(newDate2)));
		
		DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println((df2.format(newDate2)));
		
		DateTimeFormatter df3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println((df3.format(newDate2)));
				
		
		
	}

}
