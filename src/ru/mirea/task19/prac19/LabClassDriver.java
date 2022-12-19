package ru.mirea.task19.prac19;

public class LabClassDriver {
    public static void main(String[] args) throws StudentNotFoundException, EmptyStringException{
        LabClass labClass = new LabClass();
        LabClassUI ui = new LabClassUI(labClass);
        ui.run();
    }
}