/** @author Tatia Idukashvili */

package Homework4;

public class PrimeCheck {
    public static void main(String[] args) {
        int age = 18;
        boolean isPrime = true;

        for (int i = 2; i <= age / 2; i++) {
            if (age % 1 == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Is Prime");
        }
        else {
            System.out.println("Is Not Prime");
        }
    }
}