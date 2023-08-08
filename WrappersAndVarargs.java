import java.util.ArrayList;

public class WrappersAndVarargs {
    public static void main(String[] args) {
        // all primative types have their class counterpart
        // int: Integer
        // double: Double
        // float: Float
        // char: Character
        // boolean: Boolean
        // the numerical classes are extensions of the superclass "Number"
        // less efficient than int[] arr because the Integer wrapper class has to convert all ints to the class
        var list = new ArrayList<Integer>(); // cannot do ArrayList<int>
        list.add(3); // same thing as list.add(Integer.valueOf(3)). Called autoboxing
        int n = list.get(0); // same thing as list.get(0).intValue();
        String s = "121";
        int x = Integer.parseInt(s); // using the Integer classe's static parse method

        // methods with a variable number of parameters are sometimes called varargs method
        System.out.println("-------------------------------------------------------------------------");
        // can give different amounts of parameters to the printf method
        System.out.printf("%d \n", n);
        System.out.printf("%d %s \n", n, "pandas");
        // this is how the printf method is defined
        //public class PrintStream
        //{
        //  public PrintStream printf(String fmt, Object... args)
        //  {
        //      return format(fmt, args);
        //  }
        //}
        // Object... args represents variable number of parameters along with the fmt parameter
        // Object... is an Object[]
        System.out.println(min(4,12,5,1));
    }
    public static int min(int... values) {
        // values is the same as int[] values
        int min = values[0];
        for (Integer i : values) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
