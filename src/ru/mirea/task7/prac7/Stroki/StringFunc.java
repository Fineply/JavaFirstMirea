package ru.mirea.task7.prac7.Stroki;

public class StringFunc implements StringInt{
    @Override
    public int length(String str) {
        return str.length();
    }

    @Override
    public String revers(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < str.length(); i++) rev.insert(0, str.charAt(i));
        return rev.toString();
    }

    @Override
    public String oddString(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) if (i % 2 != 0) res.append(str.charAt(i));
        return res.toString();
    }
}