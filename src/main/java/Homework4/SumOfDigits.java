/** @author Tatia Idukashvili */

package Homework4;

public class SumOfDigits {
    public static void main(String[] args) {
        int birthYear = 2007;
        int sum = 0;

        while (birthYear > 0) {
            sum += birthYear % 10;
            birthYear /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}