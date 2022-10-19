
package ru.mirea.task3.third;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book() {
        name = "Sprut";
        author = "Frank Norris";
        year = 1901;
    }
    public Book(String Name) {
        name = Name;
        author = "Frank Norris";
        year = 1901;
    }
    public Book(String Name,String Author) {
        name = Name;
        author = Author;
        year = 1901;
    }
    public Book(String Name,String Author,int Year) {
        name = Name;
        author = Author;
        year = Year;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    }
