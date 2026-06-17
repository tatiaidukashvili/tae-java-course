/** @author <Tatia Idukashvili> */

package homework9;

import java.util.HashMap;

public class PhoneBook {
    static HashMap<String, String> phoneBook = new HashMap<>();

    public static String findPhone(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        else {
            return "არ მოიძებნა";
        }
    }

    public static void main(String[] args) {
        phoneBook.put("Tatia", "5551112222");
        phoneBook.put("Anna", "555222333");
        phoneBook.put("Beka", "555666777");
        phoneBook.put("Eka", "5557777888");

        System.out.println(findPhone("Anna"));
        System.out.println(findPhone("WrongName"));

        for (String key : phoneBook.keySet()) {
            System.out.println(key + ": " + phoneBook.get(key));
        }
    }
}