import java.util.Random;

public class Classclass {
    public static void main(String[] args) {
        // the Class class is a is a class that helps give information on all objects
        // every object has a getClass method

        var e  = new Employee("Jello Bello",5423,2008,12,1);
        var m = new Manager("Someone",450,2001,1,1);
        System.out.println(e.getClass());
        System.out.println(m.getClass());
        // e.getClass() returns the Employee class while m.getClass() returns manager
        // Class class is useful if we don't know what class something belongs to

        System.out.println(e.getClass().getName() + " " + e.getName());
        System.out.println(m.getClass().getName() + " " + m.getName());

        var generator = new Random();
        Class cl = generator.getClass(); // can also define this
        String name = cl.getName(); // name is set to
        System.out.println(name);


        // can also work backward
        String className = "java.util.Arrays";
        try {
            Class cl2 = Class.forName(className);
            System.out.println(cl2);

        } catch(ClassNotFoundException error) {
            System.out.println("The " + className + " class does not exist");
        }

    }
}
