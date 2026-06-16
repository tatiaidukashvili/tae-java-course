/** @author <Tatia Idukashvili>*/

package homework8;

public class AgeValidator {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("არასწორი ასაკი");
        }

        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            validate(25);
            validate(-5);
            validate(200);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}