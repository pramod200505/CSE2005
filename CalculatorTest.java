class Calculator {
    int num1, num2;
    String operation;

    Calculator() {
        this.num1 = 0;
        this.num2 = 0;
        System.out.println("Default values set: num1 = 0, num2 = 0");
    }

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Addition result: " + (num1 + num2));
    }

    Calculator(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        performOperation();
    }

    void performOperation() {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Addition result: " + (num1 + num2));
                break;
            case "subtract":
                System.out.println("Subtraction result: " + (num1 - num2));
                break;
            case "multiply":
                System.out.println("Multiplication result: " + (num1 * num2));
                break;
            case "divide":
                if (num2 != 0) {
                    System.out.println("Division result: " + ((double) num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator(); 
        Calculator calc2 = new Calculator(10, 5); 
        Calculator calc3 = new Calculator(10, 5, "multiply"); 
    }
}
