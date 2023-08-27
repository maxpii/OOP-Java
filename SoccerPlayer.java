public class SoccerPlayer extends Person implements Sportable{

    private int dribbling;
    private int shooting;
    private int passing;
    private int speed;
    public String getDescription() {
        return "I am " + this.getName() + ", a soccer player.";
    }
    public void jump() {
        System.out.println("Jumping to head the ball");
    }
    public void sprint() {
        System.out.println("Sprinting to intercept the pass");
    }
    public void goToGym() {
        System.out.println("Building strong, powerful legs");
        this.speed += 5;
    }
    public void doTechnicalTraining() {
        System.out.println("Improving my dribbling, shooting, and passing");
        this.dribbling+=5;
        this.passing+=5;
        this.shooting+=5;
    }
    public SoccerPlayer(String name) {
        super(name);
    }
    public SoccerPlayer() {

    }
    public SoccerPlayer(String name, int dribbling, int shooting, int passing,int speed) {
        super(name);
        this.dribbling = dribbling;
        this.shooting = shooting;
        this.passing = passing;
        this.speed = speed;
    }
}
