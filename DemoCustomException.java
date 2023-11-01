public class DemoCustomException {
    public static class DivisionByZeroException extends Exception  {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) { 
        try {
            int num1 = 10;
            int num2 = 5;

            System.out.println("Addition: " + add(num1, num2));
            System.out.println("Subtraction: " + subtract(num1, num2));
            System.out.println("Multiplication: " + multiply(num1, num2));
            System.out.println("Division: " + divide(num1, num2));
            
            
            num2 = 0;
            System.out.println("Division: " + divide(num1, num2));
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
