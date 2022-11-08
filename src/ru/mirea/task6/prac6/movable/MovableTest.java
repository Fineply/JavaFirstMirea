package ru.mirea.task6.prac6.movable;

public class MovableTest {
    public static void main(String[] args) {
        Movable m = new MovablePoint(0, 0, 1, 4);
        System.out.println("Point:\n");
        System.out.println(m);
        m.moveUp();
        m.moveRight();
        System.out.println("Up+Right -> " + m);

        System.out.println("\nCircle:\n");
        m = new MovableCircle(0, 0, 2, 4, 6);
        System.out.println(m);
        m.moveDown();
        m.moveLeft();
        System.out.println("Down+Left -> " + m);
        }
    }

