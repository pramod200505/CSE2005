class Parent {
    void calculate() {
        System.out.println("Parent class calculation method");
    }
}

class Child extends Parent {
    @Override
    void calculate() {
        System.out.println("Child class performing specific arithmetic operation");
    }
}

public class singleinheritanceoverriding {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.calculate();
    }
}
