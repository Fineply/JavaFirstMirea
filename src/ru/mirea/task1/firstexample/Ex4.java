package ru.mirea.task1.firstexample;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ex4
{
public static void main(String[] args) {
        short item;
        Scanner in = new Scanner(System.in);
        System.out.print("0 выход из программы\n1-вывод 1 метода\n2-вызов 2 метода\n");
        item = in.nextShort();
        switch (item) {
        case 1:
        mathrandom();
        break;
        case 2:
        random();
        break;
        default:
        System.out.println("конец программы");
        break;


        }
        in.close();

        }


    public static void mathrandom() {
        int[] arr = new int[15];
        System.out.print("Numbers of massiv: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.print("Numbers of sort massiv: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }



    public static void random()
        {
        Random arr=new Random();
        int[]numbers=new int[10];
        System.out.print("Numbers of massiv: ");
        for(int i=0;i<numbers.length;i++){
        numbers[i]=arr.nextInt(100);
        System.out.print(numbers[i]+" ");
        }
        Arrays.sort(numbers);
        System.out.print("Numbers of sort massiv: ");
        for(int j:numbers){
        System.out.print(j+" ");
        }
        }
}
