class Shape {                         //super keyword in overriden methods.
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    @Override
    void display() {
        super.display();
        System.out.println("This is a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void display() {
        super.display();
        System.out.println("This is a Rectangle");
    }
}

public class Shape2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        r.display();
    }
}