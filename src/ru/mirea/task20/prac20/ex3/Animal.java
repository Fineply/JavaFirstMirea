package ru.mirea.task20.prac20.ex3;

import java.io.Serializable;

public class Animal implements Serializable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}