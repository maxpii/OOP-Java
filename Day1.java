import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        int underscores = 100_2_5; // only to make it prettier to the human eye
        System.out.println(underscores);
        double scientific_notation = 1.73E3;
        float floater = 3.14F;
        System.out.println(scientific_notation);
        System.out.println(Double.POSITIVE_INFINITY); // infinty, very interesting
        System.out.println(2.0-1.1); // weirdo
        System.out.println(Character.isJavaIdentifierPart('a')); // true; can use this in a variable
        System.out.println(Character.isJavaIdentifierStart('5')); // false; cannot start a variable with a number
        int i,j; // two varaibles on the same line
        var greeting = "hello"; // var can infer from the value of the variable what the variable is about
    }
}