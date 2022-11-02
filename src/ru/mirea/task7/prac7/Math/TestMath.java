package ru.mirea.task7.prac7.Math;

import java.util.Scanner;
    public class TestMath {
        public static void main(String[] args) {
            MathFunc mathfunc = new MathFunc();
            Scanner sc = new Scanner(System.in);
            System.out.printf("Возведение в степень:" + mathfunc.pow(sc.nextDouble(), sc.nextInt()));
            System.out.printf("Модуль" + mathfunc.AbsComplex(sc.nextDouble(), sc.nextDouble()));
            System.out.printf("Длина окружности" + mathfunc.CircleLength(sc.nextDouble()));
        }
    }
