/** @author Tatia Idukashvili */

package Homework4;

public class GradeCalculator {
    public static void main(String[] args) {
        int birthMonth = 7;

        if (birthMonth == 12) {
            System.out.println("A");
        }
        else if (birthMonth >= 9 && birthMonth <= 11) {
            System.out.println("B");
        }
        else if (birthMonth >= 6 && birthMonth <= 8) {
            System.out.println("C");
        }
        else if (birthMonth >= 3 && birthMonth <= 5) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}