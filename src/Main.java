import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int     operand1    = scanner.nextInt(); //считывает число
                                                /*Метод next() класса Scanner cчитывает строку,
                                                а метод charAt(0) позволяет взять первый символ в этой строке.
                                                 так мы получаем операцию, которую нужно выполнить*/

        System.out.println("Enter operator: ");
        char    operation   = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        int     operand2    = scanner.nextInt();

        int result = 0;

        result = Calculator
                .calculate(operand1, operand2, operation, result);
        System.out.println("Result = " + result);
    }
}
