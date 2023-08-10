public abstract class Person {
    private String name = "";
    public String getName(){
        return this.name;
    }
    public Person(String name) {
        this.name = name;
    }
   public Person() {

   }
    public abstract String getDescription();
}
