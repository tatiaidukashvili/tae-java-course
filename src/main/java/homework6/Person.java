/** @author <Tatia Idukashvili> */

package homework6;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void introduce() {
        System.out.println("მე ვარ " + name + ", " + age + " წლის.");
    }

    public static void main (String[] args) {
        Person p = new Person("თათია", 18, "tidukashvili@credo.ge");

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getEmail());
        p.introduce();
    }
}