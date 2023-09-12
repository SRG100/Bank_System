public class BankCard // Creating a class BankCard
{
    //declaring 5 variables using private accsess modifier.
    private int  cardID;
    private String ClientName;
    private String issuerbank;
    private String BankAccount;
    private int BalanceAmount;
    
    //Creating Constructor of BankCard
    public BankCard(int  cardID ,String BankAccount,String issuerbank, int BalanceAmount)
    {
        ClientName=""; // initializing ClientName as empty string 
        this.cardID= cardID;
        this.issuerbank=issuerbank;
        this.BankAccount=BankAccount;
        this.BalanceAmount=BalanceAmount;
    }
    
    //Creating ascessor method
    public  int  getCardID()
    {
        return this.cardID;
    }
    
    public String getClientName()
    {
        return this.ClientName;
    }
    
    public  String getIssuerbank()
    {
        return this.issuerbank;
    }
    
    public String getBankAccount()
    {
        return this.BankAccount;
    }
    
    public int getBalanceAmount()
    {
        return this.BalanceAmount;
    }
    
    //Creating mutator method for ClientName and BalanceAmount
    public void setClientName(String ClientName)
    {
        this.ClientName= ClientName;
    }
    
     public void setBalanceAmount(int BalanceAmount)
    {
        this.BalanceAmount= BalanceAmount;
    }
    
    //Creating display() method to display details of BankCard
    public void display()
    {
        if (ClientName.equals(""))
        {
            System.out.println("The Client Name has not been assigned.");
        }
        else
        {
            System.out.println("The Card ID is "+ cardID);
            System.out.println("The Client Name is "+ ClientName);
            System.out.println("The Issuer Bank is "+ issuerbank);
            System.out.println("The Bank Account number is "+ BankAccount);
            System.out.println("The Balance Amount is "+ BalanceAmount);
        }
    }
}