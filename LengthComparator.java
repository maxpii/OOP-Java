import java.util.Comparator;

public class LengthComparator implements Comparator<String> { // <String> tells the interface we are working with strings
    public int compare(String i, String j) {
        return i.length() - j.length(); // if first string is bigger, return positive num, else negative num. Or zero if equal length
    }
}
