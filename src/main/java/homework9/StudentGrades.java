/** @author <Tatia Idukashvili> */

package homework9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class StudentGrades {
    static HashMap<String, List<Integer>> students = new HashMap<>();

    public static double averageFor(String name) {
        List<Integer> grades = students.get(name);

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public static void main(String[] args) {
        students.put("Anna", new ArrayList<>(Arrays.asList(85, 92, 78, 90)));

        students.put("Beka", new ArrayList<>(Arrays.asList(70, 65, 80, 75)));

        students.put("Cika", new ArrayList<>(Arrays.asList(95, 98, 92, 100)));

        for (String name : students.keySet()) {
            System.out.println(name + ": " + students.get(name) + " avg=" + averageFor(name));
        }
    }
}