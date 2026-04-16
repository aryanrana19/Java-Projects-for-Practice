public abstract class Account {
    private int accountId;
    private Client owner;
    private double balance;

    public Account(int accountId, Client owner){
        this.accountId = accountId;
        this.owner = owner;
        this.balance = 0;
    }

    // GETTERS
    
    // GET ID
    public int getAccountId(){
        return accountId;
    }

    // GET OWNER
    public Client getOwner(){
        return owner;
    }

    // GET BALANCE or CHECK BALANCE
    protected double getBalance(){
        return balance;
    }

    // DEPOSIT MONEY
    public void depositMoney(double money){
        if(money>0){
            balance += money;
        }else{
            System.out.println("Invalid deposit amount");
        }

    }

    // WITHDRAW MONEY
    public abstract boolean withdrawMoney(double money);

    // DEDUCT BALANCE
    protected void deductBalance(double amount){
        balance -= amount;
    }

    // TRANSFER MONEY
    public void transferMoney(Account target, double money){
        boolean success = withdrawMoney(money);
        if(success){
            target.depositMoney(money);
        }else{
            System.out.println("Transfer Failed");
        }
    }

    @Override
    public String toString(){
        return "Account Id: " + accountId + ", Owner: " + owner.getName() + ", Balance: " + balance;
    }


}

class SavingsAccount extends Account{
    private double minimumBalance;
    private double interestRate;

    public SavingsAccount(int accountId, Client owner, double minimumBalance, double interestRate){
        super(accountId, owner);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    @Override
    public boolean withdrawMoney(double money){
        if(getBalance()-money >= minimumBalance){
            deductBalance(money);
            return true;
        }else{
            System.out.println("Minimum Balance requirement violated");
            return false;
        }
    }   
}

class CurrentAccount extends Account{
    private double overdraftLimit;
    
    public CurrentAccount(int accountId, Client owner, double overdraftLimit){
        super(accountId, owner);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdrawMoney(double money){
        if(getBalance() + overdraftLimit >= money){
            deductBalance(money);
            return true;
        }else{
            System.out.println("Overdraft limit exceeded");
            return false;
        }
    }
}