package ru.mirea.task4.Prac4.Matrix;

import java.io.IOException;

public class TestMatrix {
    public static void main(String[] args) throws IOException {

        Matrix a = new Matrix(4, 4);
        a.fillRandom();
        a.print("A");

        Matrix b = new Matrix(4,4);
        b.fillRandom();
        b.print("B");

        Matrix c = a.add(b);
        c.print("C = A + B");

        Matrix d = c.multiply(5);
        d.print("D = C * 5");

    }
}
