package study;

// Custom checked exception
class WrongOperatorException extends Exception {
    public WrongOperatorException(String message) {
        super(message);
    }
}

public class Calculator {

    public static int calculate(int number1, int number2, String operator) throws WrongOperatorException {
        int result;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0)
                    throw new WrongOperatorException("Division by zero not allowed!");
                result = number1 / number2;
                break;
            case "%":
                if (number2 == 0)
                    throw new WrongOperatorException("Modulo by zero not allowed!");
                result = number1 % number2;
                break;
            default:
                throw new WrongOperatorException("Invalid Operator: " + operator);
        }

        return result;
    }
}
