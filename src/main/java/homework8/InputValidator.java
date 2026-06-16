/** @author <Tatia Idukashvili>*/

package homework8;

public class InputValidator {
    public static int processAge (String input)
        throws NumberFormatException, IllegalArgumentException {

        int age = Integer.parseInt(input);

        if (age < 0 ) {
            throw new IllegalArgumentException("უარყოფითი ასაკი");
        }

        return age * 12;
    }

    public static void main(String[] args) {
        try {
            System.out.println(processAge("25"));
            System.out.println(processAge("-5"));
            System.out.println(processAge("abc"));
        }
        catch (NumberFormatException e) {
            System.out.println("არ არის რიცხვი");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}