public class TestingExercises {
    public static void main(String[] args) {
        /*
        ExPerson person1 = new ExPerson("Muhammad", 15);
        ExPerson person2 = new ExPerson("Hania", 13);
        System.out.println(person1.getName() + " " + person2.getName());
         */
        ExAccount account = new ExAccount("College tuition", 2000);
        ExAccount account2 = new ExAccount();
        account.makeWithdraw(150);
        account.makeDeposit(11);
        //System.out.println(account.getCurrentBalance());
        ExBank bank = new ExBank("Al-Fatha",5);
        bank.addAccount();
        bank.addAccount(account);
        System.out.println("Before: ");
        bank.printAccounts();
        bank.removeAccount(4000);
        System.out.println("After removing: ");
        bank.printAccounts();


    }
}
