public class InnerClasses {
    public static void main(String[] args) {

        // inner classes: Class inside of a class
        // We use them when we need the functionality of a class, but don't want to define a whole new class
        // Inner Classes can access the private methods of the outer class
        // Inner Classes are pretty rare and there is not much need for them in small programs

        // three types of inner classes
        // non-static
        // static
        // method inner class
        OuterClass outer = new OuterClass();
        outer.heyThere();

        // InnerClass inner = new InnerClass() // does not work
        // we have to use an object of the OuterClass to create an instance of the inner class
        //OuterClass.InnerClass inner = outer.new InnerClass(); // very weired syntax only needed when the inner class is not static

        // static inner classes don't require the need for an instance of the outer class
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.whatIsUp();
    }
}
