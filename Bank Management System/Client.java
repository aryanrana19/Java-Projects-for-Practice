import java.util.ArrayList;

public class Client {
    private int clientId;
    private String name;
    private ArrayList<Account> accountList;

    public Client(int clientId, String name){
        this.clientId = clientId;
        this.name = name;
        this.accountList = new ArrayList<>();
    }

    // =======================================
    // GETTERS
    // =======================================

    // Get clientId
    public int getClientId(){
        return clientId;
    }

    // Get Name
    public String getName(){
        return name;
    }

    // Get Accounts
    public ArrayList<Account> getAccountList(){
        return new ArrayList<>(accountList);
    }

    // ADD ACCOUNT
    public void addAccount(Account account){
        accountList.add(account);
    }

}
