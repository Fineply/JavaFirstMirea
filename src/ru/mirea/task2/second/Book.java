
package ru.mirea.task2.second;

public class Book {
    String name;
    String author;
    int year;
    public Book(String name, String author,int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {

        Book a= new Book("Sprut","Frank Norris",1901);
        Book b= new Book("My Antonia", "Willa Cather",1918);
        Book c = new Book("The Great Gatsby", "Francis Scott Fitzgerald",1925);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
