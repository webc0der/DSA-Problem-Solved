package com.Datastructure_Alogorithm.problems_solved;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class UnixTimeToLocalDateTime {

	public static void main(String[] args) {

		Long unixTime = 1590914867L;
		ZonedDateTime dateTime = Instant.ofEpochMilli(unixTime*1000L)
	            .atZone(ZoneId.of("GMT+05:30"));
		
		
		Long unixTime1 = 1590914868L;
		ZonedDateTime dateTime1 = Instant.ofEpochMilli(unixTime1*1000L)
	            .atZone(ZoneId.of("GMT+05:30"));
		System.out.println(dateTime.compareTo(dateTime1));
		
		
		System.out.println(dateTime1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z")));
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z")));
		System.out.println(
				ZonedDateTime
				.now(ZoneId.of("GMT+05:30"))
				.minusMinutes(10)
				.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z"))
				);
	}

}
