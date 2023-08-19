public class ReflectionCat {

    // Cat class to use for my reflection example
    private final String name;
    private int age;
    public ReflectionCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int new_age) {
        if (new_age < this.age) {
            System.out.println("Not possible, can't cannot become younger.");
        }
        else {
            this.age = new_age;
        }
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void meow() {
        System.out.println("Meow");
    }
    private void heyThisIsPrivate() {
        System.out.println("How did you get here?");
    }
    public static void thisIsAPublicStaticMethod() {
        System.out.println("I'm public and static!");
    }
    private static void thisIsAPrivateStaticMethod() {
        System.out.println("I'm private and static!");
    }

}
