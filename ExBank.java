import java.util.ArrayList;
import java.util.HashMap;

public class ExBank {
    private static int total_accounts = 0;
    private static int nextId = 4000;
    private String bankName = "";
    private int rating = -1;
    private HashMap<Integer, ExAccount> accounts = new HashMap<Integer, ExAccount>();
    public static int getTotalAccounts() {
        return ExBank.total_accounts;
    }
    public void removeAccount(int id) {
        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
        }
        else {
            accounts.remove(id);
        }
    }

    public void addAccount(String account_name, double account_balance) {
        accounts.put(nextId, new ExAccount(account_name, account_balance));
        nextId ++;
    }
    public void addAccount() {
        accounts.put(nextId, new ExAccount());
        nextId ++;
    }
    public void addAccount(ExAccount a) {
        accounts.put(nextId, a);
        nextId ++;
    }

    public double getAccountBalance(int id) throws IllegalArgumentException{
        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            throw new IllegalArgumentException("Account does not exist");
        }
        else {
            return accounts.get(id).getCurrentBalance();
        }

    }

    public void printAccounts() {
        System.out.println(this.accounts);
    }

    public String getBankName() {
        return this.bankName;
    }
    public int getRating() {
        return this.rating;
    }
    public ExBank(String bankName, int rating) {
        this.bankName = bankName;
        this.rating = rating;
    }
    public ExBank() {

    }

}
