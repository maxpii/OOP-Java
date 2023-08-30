public interface Sportable {
    // interface for a person that plays sports


    public void jump();
    public void sprint();
    public void goToGym();
    public void doTechnicalTraining();
    // default method that is already implemented for the user
    // of course an athlete would not have a bad lifestyle, if the athlete does the user could change it
    default boolean hasBadLifeStyle() {
        System.out.println("All athletes have wonderful lifestyles, or they are not athletes");
        return false;
    }

}
