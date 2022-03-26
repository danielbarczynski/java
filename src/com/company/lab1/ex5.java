package com.company.lab1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ex5 {
    public static void main(String[] args) {

        System.out.println("Krakow time:");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        System.out.println(dtf.format(localTime));

        System.out.println("Sydney time:");
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime sydney = now.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        System.out.println(dtf.format(sydney));
    }
}
