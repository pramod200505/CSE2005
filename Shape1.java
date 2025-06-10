abstract class Shape {     //overide method using abstract class.
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length = 4, breadth = 6;

    @Override
    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();
    }
}