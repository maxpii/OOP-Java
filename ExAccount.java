public class ExAccount {
    private double current_balance = 0;
    private String account_name = "";
    public double getCurrentBalance() {
        return this.current_balance;
    }
    public String getAccountName() {
        return this.account_name;
    }
    public void makeDeposit(double d) {
        this.current_balance += d;
    }
    public void makeWithdraw(double d) {
        if (this.current_balance < d) {
            System.out.println("Not possible");
        }
        else {
            this.current_balance -= d;
        }
    }
    public ExAccount() {

    }
    public ExAccount(String account_name, double current_balance) {
        this.account_name = account_name;
        this.current_balance = current_balance;
    }
    public String toString() {
        //System.out.println("Account name: " + this.account_name);
        //System.out.println("Balance: " + this.current_balance);
        return "Account name: " + this.account_name + " Balance: " + this.current_balance;
    }
}
