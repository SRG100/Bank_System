public class DebitCard extends BankCard // Creating a class DebitCard which is sub class of BankCard
{
    //declaring variables with private ascessor modifier
    private int PINnumber;
    private int WithdrawalAmount;   
    private String DateOfWithdrawal;
    private boolean hasWithdrawn;
    
    // Creating Constructor of DebitCard
    public DebitCard(int cardID, String BankAccount, String issuerbank,int BalanceAmount, String ClientName,int PINnumber)
    {
        super (cardID , BankAccount, issuerbank, BalanceAmount);  // calling constructor of BankCard
        setClientName(ClientName);
        this.PINnumber = PINnumber;
        hasWithdrawn = false; // initializing hasWithdrawn as false
    }
    //Creating asscessor methods
    public int getPINnumber()
    {
        return this.PINnumber;
    }
    
    public int getWithdrawalAmount()
    {
        return this.WithdrawalAmount;
    }
    
    public String getDateOfWithdrawal()
    {
        return this.DateOfWithdrawal;
    }
    
    public boolean gethasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    
    //creating mutator method for withdrawlAmount
    public void setWithdrawalAmount(int WithdrawalAmount)
    {
        this.WithdrawalAmount=WithdrawalAmount;
    }
    
    //creating withdaw method to withdraw amount and deduct money from balanceAmount
    public void Withdraw(int WithdrawalAmount,String DateOfWithdrawal, int PINnumber)
    {
        if(this.PINnumber==PINnumber) // checking whether instance variable PINnumber has same value as local variable PINnumber
        {
            if( WithdrawalAmount <= getBalanceAmount()) // checking if WithdrawlAmount is smaller or equal to balanceamount 
            {
                hasWithdrawn= true;
                setBalanceAmount(getBalanceAmount() - WithdrawalAmount);
                this.DateOfWithdrawal=DateOfWithdrawal;
                System.out.println("The amount " + WithdrawalAmount + " has been withdrawn Your new balance is " + getBalanceAmount());
                this.WithdrawalAmount= this.WithdrawalAmount + WithdrawalAmount;
            }
            else
            {
                System.out.println("Insufficient Balance Amount");
            } 
        }
        else 
        {
            System.out.println(" Wrong pin number");
        }
    }
    
     // Creating Display method to print details of DebitCard
    public void display()
    {
        if(hasWithdrawn== true)
        {
            super.display();// calling dispay method of BankCard   
            System.out.println("The PIN number   is "+ PINnumber); // Print value of PINnumber
            System.out.println("The Withdrawal Amount is "+ WithdrawalAmount); // Print value of WithdrawalAmount
            System.out.println("The Date Of Withdrawal is "+ DateOfWithdrawal);// Print value of DateOfWithdrawal
            System.out.println("The Amount has been Withdrawn: "+ hasWithdrawn); // Print value of hasWithdrawn
        }
        else        
        {
            super.display();// calling dispay method of BankCard             
        }
    }
}