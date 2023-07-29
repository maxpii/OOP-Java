public class Day2 {
    public static void main(String[] args) {
        System.out.println(Math.sin(30.0));
        System.out.println(Math.cos(30.0));
        System.out.println(Math.exp(1)); // 2.71^argument
        System.out.println(Math.log(2.718281828459045)); // ln(), should be very close to 1
        System.out.println(Math.log10(10));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        int x = 10;
        x += 3.5;
        System.out.println(x); // rounded because it is an int, bad practice
        x -= 3.5;
        System.out.println(x); // rounded because it is an int, bad practice
        x = 1;
        int y = x+=4; // x is 5 while y is also 5
        int z = y++;
        // z is y's previous value while y is increased by 1
        // can convert from smaller value type to larger type, such as from a byte to short, or short to int
        // cannot convert from long to int because we would lose data
        // can convert from int to float, with some loss of data, as well as from long to float
        // can convert from int to double without loss of data, and from long to doulbe with some data loss
        int a = 10;
        int b = 12;
        int smaller = a<b ? a : b; // form of condition ? value1: value2
    }
}
