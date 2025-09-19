/*

 * Calculator project
 *
 * Version information
 *
 * 19.09.2025
 *
 * author: AlexandSko
 */


/**
 *
 Calculator Class.
 *
 * @version
1.7 19 Sep 2025  * @author
Skotnikov Alexander  */
public class Calculator {

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double c, double d) {
        return c - d;
    }

    private static double multiply(double e, double f) {
        return e * f;
    }

    private static double divide(double g, double h) {
        return g / h;
    }

    public static double calculate(double operand1,
                                   double operand2,
                                   char operator,
                                   double res) {

        switch (operator) {
            case '+':
                res = add(operand1, operand2);
                break;
            case '-':
                res = subtract(operand1, operand2);
                break;
            case '*':
                res = multiply(operand1, operand2);
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("ERROR: dividing by Zero!");
                    break;
                }
                res = divide(operand1, operand2);
                break;
            default:
                System.out.println("ERROR! WRONG OPERATOR!");
        }
        return res;
    }
}
