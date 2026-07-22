import java.util.*;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next().toLowerCase();
        Shape shape;

        if (type.equals("circle")) {
            double radius = sc.nextDouble();
            shape = new Circle(radius);
        } else {
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            shape = new Rectangle(length, width);
        }

        System.out.printf("%.2f", shape.area());
    }
}