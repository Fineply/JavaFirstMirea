package ru.mirea.task19.prac19;


public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(){
        super("Студент не найден");
    }
}