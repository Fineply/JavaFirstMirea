package ru.mirea.task5.Prac5.photo;

public class Phototest {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0;i < args.length;i++){
            s = s + args[i];
        }
        Photo w = new Photo(s);
        w.setVisible(true);
    }
}

