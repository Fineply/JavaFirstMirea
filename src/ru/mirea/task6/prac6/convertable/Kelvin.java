package ru.mirea.task6.prac6.convertable;

public class Kelvin implements Convertable {
    @Override
    public double convert(double temperature) {
        return 273.15 + temperature;
    }
}
