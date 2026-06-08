/** @author <Tatia Idukashvili> */

package homework5;

public class PasswordChecker {
    public static boolean isStrong(String password) {
        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
        }

        return password.length() >= 8 && hasDigit && hasUpper;
    }

    public static void main(String[] args) {
        System.out.println(isStrong("Hello123"));
        System.out.println(isStrong("Hello"));
        System.out.println(isStrong("HELLO123"));
    }
}