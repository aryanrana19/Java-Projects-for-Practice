import java.util.ArrayList;

public class Bank{

    private ArrayList<Client> clientList;
    private ArrayList<Account> accountsList;
    
    
    public Bank(Client owner, Account account){
        clientList = new ArrayList<>();
        accountsList = new ArrayList<>();
    }

    // ADD CLIENTS
    public void addClient(Client client){
        clientList.add(client);
    }

    // ADD ACCOUNTS
    public void addAccount(Account account){
        accountsList.add(account);
    }

    // FIND CLIENT 
    public Client findClient(int id){
        for(Client client: clientList){
            if(client.getClientId()==id){
                return client;
            }
        }
        return null;
    }

    // FIND ACCOUNT
    public Account findAccount(int id){
        for(Account account : accountsList){
            if(account.getAccountId()==id){
                return account;
            }
        }
        return null;
    }

    // CREATE SAVINGS ACCOUNT
    public void createSavingsAccount(int id){
        for(Client client : clientList){
            if(client.getClientId()==id){
                SavingsAccount savingAccount()
            }
        }
    }

}