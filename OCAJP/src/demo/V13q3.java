package demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class V13q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date= LocalDate.parse("2014-05-04",DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);

	}

}
