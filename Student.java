public class Student extends Person{
    private String major;
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }
    public String getDescription() {
        return "A student majoring in " + major + ".";
    }
    public String getMajor() {
        return this.major;
    }
}
