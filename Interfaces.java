public class Interfaces {
    public static void main(String[] args) {
        // Interface: A set of requirements we can define for a class
        // it looks like a class, but no methods are defined
        // an example is the Comparable interface that has the abstract method compareTo
        // all methods in an interface are declared public by default(what would be the point of declaring the private?).
        // I changed the Employee method to implement the Comparable interface and implemented the compareTo method.
        Comparable x; // cannot say = new Comparable();
        x = new Employee(); // we can set x to something that implements the Comparable interface
        //x = new Person(); not possible because Person does not implement comparable
        // classes can implement multiple interfaces, but only one superclass
        Student s = new Student("Manu", "Interface-design");
        if (s instanceof Comparable) { // false because student does not implement comparable
            System.out.println("The class implements Comparable");
        }

        else {
            System.out.println("This guy isn't comparable");
        }
        // a class that implements the Sportable interface, and implements all the methods in it
        SoccerPlayer messi = new SoccerPlayer("Lionel Messi",100,100,100,85);
        System.out.println(messi.getDescription());
        System.out.println(messi.hasBadLifeStyle());
    }
}
