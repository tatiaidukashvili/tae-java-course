/** @author <Tatia Idukashvili> */

package homework7;

public class FullTime extends Employee{
    private double monthlySalary;

    public FullTime(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    public static void main(String[] args) {
        Employee[] team = {
                new FullTime("Anna", 5000),
                new PartTime("Beka", 25, 80)
        };

        for (Employee e : team) {
            e.printInfo();
            System.out.println(e.calculateSalary());
        }
    }
}