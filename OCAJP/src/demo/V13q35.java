package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class V13q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2019,9 ,8);
		LocalDate date3=LocalDate.parse("2019-09-08", DateTimeFormatter.ISO_DATE);
		System.out.println("date1=" + date1);
		System.out.println("date2=" + date2);
		System.out.println("date3=" + date3);

	}

}
