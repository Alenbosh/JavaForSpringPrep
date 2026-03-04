package day15;

interface Transactable{
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    String getAccountInfo();
}

abstract class BankAccount implements Transactable {
    private final String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber,String holderName, double initiaBalance)
    {
        if (initiaBalance<0){
            throw new IllegalArgumentException("Initial balance can not be negative!");
        }
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=initiaBalance;
    }

    @Override
    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance+=amount;
        System.out.println("Sucessfully deposited ₹"+amount+", New balance: ₹" + balance);
    }

    @Override
    public abstract void withdraw(double amount);

        @Override
        public double getBalance(){
            return balance;
        }

        public String getAccountNumber(){
            return accountNumber;
        }

        public String getHolderName(){
            return holderName;
        }

    public void setHolderName(String holderName) {
            if (holderName==null || holderName.trim().isEmpty()){
                throw new IllegalArgumentException("Holder name can not be empty!");
            }
        this.holderName = holderName;
    }

    @Override
    public String getAccountInfo(){
            return "Account number: " + accountNumber + "\nHolder: "+holderName+"\nBalance : ₹"+String.format("%.2f",balance);
    }
}

class SavingsAccount extends BankAccount{
    public static final double MINIMUM_BALANCE = 1000.0;

    public SavingsAccount(String accNum, String holder, double initial){
        super(accNum,holder,initial);
        if (initial<MINIMUM_BALANCE){
            throw new IllegalArgumentException("Savings account requires minimum ₹"+MINIMUM_BALANCE);
        }
    }

    @Override
    public void withdraw(double amount){
        if (amount<=0) throw new IllegalArgumentException("Withdrawal amount must be postive!");
        if (balance - amount<MINIMUM_BALANCE){
            throw new IllegalArgumentException("Cannot go below minimum balance ₹"+MINIMUM_BALANCE);
        }
        balance-=amount;
        System.out.println("Withdraw ₹"+amount+". New balance: ₹"+balance);
    }

    @Override
    public String getAccountInfo(){
        return "Type: Savings\n"+super.getAccountInfo();
    }
}

class CurrentAccount extends BankAccount{
    private static final double OVERDRAFT_LIMIT = 5000.0;

    public CurrentAccount(String accNum, String holder,double initial){
        super(accNum,holder,initial);
    }

    @Override
    public void withdraw(double amount){
        if(amount <=0) throw new IllegalArgumentException("Withdrawal amount must be positive!");
        if(balance - amount < -OVERDRAFT_LIMIT){
            throw new IllegalArgumentException("Overdtreaft limit exceeded! Max allowed overdraft: ₹"+OVERDRAFT_LIMIT);
        }
        balance-= amount;
        System.out.println("Withdrew ₹"+ amount+". New balance: ₹"+balance);
    }

    @Override
    public String getAcountInfo(){
        return "Type: Current\n"+super.getAccountInfo();
    }
}