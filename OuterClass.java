public class OuterClass {
    int num = 6;
    public void heyThere() {
        System.out.println("Hey there");

        // this class can only be used inside this method
        class LocalInnerClass {
            String localInnerClassVariable = "A class inside of a method! That is crazy my dude";

            public void printLocalInnerClassVariable() {
                System.out.println(this.localInnerClassVariable);
            }
        }

        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassVariable();
    }

    public static class InnerClass {
        int inner_num = 8;
        public void whatIsUp() {
            System.out.println("Hello from the inner class");
        }
    }
}
