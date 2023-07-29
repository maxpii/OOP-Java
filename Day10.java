public class Day10 {
    public static void main(String[] args) {
        Manager boss  = new Manager("Carl Cracker",80000,1987,12,15, new StringBuilder(""));
        boss.setBonus(5000);
        var staff = new Employee[3]; // using var is better?
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",50000,1989,1,1);
        staff[2] = new Employee("Harry Hacker",50000,1989,1,1);
        for (Employee e : staff) {
            System.out.println(e.getName());
            printSalary(e);
        }
        System.out.println(boss.getBonus());
    }
    public static void printSalary(Employee e) {
        // Manager m = (Manager) e; dangerous because someone can just pass in a normal employee
        if (e instanceof  Manager m) { // if it is a manager, we want to treat it like a manager. Saftey line. Also, we are only defining m
            System.out.println("This employee has " + m.getSalary() + " salary and a " + m.getBonus() + " bonus.");
        }
        else {
            System.out.println("This employee has " + e.getSalary() + " and no bonus.");
        }

    }
}
