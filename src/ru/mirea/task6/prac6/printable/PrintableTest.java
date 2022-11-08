package ru.mirea.task6.prac6.printable;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new Book();
        printables[1] = new Shop();

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
