/*
package ru.mirea.task3.Prac3.ValueConvert;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
public class Convert {
    public static void main(String[] args) {
        System.out.println("Введите количество денег = ");
        Scanner s = new Scanner(System.in);
        double number = s.nextInt();
        Locale locFR = new Locale("fr");
        Locale.setDefault(Locale.CHINA);
        NumberFormat numberFormat1 = NumberFormat.getInstance();
        System.out.println("Число в текущей локали: " + numberFormat1.format(number));
        NumberFormat numberFormat2 = NumberFormat.getInstance(Locale.US);
        System.out.println("Число в китайской локали: " + numberFormat2.format(number*0.11425));
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance();
        System.out.println("Денежная единица в текущей локали: " + numberFormat3.format(number));
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Денежная единица во французской локали: " + numberFormat4.format(number*0.016039));
        Locale locITA = new Locale("ita");
        Locale.setDefault(Locale.ITALIAN);
        NumberFormat numberFormat7 = NumberFormat.getInstance();
        System.out.println("Число в текущей локали: " + numberFormat7.format(number));
        NumberFormat numberFormat8 = NumberFormat.getInstance(Locale.US);
        System.out.println("Число в Британской локали: " + numberFormat8.format(number*0.014213));
        NumberFormat numberFormat9 = NumberFormat.getCurrencyInstance();
        System.out.println("Денежная единица в Итальянской локали: " + numberFormat9.format(number*73.10));
    }
}

 */
