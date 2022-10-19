package ru.mirea.task1.firstexample;

public class Ex3 {
        public static void main(String args[])
        {
            int num = 10;
            double result = 0.0;
            System.out.println("Гармонический ряд: ");
            for (int i = num; i > 0; i--) {
                result = result + (double)1 / i;
                System.out.print(result + ", ");
            }
        }
    }

