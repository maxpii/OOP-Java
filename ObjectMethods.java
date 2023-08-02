public class ObjectMethods {
    // methods such as hashCode and toString are methods given to every class by the Object cosmic superclass
    public static void main(String[] args) {
        String s = "Hello";
        String t = "Hello";
        System.out.println("First string's hashcode: " + s.hashCode());
        System.out.println("Second string's hashcode: " + t.hashCode());
        // a hashcode is like an identifier for an object
        // strings have the same hashcode because all strings use the same algorithims to compute their hashcodes
        Employee[] employees = {new Employee("Sally",500,1,1,1), new Employee("Mickey",600,2,2,2), new Employee("Peter",700,3,3,3)};
        for (Employee e : employees) {
            System.out.println(e.getName() + "'s hashcode: " + e.hashCode());
        }
        // our employee's algorithim to compute hashcode:
        //public int hashCode()
        //{
        //return 7 * name.hashCode()
        //+ 11 * Double.valueOf(salary).hashCode()
        //+ 13 * hireDay.hashCode();
        //}
        // the code is based on the name, salary, and hire-day
        // two employees with the same name, salary, and hire-day would have the same hashcode
        // Objects.hash(name, salary, hireDay); combines and computes all the hashCodes specified
        for (int i = 0;i < 1000; i ++) {
            System.out.print("----");
        }
        System.out.println();
        System.out.println("Let's talk about the toString method");
        for (Employee e: employees) {
            System.out.println(e.toString());
        }
        // the to string method is basically a string representation of the class
        // it is a great idea to make it something understandable
        // almost all of them follow the format our Employee toString method does
        // our Employee toString method:
        //public String toString()
        //{
        //return getClass().getName()
        //+ "[name=" + name
        //+ ",salary=" + salary
        //+ ",hireDay=" + hireDay
        //+ "]";
        //}
        Employee e = new Employee("Manu",3421412,1,3,5,new StringBuilder("Why are we paying him so much?!"));
        System.out.println(e); // does the same thing as e.toString()
    }
}
