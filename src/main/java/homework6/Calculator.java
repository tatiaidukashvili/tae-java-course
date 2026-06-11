/** @author <Tatia Idukashvili> */
package homework6;

public class Calculator {
    public double calculate(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                }
                return Double.NaN;

            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.calculate(10, 3, '+'));

        System.out.println(calc.calculate(8, 7, '-'));

        System.out.println(calc.calculate(9, 8, '*'));

        System.out.println(calc.calculate(15, 3, '/'));

        System.out.println(calc.calculate(10, 0, '/'));
    }
}