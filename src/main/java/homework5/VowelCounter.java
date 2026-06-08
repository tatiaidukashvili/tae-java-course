/** @author <Tatia Idukashvili> */

package homework5;

public class VowelCounter {
    public static int countVowels(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Tatia Idukashvili"));
    }
}