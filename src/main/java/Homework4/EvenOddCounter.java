/** @author Tatia Idukashvili */

package Homework4;

public class EvenOddCounter {
    public static void main(String[] args) {
        int number = 7;

        int even = 0;
        int odd = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}