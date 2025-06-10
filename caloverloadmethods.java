class Calculator {
    int calculate(int a, int b) {
        return a + b;
    }

    int calculate(int a, int b, boolean isSubtraction) {
        return isSubtraction ? a - b : a * b;
    }

    double calculate(double a, double b) {
        return a / b;
    }
}

public class caloverloadmethods {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.calculate(5, 3));
        System.out.println("Subtraction: " + calc.calculate(5, 3, true));
        System.out.println("Multiplication: " + calc.calculate(5, 3, false));
        System.out.println("Division: " + calc.calculate(10.0, 2.0));
    }
}
