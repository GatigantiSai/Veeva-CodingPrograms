
import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
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

public class ShapeareausingRun{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();

        Shape s;

        if (type.equals("C")) {
            double r = sc.nextDouble();
            s = new Circle(r);
        } else {
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            s = new Rectangle(l, w);
        }

        System.out.printf("%.2f", s.area());

        sc.close();
    }
}
