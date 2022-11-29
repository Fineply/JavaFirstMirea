package ru.mirea.task14.prac14;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String text;
        System.out.println("Введите текст, который нужно разделить на составные части: ");
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        String[] results = text.split("\\W+");
        System.out.println(Arrays.toString(results));
    }
}