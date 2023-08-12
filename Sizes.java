public enum Sizes {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");
    private String abbr;
    private Sizes(String abbr) { // private is redundant because Enum constructors are already private
        this.abbr = abbr;
    }
    public String getAbbrreviation() {
        return this.abbr;
    }

}
