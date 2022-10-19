package ru.mirea.task1.firstexample;
import java.util.Scanner;

    public class Ex5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:");
            int number = sc.nextInt();
            int f=1;
            for (int i = 1; i < number; i++, f*=i);
            System.out.println("Факториал = " +f);
        }
    }

