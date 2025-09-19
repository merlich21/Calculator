import java.util.Scanner;

public class Calculator {

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int c, int d) {
        return c - d;
    }

    private static int mult(int e, int f) {
        return e * f;
    }

    private static int div(int g, int h) {
        return g / h;
    }

    public static int calculate( int op1, int op2, char operation, int res ) {

        switch (operation) {
            case '+':
                res = add(op1, op2);
                break;
            case '-':
                res = sub(op1, op2);
                break;
            case '*':
                res = mult(op1, op2);
                break;
            case '/':
                if (op2 == 0) {
                    System.out.println("Error: Dividing by Zero");
                    break;
                }
                res = div(op1, op2);
                break;
            default:
                System.out.println("Wrong operation");
        }
        return res;
    }
}
