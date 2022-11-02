
package ru.mirea.task2.second;
public class Ball {
    String color;
    String Company;

    public Ball(String color, String Company) {
        this.color = color;
        this.Company = Company;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", Company='" + Company + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Ball ball = new Ball("Red", "Adidas");
        Ball bal = new Ball("Blue", "Demix");
        Ball ba = new Ball("Yellow", "Puma");
        System.out.println(ball);
        System.out.println(bal);
        System.out.println(ba);
    }
}
