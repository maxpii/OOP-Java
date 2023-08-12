public enum DaysOfTheWeek {
    SUNDAY(85),
    MONDAY(10),
    TUESDAY(5),
    WEDNESDAY(15),
    THURSDAY(50),
    FRIDAY(100),
    SATURDAY(90);
    final int happiness_level;
    DaysOfTheWeek(int happiness_level) {
        this.happiness_level = happiness_level;
    }
}
