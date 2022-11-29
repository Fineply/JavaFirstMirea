package ru.mirea.task11.prac11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        Calendar с = new GregorianCalendar();
        с.setTimeInMillis(System.currentTimeMillis());
        с.add(Calendar.MONTH, -1);

        Date date = с.getTime();
        Date dateNow = new Date();
        System.out.println("Developer: Avdeeva");
        System.out.println("Task received: " + date);
        System.out.println("Task done: " + dateNow);
    }
}