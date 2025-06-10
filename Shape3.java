class Shape {                                   //dynamic binding
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * 5 * 5));
    }
}

class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (4 * 6));
    }
}

public class Shape3 {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.area();

        shape = new Rectangle();
        shape.area();
    }
}