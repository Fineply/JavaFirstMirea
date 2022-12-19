package ru.mirea.task21.prac21;

import javax.sql.rowset.serial.SerialStruct;
import java.io.StringBufferInputStream;

public class Prac21 <N>{
    N array[];

    public Prac21(N[] array) {
        this.array = array;
    }

    public N[] getArray() {
        return array;
    }

    public void setArray(N[] array) {
        this.array = array;
    }

    public N getElementByIndex(int index){
        return array[index];
    }

    public void printFirstFive(){
        for (int i = 0; i < 5; i++) {
            if (i >= array.length) return;
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        Integer intArray[] = {1, 4, 5, 3, 2, 0, 9, 7, 6, 8};
        Double doubleArray[] = {1.3, 4.3, 4.8, 2.4, 4.0};
        String stringArray[] = {"abc", "def", "o", "who", "what", "l0"};

        Prac21<Integer> i = new Prac21<>(intArray);
        Prac21<Double> d = new Prac21<>(doubleArray);
        Prac21<String> s = new Prac21<>(stringArray);

        System.out.println(i.getElementByIndex(0));
        System.out.println(d.getElementByIndex(0));
        System.out.println(s.getElementByIndex(0));

        System.out.println("-----------------------------------------------");
        i.printFirstFive();
        System.out.println("-----------------------------------------------");
        d.printFirstFive();
        System.out.println("-----------------------------------------------");
        s.printFirstFive();

    }
}