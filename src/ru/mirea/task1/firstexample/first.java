/*
package ru.mirea.task1.firstexample;
public class first {
    public static void main(String[] args){
        int[] array = {12,4,3,5,7,1};
        int sum=0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        System.out.println("SUMMA " + sum);
    }

}



package ru.mirea.task1.firstexample;
public class first {
    public static void main(String[] args){
        int[] array = {2,6,5,3,2,5,6};
        int sum=0;
        int i=0;
        while(i< array.length)
        {
            sum += array[i];
            i++;
        }
        System.out.println("SUMMA " + sum);
        }
    }



package ru.mirea.task1.firstexample;
public class first {
    public static void main(String[] args){
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


package ru.mirea.task1.firstexample;
public class first {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}



package ru.mirea.task1.firstexample;
public class first {
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

package ru.mirea.task1.firstexample;
import java.util.Arrays;

public class first {
    public static void main(String[] args) {
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
}

package ru.mirea.task1.firstexample;
import java.util.Random;
import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        Random arr=new Random();
        int[] numbers=new int[10];
        System.out.print("Numbers of massiv: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=arr.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.print("Numbers of sort massiv: ");
        for (int j : numbers) {
            System.out.print(j + " ");
        }
    }
}



package ru.mirea.task1.firstexample;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        int f=1;
        for (int i = 1; i < number; i++, f*=i);
        System.out.println("Факториал = " +f);
    }
}
 */