public class Day5 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 100, 11,12,12, new StringBuilder("Great\n"));
        staff[1] = new Employee("Harry Hacker", 100, 11,12,12,new StringBuilder("Great\n"));
        staff[2] = new Employee("Tony Tester", 100, 11,12,12,new StringBuilder("Great\n"));
        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e : staff) {
            e.giveStar();
            System.out.println("Name: " + e.getName());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Hire date: " + e.getHireDay());
            System.out.println("Evaluations: " + e.getEvaluations());
            System.out.println();
        }
        // note: Java is pass by copy; meaning that things done in a method have no lating effect
        // the exception to this is that the copy of a reference value of an object can change the state of the object, but cannot change the reference
        // it cannot make it refer to another object, only change the state
    }
}
