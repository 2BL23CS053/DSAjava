package FlowControlconditioning;
public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '+'; // Change this to '-', '*', or '/' to test other operations

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
