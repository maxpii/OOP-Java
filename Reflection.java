import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws Exception{
        // Reflection: When a java class can look at itself
        // We can use this to break OOP (access private instances variables and methods)
        // We will use the ReflectionCat class as an example
        // using CodingWithJohn's video
        var cat = new ReflectionCat("Manu",7);
        Field[] catFields = cat.getClass().getDeclaredFields(); // getting the fields as an array
        // things are about to go crazy now
        // myCat.name = "Freddy"; // not possible because name is private
        for (Field f: catFields) {
            // if we find the name field, change it
            if (f.getName().equals("name")) {
                // throws exception. We are not catching it,
                // the main method is just gonna throw an exception now
                f.setAccessible(true); // making the private final into a public
                f.set(cat,"Hanu"); // have to pass in class we are chaning the method of first
            }
        }
        // voila
        System.out.println(cat.getName());

        System.out.println("Doing this for methods now \n\n\n");
        Method[] catMethods = cat.getClass().getDeclaredMethods();
        for (Method method: catMethods) {
            if (method.getName().equals("heyThisIsPrivate")) {
                method.setAccessible(true); // changing the private to public
                method.invoke(cat); // if the meow method took parameters, we would have to add extra parameters here
            }
            if (method.getName().equals("thisIsAPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null); // since static methods don't require an instance, we pass null
            }
        }


    }
}
