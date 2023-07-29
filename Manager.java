public class Manager extends Employee {
    private double bonus;

    public void setBonus(double n) {
        this.bonus = n;
    }

    public double getBonus() {
        return this.bonus;
    }

    public double getSalary() {
        return super.getSalary() + this.bonus;

    }

    /**
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     * @param evaluations
     */
    public Manager(String name, double salary, int year, int month, int day, StringBuilder evaluations) {
        super(name, salary, year, month, day, evaluations);
        this.bonus = 0;
    }

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false; // super.equals checked that this and otherObject belong to the same class
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    public Manager() {

    }
}
