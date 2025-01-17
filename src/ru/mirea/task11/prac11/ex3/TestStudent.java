package ru.mirea.task11.prac11.ex3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента, номер курса, дата рождения (год, месяц, день)");
        String n = sc.next();
        int c = sc.nextInt();
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, sc.nextInt());
        calendar.set(Calendar.MONTH, sc.nextInt()-1);
        calendar.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        Student s = new Student(n, c, calendar.getTime());
        System.out.println("Введите 1 (короткая дата), 2 (средняя) или 3 (полная)");
        System.out.println(s.toString(sc.nextInt()));
        System.out.println(s.toString(1));
        System.out.println(s.toString(2));
        System.out.println(s.toString(3));
    }
}