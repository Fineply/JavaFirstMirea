package ru.mirea.task7.prac7.Math;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double number, int not) {
        return Math.pow(number, not);
    }

    @Override
    public double AbsComplex(double re, double im) {
        return 0;
    }
    public double CircleLength(double r) {
        return 2*pi*r;
    }
}
