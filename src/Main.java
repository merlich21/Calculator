import java.util.Scanner;

public class Main {

    public static int operandScanner(Scanner scanner, String msg) {

        int res = 0;

        System.out.println(msg);
        try {
            res = scanner.nextInt();
        }
        catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("ERROR! Enter a numeric value (type int)");
        }
        return res;
    }

    public static void checkStop(char ch) {
        if (ch =='S' || ch == 's') {
            System.exit(0);
        }
    }

    public static char operationScanner(Scanner scanner, String msg) {

        char ch = 0;

        System.out.println(msg);
        ch = scanner.next().charAt(0);
        checkStop(ch);

        return ch;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int operand1 = operandScanner(scanner, "Enter first number: ");
        int operand2 = 0;
        int result = 0;
        while (true) {
            char operation = operationScanner(scanner, "Enter operator: ");
            if (operation !='+' && operation != '-'
                    && operation !='*' && operation != '/'
                    && operation !='C' && operation != 'c') {
                System.out.println("ERROR! WRONG OPERATOR!");
                continue;
            }
            if (operation == 'C' || operation == 'c') {
                operand1 = 0;
                result = 0;
                System.out.println("Result = " + result);
                continue;
            }
            operand2 = operandScanner(scanner, "Enter second number: ");

            result = Calculator
                    .calculate(operand1, operand2, operation, result);
            System.out.println("Result = " + result);
            operand1 = result;
        }
    }
}
