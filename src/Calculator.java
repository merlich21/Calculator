public class Calculator {

    private static double add(double a, double b) {
        return a + b;
    }

    private static double sub(double c, double d) {
        return c - d;
    }

    private static double mult(double e, double f) {
        return e * f;
    }

    private static double div(double g, double h) {
        return g / h;
    }

    public static double calculate(double op1, double op2, char operation, double res) {

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
                    System.out.println("ERROR: Dividing by Zero");
                    break;
                }
                res = div(op1, op2);
                break;
            default:
                System.out.println("ERROR! WRONG OPERATOR");
        }
        return res;
    }
}
