/** @author <Tatia Idukashvili> */

package homework5;

public class NumberClassifier {
    public static String classify(int n) {
        if (n > 0) {
            return "Positive";
        }
        else if (n < 0) {
            return "Negative";
        }

        return "Zero";
    }

    public static String classify(double n) {
        String sign;

        if (n > 0) {
            sign = "Positive";
        }

        else if (n < 0) {
            sign = "Negative";
        }
        else {
            sign = "Zero";
        }

        if (n % 1 == 0) {
            return sign + " Whole double";
        }

        return sign + " Decimal";
    }

    public static void main(String[] args) {
        System.out.println(classify(-5));
        System.out.println(classify(7.0));
        System.out.println(classify(3.14));
    }
}