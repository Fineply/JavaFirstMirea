package ru.mirea.task1.firstexample;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        short item;
        Scanner in = new Scanner(System.in);
        System.out.print("0 выход из программы\n1-вывод 1 метода\n2-вызов 2 метода\n3- вызов  3\n");
        item = in.nextShort();
        switch (item) {
            case 1:
                sort1();
                break;
            case 2:
                sort2();
                break;
            case 3:
                sort3();
                break;
            default:
                System.out.println("конец программы");
                break;


        }
        in.close();

    }




        public static void sort1()
        {
        int[] array = {2, 6, 5, 3, 2, 5, 6};
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        System.out.println("SUMMA " + sum);
    }


        public static void sort2(){
            int[] array = {2,6,5,3,2,5,6};
            int sum=0;
            int i=0;
            do{
                sum += array[i];
                i++;
            }while(i< array.length);
            System.out.println("SUMMA " + sum);
        }



    public static void sort3(){
        int[] array = {2,6,5,3,2,5,6};
        int sum=0;
        int i=0;
        do{
            sum += array[i];
            i++;
        }while(i< array.length);
        System.out.println("SUMMA " + sum);
    }
}


