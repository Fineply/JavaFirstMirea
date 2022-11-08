package ru.mirea.task6.prac6.convertable;

public class Fahrenheit implements Convertable{
    public double convert(double temperature) {
        return temperature*9/5 + 32;
    }
}