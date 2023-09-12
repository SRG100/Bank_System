public class CreditCard extends BankCard // Creating a class CreditCard which is sub class of BankCard
{
    //Declaring 6 Variables using private ascess modifier 
    private int CVCnumber;
    private double CreditLimit;   
    private double InterestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean isGranted = false;
    
    // Creating Constructor of CreditCard
    public CreditCard(int  cardID ,String BankAccount,String issuerbank, int BalanceAmount, String ClientName, int CVCnumber,double InterestRate, String ExpirationDate) 
    {
        super (cardID , BankAccount, issuerbank, BalanceAmount); // calling constructor of bank Card
        setClientName(ClientName);
        this.CVCnumber = CVCnumber;
        this.InterestRate= InterestRate;
        this.ExpirationDate = ExpirationDate;
        isGranted = false; // initializing hasWithdrawn as false
    }
    
    //Creating asscessor methods
    public  int  getCVCnumber()
    {
        return this.CVCnumber;
    }
    
    public  double  getCreditLimit()
    {
        return this.CreditLimit;
    }
    
    public  double  getInterestRate()
    {
        return this.InterestRate;
    }
    
    public  String  getExpirationDate()
    {
        return this.ExpirationDate;
    }
    
    public  int  getGracePeriod()
    {
        return this.GracePeriod;
    }
    
    public  boolean  getisGranted()
    {
        return this.isGranted;
    }
    
    // Creating method to set the CreditLimit
    public void setCreditLimit(double CreditLimit,int GracePeriod)
    {
        if(CreditLimit <= 2.5 * getBalanceAmount() ) // checking if value of CreditLimit  is equal to or less than 2.5 times the BalanceAmount
        {
            isGranted = true; // initialize isGranted as true
            this.CreditLimit = CreditLimit; 
            this.GracePeriod = GracePeriod;
            System.out.println("The credit has been granted.");
        }
        
        else 
        {
            isGranted = false;
            System.out.println("The credit has not been granted to the client.");
        }
    }
    //creating cancelCreditCard() to set CVCnumber,CreditLimit,GracePeriod to false and isGranted to isGranted
    public void  cancelCreditCard()
    {
        CVCnumber = 0;
        CreditLimit = 0;
        GracePeriod = 0;
        isGranted = false;
        System.out.print("Credit Card has been cancelled");
    }
    //Creating display() method to display details of CreditCard
    public void display()
    {
        super.display(); // calling display method of BankCard
        if( isGranted == true) //checking if the value of isGranted is true or not  
        {
            System.out.println("The CVC number is "+ CVCnumber); // the value of CVCnumber
            System.out.println("The Credit Limit is "+ CreditLimit);//the value of CreditLimit
            System.out.println("The Interest Rate is "+ InterestRate);//the value of InterestRate
            System.out.println("The Expiration Date is "+ ExpirationDate);//the value of ExpirationDate
            System.out.println("The GracePeriod is "+ GracePeriod);//the value of GracePeriod
            System.out.println("The Credit has been granted. "+ isGranted);//the value of isGranted
        }
        else
        {
            System.out.println("Your credit has not been granted");
        }
    }
} 