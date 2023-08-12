public class Enums {
    public static void main(String[] args) {
        // learning enumerate classes, which are classes specifically for storing constant values
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY; // day has the value of thursday
        if (day == DaysOfTheWeek.THURSDAY) {
            System.out.println("Wow, Thursday already!");
        }
        // DaysOfTheWeek.values(); // returns array
        for (DaysOfTheWeek d: DaysOfTheWeek.values()) {
            System.out.println(d);
        }
        System.out.println(DaysOfTheWeek.FRIDAY.happiness_level); // I am very happy on Friday

        // DaysOfTheWeek.FRIDAY.happiness_level = 70; not possible because we made the happiness_level field final

        System.out.println(Sizes.EXTRA_LARGE.getAbbrreviation()); // how we would call an Enum method
        System.out.println(Sizes.LARGE.toString()); // toString method inherited from Enum superclass
    }
}
