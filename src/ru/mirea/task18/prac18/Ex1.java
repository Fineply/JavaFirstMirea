package ru.mirea.task18.prac18;

public class Ex1 {
    public void exceptionDemo() {
        try
        {
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.exceptionDemo();
    }
}