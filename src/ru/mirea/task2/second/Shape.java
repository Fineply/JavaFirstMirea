
package ru.mirea.task2.second;
public class Shape {
    public static void main(String[] args) {
        Circle person = new Circle(5,"Red");
        Triangle per = new Triangle(10,5);
        Square p=new Square(10,10);
        System.out.println(person);
        System.out.println(per);
        System.out.println(p);

    }
}
class Circle {
    private final int radius;
    private final String color;
    public Circle(int R, String c)
    {
        this.radius=R;
        this.color=c;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
class Triangle {
    private final int base;
    private final int height;

    public Triangle(int base, int height)
    {
        this.base=base;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
class Square {
    private final int width;
    private final int height;


    Square(int width,int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

