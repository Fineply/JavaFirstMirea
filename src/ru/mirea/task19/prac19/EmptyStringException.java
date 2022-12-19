package ru.mirea.task19.prac19;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Пустая строка");
    }
}