import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable{
    private final String name;
    private double salary = 0;
    private final LocalDate hireDay;
    private StringBuilder evaluations;

    private static int numEmployees = 0;

    public Employee(String name, double salary, int year, int month, int day, StringBuilder evaluations) {
        this.name = Objects.requireNonNullElse(name, "unknown");
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
        this.evaluations = Objects.requireNonNullElse(evaluations, new StringBuilder(""));
        numEmployees++;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = Objects.requireNonNullElse(name, "unknown");
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
        this.evaluations = Objects.requireNonNullElse(evaluations, new StringBuilder(""));
        numEmployees++;
    }


    public Employee() {
        this.name = "";
        this.hireDay = LocalDate.now();
        this.salary = 0;
        numEmployees++;
        this.evaluations = new StringBuilder("");
    }


    public int compareTo(Object otherObject) {
        Employee other = (Employee) otherObject;
        return Double.compare(salary, other.salary); // returns negative value if first argument is smaller, postive if bigger, and 0 if equal
    }
    /**
     * @return number of employees
     */
    public int getNumEmployees() {
        return Employee.numEmployees;
    }

    public String getDescription() {
        return "An employee working for a major company";
    }

    public final String getName() {
        return this.name;
    } // there is no point in changing this

    public double getSalary() {
        return this.salary;
    }

    public void giveStar() {
        evaluations.append(LocalDate.now() + ": Gold star\n");
    }

    public final String getEvaluations() {
        return this.evaluations.toString();
    } // there is no point in changing this

    /**
     * @param n: the percent to raise by
     */
    public void raiseSalary(double n) {
        double raise = this.salary * n / 100;
        this.salary += raise;
    }


    public boolean equals(Object otherObject) {
        // a quick test to see if the objects are identical
        if (this == otherObject) return true; // refer to same thing
        // must return false if the explicit parameter is null
        if (otherObject == null) return false;
        // if the classes don't match, they can't be equal
        if (this.getClass() != otherObject.getClass()) // are both employees
            return false;
        // now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;
        // test whether the fields have identical values
        return name.equals(other.name)
                && salary == other.salary
                && Objects.equals(this.hireDay, other.getHireDay());
    }

    public int hashCode()
    {
        return 7 * name.hashCode()
                + 11 * Double.valueOf(salary).hashCode()
                + 13 * hireDay.hashCode();
    }
       public String toString()
        {
            return getClass().getName()
                    + "[name=" + name
                    + ",salary=" + salary
                    + ",hireDay=" + hireDay
                    + "]";
        }

    public LocalDate getHireDay() {
        return this.hireDay;
    }
}
