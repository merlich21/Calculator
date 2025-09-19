/*

 * Calculator project
 *
 * Version information
 *
 * 19.09.2025
 *
 * author: AlexandSko
 */


import java.util.Scanner;

public class Main {

    public static double scanOperand(Scanner scanner, String msg) {

        double res = 0;

        System.out.println(msg);
        try {
            res = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("ERROR INPUT! " +
                    "Enter a numeric value (type double)!");
        }
        return res;
    }

    public static void checkStop(char ch) {
        if (ch == 'S' || ch == 's') {
            System.exit(0);
        }
    }

    public static char scanOperator(Scanner scanner, String msg) {

        char ch = 0;

        System.out.println(msg);
        ch = scanner.next().charAt(0);
        checkStop(ch);
        return ch;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double operand1 = scanOperand(scanner, "Enter first number: ");
        double operand2 = 0;
        double result = 0;

        while (true) {
            char operator = scanOperator(scanner, "Enter operator: ");
            if (operator != '+' && operator != '-'
                    && operator != '*' && operator != '/'
                    && operator != 'C' && operator != 'c') {
                System.out.println("ERROR! WRONG OPERATOR!");
                continue;
            }
            if (operator == 'C' || operator == 'c') {
                operand1 = 0;
                result = 0;
                System.out.println("Result = " + result);
                continue;
            }
            operand2 = scanOperand(scanner, "Enter second number: ");
            result = Calculator.
                    calculate(operand1, operand2, operator, result);
            System.out.println("Result = " + result);
            operand1 = result;
        }
    }
}
