import java.util.Arrays;

public class Comparators {
    public static void main(String[] args) {
        // String of names
        String[] arr = {"Jimmy", "John","Hannah","Emily","Muhammad"};
        String[] arr2 = Arrays.copyOf(arr,arr.length); // copying the first array
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); // sorts by alphabetical order
        // how would we sort if we wanted it in order by length?
        LengthComparator l = new LengthComparator();
        Arrays.sort(arr,l);
        System.out.println(Arrays.toString(arr)); // uses our length comparator classes compare method to compare the strings and sort them
    }
}
