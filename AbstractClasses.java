public class AbstractClasses {
    public static void main(String[] args) {
        // abstract classes are classes that are not instantiable, but act like a blueprint for other classes
        // Other classes extend them, and implement their abstract methods.
        // Abstract classes can have non-abstract methods, but they still cannot be instantiated
        Person p = new Student("Muhammad", "Computer Science"); // this line works because we are defining student
        // this array does not give an error because we are not defining an instance of person
        // we are defining instances of classes that extend the Person class
        var people = new Person[2];
        people[0]  = new Employee("Sally",5000,2022,3,2);
        people[1] = new Student("Hank", "Architecture");
        for (Person person : people) {
            System.out.println(person.getName());
            System.out.println(person.getDescription());
            System.out.println();
        }
    }
}
