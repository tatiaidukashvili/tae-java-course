/** @author <Tatia Idukashvili> */

package homework9;

import java.util.List;
import java.util.ArrayList;

public class ListUtilities {
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <T> T getFirst(List<T> list) {
        return list.get(0);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Anna");
        names.add("Eka");
        names.add("Beka");

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        printList(names);
        System.out.println("First: " + getFirst(names));

        printList(numbers);
        System.out.println("First: " + getFirst(numbers));
    }
}