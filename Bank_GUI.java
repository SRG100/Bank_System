import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

public class Bank_GUI implements ActionListener {
    //declaring Jframes,JLabel,ComboBox,JTextFields for GUI
    private JFrame main_frame,add_debit_frame,credit_add_frame,withdraw_frame,credit_limit_frame,cancel_credit_frame,display_frame;
    private JButton mainFrame_addDebit_btn,mainFrame_addCredit_btn,mainFrame_Withdraw_btn,mainFrame_SetCredit_btn,mainFrame_CancelCredit_btn,mainFrame_Display_btn;
    private JButton DebitAddBtn,DebitClearBtn,CreditAddBtn,CreditClearBtn,WithDrawBtn,WithDrawCancelBtn,setCreditLimitBtn,ClearCreditLimit,CancelCreditCard,ClearCancelCreditCard,DisplayCreditCard,DisplayDebitCard;
    private JLabel mainFrame_heading,addDebitFrame_heading,addCreditFrame_heading,withdrawFrame_heading,setCreditFrame_heading,cancelCreditFrame_heading;
    private JLabel addDebit_cardID_label,addDebit_BankAccount_label,addDebit_ClientName_label,addDebit_BalanceAmt_label,addDebit_IssuerBank_label,addDebit_PIN_label,addCredit_CardId_label,addCredit_BankAcct_label,addCredit_ClientNamet_label,addCredit_BalanceAmount_label,addCredit_IssuerBank_label,addCredit_CVC_label,addCredit_InterestRate_label,addCredit_ExpirationDate_label,withdraw_CardId_label,withdraw_PIN_label,withdraw_WithdrawalAmt_label,withdraw_DateOfWithdrawal_label,setCredit_CardId_label,setCredit_CreditLimit_label,setCredit_GracePeriod_label,cancelCredit_Info_label,cancelCredit_CardId_label;
    private JTextField addDebit_cardID_text,addDebit_BankAcc_text,addDebit_ClientName_text,addDebit_BalanceAmt_text,addDebit_IssuerBank_text,addDebit_PIN_text,addCredit_CardId_text,addCredit_BankAccount_text,addCredit_ClientName_text,addCredit_BalanceAmount_text,addCredit_issuerbank_text,addCredit_CVCnumber_text,addCredit_InterestRate_text,withdraw_CardId_text,withdraw_PIN_text,withdraw_WithdrawalAmount_text,setCredit_CardId_text,setCredit_CreditLimit_text,cancelCredit_CardId_text,setCredit_graceperiod_text;
    private JComboBox<String> expirationdate_day_cb,expirationdate_month_cb,expirationdate_year_cb,withdrawalDate_Day_cb,withdrawalDate_Month_cb,withdrawalDate_Year_cb;

    //creating array for comboboxs
    String[] Day={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"};
    String[] Month={"Jan","Feb","March","April","May","Jun","Jul"};
    String[] Year={"2004","2005","2006","2007","2008","2009","2010"};

    //creating arraylists
    ArrayList<BankCard> BankCard_AL=new ArrayList<BankCard>();

    public Bank_GUI(){
        //creating main menu frame and adding components
        main_frame=new JFrame("Main Frame");

        mainFrame_heading=new JLabel("Please Select Your Purpose");

        mainFrame_addDebit_btn=new JButton("Add Debit Card");
        mainFrame_addCredit_btn=new JButton("Add Credit Card");
        mainFrame_Withdraw_btn=new JButton("Withdraw");
        mainFrame_SetCredit_btn=new JButton("Set Credit Limit");
        mainFrame_CancelCredit_btn=new JButton("Cancel Credit Card");
        mainFrame_Display_btn=new JButton("Display");

        mainFrame_heading.setBounds(165,45,306,40);
        mainFrame_addDebit_btn.setBounds(90,148,170,32);
        mainFrame_addCredit_btn.setBounds(90,243,170,32);
        mainFrame_Withdraw_btn.setBounds(90,338,170,32);
        mainFrame_SetCredit_btn.setBounds(339,148,170,32);
        mainFrame_CancelCredit_btn.setBounds(339,243,170,32);
        mainFrame_Display_btn.setBounds(339,338,170,32);

        mainFrame_heading.setFont(new Font("",0,22));

        mainFrame_addDebit_btn.setFont(new Font("",0,16));
        mainFrame_addCredit_btn.setFont(new Font("",0,16));
        mainFrame_Withdraw_btn.setFont(new Font("",0,16));
        mainFrame_SetCredit_btn.setFont(new Font("",0,16));
        mainFrame_CancelCredit_btn.setFont(new Font("",0,16));
        mainFrame_Display_btn.setFont(new Font("",0,16));

        main_frame.add(mainFrame_heading);
        main_frame.add(mainFrame_addDebit_btn);
        main_frame.add(mainFrame_addCredit_btn);
        main_frame.add(mainFrame_Withdraw_btn);
        main_frame.add(mainFrame_SetCredit_btn);
        main_frame.add(mainFrame_CancelCredit_btn);
        main_frame.add(mainFrame_Display_btn);

        //creating add debit frame and adding its components
        add_debit_frame=new JFrame("Add Debit Card");
        addDebitFrame_heading=new JLabel("Add Debit Card");

        addDebit_cardID_label=new JLabel("Card ID:");
        addDebit_BankAccount_label=new JLabel("Bank Account:");
        addDebit_ClientName_label=new JLabel("Client name: ");
        addDebit_BalanceAmt_label=new JLabel("Balance Amount:");
        addDebit_IssuerBank_label=new JLabel("Issuer Bank:");
        addDebit_PIN_label=new JLabel("PIN Number:");

        addDebit_cardID_text=new JTextField();
        addDebit_BankAcc_text=new JTextField();
        addDebit_ClientName_text=new JTextField();
        addDebit_BalanceAmt_text=new JTextField();
        addDebit_IssuerBank_text=new JTextField();
        addDebit_PIN_text=new JTextField();

        DebitAddBtn=new JButton("Add");
        DebitClearBtn=new JButton("Clear");

        addDebitFrame_heading.setBounds(218,35,190,35);
        addDebit_cardID_label.setBounds(66,109,60,22);
        addDebit_BankAccount_label.setBounds(66,201,120,22);
        addDebit_ClientName_label.setBounds(66,307,120,22);
        addDebit_BalanceAmt_label.setBounds(304,109,120,22);
        addDebit_IssuerBank_label.setBounds(304,201,120,22);
        addDebit_PIN_label.setBounds(304,307,120,22);

        addDebit_cardID_text.setBounds(66,137,180,32);
        addDebit_BankAcc_text.setBounds(66,234,180,32);
        addDebit_ClientName_text.setBounds(66,334,180,32);
        addDebit_BalanceAmt_text.setBounds(304,137,180,32);
        addDebit_IssuerBank_text.setBounds(304,234,180,32);
        addDebit_PIN_text.setBounds(304,334,180,32);

        DebitAddBtn.setBounds(194,407,170,31);
        DebitClearBtn.setBounds(214,445,120,25);

        addDebitFrame_heading.setFont(new Font("",0,22));

        addDebit_cardID_label.setFont(new Font("",0,16));
        addDebit_BankAccount_label.setFont(new Font("",0,16));
        addDebit_ClientName_label.setFont(new Font("",0,16));
        addDebit_BalanceAmt_label.setFont(new Font("",0,16));
        addDebit_IssuerBank_label.setFont(new Font("",0,16));
        addDebit_PIN_label.setFont(new Font("",0,16));
        DebitAddBtn.setFont(new Font("",0,16));

        add_debit_frame.add(addDebitFrame_heading);
        add_debit_frame.add(addDebit_cardID_label);
        add_debit_frame.add(addDebit_BankAccount_label);
        add_debit_frame.add(addDebit_ClientName_label);
        add_debit_frame.add(addDebit_BalanceAmt_label);
        add_debit_frame.add(addDebit_IssuerBank_label);
        add_debit_frame.add(addDebit_PIN_label);

        add_debit_frame.add(addDebit_cardID_text);
        add_debit_frame.add(addDebit_BankAcc_text);
        add_debit_frame.add(addDebit_ClientName_text);
        add_debit_frame.add(addDebit_BalanceAmt_text);
        add_debit_frame.add(addDebit_IssuerBank_text);
        add_debit_frame.add(addDebit_PIN_text);

        add_debit_frame.add(DebitAddBtn);
        add_debit_frame.add(DebitClearBtn);

        //creating add credit frame and adding its components
        credit_add_frame=new JFrame("Add Credit Card");
        addCreditFrame_heading=new JLabel("Add Credit Card");

        addCredit_CardId_label=new JLabel("Card ID:");
        addCredit_BankAcct_label=new JLabel("Bank Account:");
        addCredit_ClientNamet_label=new JLabel("Client name: ");
        addCredit_BalanceAmount_label=new JLabel("Balance Amount:");
        addCredit_IssuerBank_label=new JLabel("Issuer Bank:");
        addCredit_CVC_label=new JLabel("CVC Number:");
        addCredit_InterestRate_label=new JLabel("Interest Rate:");
        addCredit_ExpirationDate_label=new JLabel("Expiration Date:");

        addCredit_CardId_text=new JTextField();
        addCredit_BankAccount_text=new JTextField();
        addCredit_ClientName_text=new JTextField();
        addCredit_BalanceAmount_text=new JTextField();
        addCredit_issuerbank_text=new JTextField();
        addCredit_CVCnumber_text=new JTextField();
        addCredit_InterestRate_text=new JTextField();

        expirationdate_day_cb=new JComboBox<String>(Day);
        expirationdate_month_cb=new JComboBox<String>(Month);
        expirationdate_year_cb=new JComboBox<String>(Year);

        CreditAddBtn=new JButton("Add");
        CreditClearBtn=new JButton("Clear");

        addCreditFrame_heading.setBounds(218,35,190,35);

        addCredit_CardId_label.setBounds(66,109,60,22);
        addCredit_BankAcct_label.setBounds(66,201,120,22);
        addCredit_ClientNamet_label.setBounds(66,307,120,22);
        addCredit_BalanceAmount_label.setBounds(66,408,120,22);

        addCredit_IssuerBank_label.setBounds(304,109,120,22);
        addCredit_CVC_label.setBounds(304,201,120,22);
        addCredit_InterestRate_label.setBounds(304,307,120,22);
        addCredit_ExpirationDate_label.setBounds(304,408,120,22);

        addCredit_CardId_text.setBounds(66,137,180,32);
        addCredit_BankAccount_text.setBounds(66,234,180,32);
        addCredit_ClientName_text.setBounds(66,334,180,32);
        addCredit_BalanceAmount_text.setBounds(66,434,180,32);

        addCredit_issuerbank_text.setBounds(304,137,180,32);
        addCredit_CVCnumber_text.setBounds(304,234,180,32);
        addCredit_InterestRate_text.setBounds(304,334,180,32);

        expirationdate_day_cb.setBounds(304,434,40,32);
        expirationdate_month_cb.setBounds(354,434,50,32);
        expirationdate_year_cb.setBounds(414,434,70,32);

        CreditAddBtn.setBounds(194,507,170,31);
        CreditClearBtn.setBounds(204,547,120,25);

        addCreditFrame_heading.setFont(new Font("",0,22));
        addCredit_CardId_label.setFont(new Font("",0,16));
        addCredit_BankAcct_label.setFont(new Font("",0,16));
        addCredit_ClientNamet_label.setFont(new Font("",0,16));
        addCredit_BalanceAmount_label.setFont(new Font("",0,16));
        addCredit_IssuerBank_label.setFont(new Font("",0,16));
        addCredit_CVC_label.setFont(new Font("",0,16));
        addCredit_InterestRate_label.setFont(new Font("",0,16));
        addCredit_ExpirationDate_label.setFont(new Font("",0,16));
        CreditAddBtn.setFont(new Font("",0,16));

        credit_add_frame.add(addCreditFrame_heading);
        credit_add_frame.add(addCredit_CardId_label);
        credit_add_frame.add(addCredit_BankAcct_label);
        credit_add_frame.add(addCredit_ClientNamet_label);
        credit_add_frame.add(addCredit_BalanceAmount_label);
        credit_add_frame.add(addCredit_IssuerBank_label);
        credit_add_frame.add(addCredit_CVC_label);
        credit_add_frame.add(addCredit_InterestRate_label);
        credit_add_frame.add(addCredit_ExpirationDate_label);

        credit_add_frame.add(addCredit_CardId_text);
        credit_add_frame.add(addCredit_BankAccount_text);
        credit_add_frame.add(addCredit_ClientName_text);
        credit_add_frame.add(addCredit_BalanceAmount_text);
        credit_add_frame.add(addCredit_issuerbank_text);
        credit_add_frame.add(addCredit_CVCnumber_text);
        credit_add_frame.add(addCredit_InterestRate_text);

        credit_add_frame.add(expirationdate_day_cb);
        credit_add_frame.add(expirationdate_month_cb);
        credit_add_frame.add(expirationdate_year_cb);

        credit_add_frame.add(CreditAddBtn);
        credit_add_frame.add(CreditClearBtn);

        //creating  withdraw amount frame and adding its components
        withdraw_frame=new JFrame("Withdraw Amount");
        withdrawFrame_heading=new JLabel("Withdraw Amount");

        withdraw_CardId_label=new JLabel("Card ID:");
        withdraw_PIN_label=new JLabel("PIN Number:");
        withdraw_WithdrawalAmt_label=new JLabel("Withdrawal Amount:");
        withdraw_DateOfWithdrawal_label=new JLabel("Date of Withdrawal:");

        WithDrawBtn= new JButton("WithDraw");
        WithDrawCancelBtn = new JButton("Cancel");

        withdraw_CardId_text=new JTextField();
        withdraw_PIN_text=new JTextField();
        withdraw_WithdrawalAmount_text=new JTextField();

        withdrawalDate_Day_cb=new JComboBox<String>(Day);
        withdrawalDate_Month_cb=new JComboBox<String>(Month);
        withdrawalDate_Year_cb=new JComboBox<String>(Year);

        withdrawFrame_heading.setBounds(184,44,196,35);
        withdraw_CardId_label.setBounds(66,109,60,22);
        withdraw_PIN_label.setBounds(66,201,120,22);
        withdraw_WithdrawalAmt_label.setBounds(304,109,150,22);
        withdraw_DateOfWithdrawal_label.setBounds(304,201,144,22);

        withdraw_CardId_text.setBounds(66,137,180,32);
        withdraw_PIN_text.setBounds(66,234,180,32);
        withdraw_WithdrawalAmount_text.setBounds(304,137,180,32);

        withdrawalDate_Day_cb.setBounds(304,234,40,32);
        withdrawalDate_Month_cb.setBounds(354,234,50,32);
        withdrawalDate_Year_cb.setBounds(414,234,70,32);

        WithDrawBtn.setBounds(191,330,170,31);
        WithDrawCancelBtn.setBounds(216,375,120,25);

        withdrawFrame_heading.setFont(new Font("",0,22));
        withdraw_CardId_label.setFont(new Font("",0,16));
        withdraw_PIN_label.setFont(new Font("",0,16));
        withdraw_WithdrawalAmt_label.setFont(new Font("",0,16));
        withdraw_DateOfWithdrawal_label.setFont(new Font("",0,16));
        withdraw_CardId_text.setFont(new Font("",0,16));
        withdraw_PIN_text.setFont(new Font("",0,16));
        withdraw_WithdrawalAmount_text.setFont(new Font("",0,16));
        WithDrawBtn.setFont(new Font("",0,16));

        withdraw_frame.add(withdrawFrame_heading);
        withdraw_frame.add(withdraw_CardId_label);
        withdraw_frame.add(withdraw_PIN_label);
        withdraw_frame.add(withdraw_WithdrawalAmt_label);
        withdraw_frame.add(withdraw_DateOfWithdrawal_label);

        withdraw_frame.add(withdraw_CardId_text);
        withdraw_frame.add(withdraw_PIN_text);
        withdraw_frame.add(withdraw_WithdrawalAmount_text);

        withdraw_frame.add(withdrawalDate_Day_cb);
        withdraw_frame.add(withdrawalDate_Month_cb);
        withdraw_frame.add(withdrawalDate_Year_cb);

        withdraw_frame.add(WithDrawBtn);
        withdraw_frame.add(WithDrawCancelBtn);

        //creating set credit frame and adding components
        credit_limit_frame=new JFrame("Set Credit Limit");

        setCreditFrame_heading=new JLabel("Set Credit Limit");
        setCredit_CardId_label=new JLabel("Card ID:");
        setCredit_CreditLimit_label=new JLabel("New Credit Limit:");
        setCredit_GracePeriod_label=new JLabel("Grace Period:");

        setCredit_CardId_text=new JTextField();
        setCredit_CreditLimit_text=new JTextField();
        setCredit_graceperiod_text=new JTextField();

        setCreditLimitBtn=new JButton("Set Credit Limit");
        ClearCreditLimit=new JButton("Clear");

        setCreditFrame_heading.setBounds(152,48,178,35);
        setCredit_CardId_label.setBounds(217,99,67,25);
        setCredit_CreditLimit_label.setBounds(184,199,132,25);
        setCredit_GracePeriod_label.setBounds(192,290,144,25);

        setCredit_CardId_text.setBounds(160,138,180,32);
        setCredit_CreditLimit_text.setBounds(160,234,180,32);
        setCredit_graceperiod_text.setBounds(160,320,180,32);

        setCreditLimitBtn.setBounds(160,391,170,31);
        ClearCreditLimit.setBounds(190,432,120,25);

        setCreditFrame_heading.setFont(new Font("",0,22));
        setCredit_CardId_label.setFont(new Font("",0,16));
        setCredit_CreditLimit_label.setFont(new Font("",0,16));
        setCredit_GracePeriod_label.setFont(new Font("",0,16));
        setCredit_CardId_text.setFont(new Font("",0,16));
        setCredit_CreditLimit_text.setFont(new Font("",0,16));
        setCreditLimitBtn.setFont(new Font("",0,16));

        credit_limit_frame.add(setCreditFrame_heading);
        credit_limit_frame.add(setCredit_CardId_label);
        credit_limit_frame.add(setCredit_CreditLimit_label);
        credit_limit_frame.add(setCredit_GracePeriod_label);

        credit_limit_frame.add(setCredit_CardId_text);
        credit_limit_frame.add(setCredit_CreditLimit_text);
        credit_limit_frame.add(setCredit_graceperiod_text);

        credit_limit_frame.add(setCreditLimitBtn);
        credit_limit_frame.add(ClearCreditLimit);

        //creating cancel credit frame and adding components
        cancel_credit_frame=new JFrame("Cancel Credit Card");

        cancelCreditFrame_heading=new JLabel("Cancel Credit Card");
        cancelCredit_Info_label=new JLabel("Please enter the Card Id of required card to be removed  ");
        cancelCredit_CardId_label=new JLabel("Card ID:");
        cancelCredit_CardId_text=new JTextField();
        CancelCreditCard=new JButton("Cancel Credit Card");
        ClearCancelCreditCard=new JButton("Clear");

        cancelCreditFrame_heading.setBounds(152,33,213,35);
        cancelCredit_Info_label.setBounds(55,76,461,34);
        cancelCredit_CardId_label.setBounds(229,124,60,22);

        cancelCredit_CardId_text.setBounds(169,150,180,32);

        CancelCreditCard.setBounds(169,209,180,26);
        ClearCancelCreditCard.setBounds(200,244,117,25);

        cancelCreditFrame_heading.setFont(new Font("",0,22));
        cancelCredit_Info_label.setFont(new Font("",0,16));
        cancelCredit_CardId_label.setFont(new Font("",0,16));
        cancelCredit_CardId_text.setFont(new Font("",0,16));
        CancelCreditCard.setFont(new Font("",0,16));
        ClearCancelCreditCard.setFont(new Font("",0,12));

        cancel_credit_frame.add(cancelCreditFrame_heading);
        cancel_credit_frame.add(cancelCredit_Info_label);
        cancel_credit_frame.add(cancelCredit_CardId_label);
        cancel_credit_frame.add(cancelCredit_CardId_text);
        cancel_credit_frame.add(CancelCreditCard);
        cancel_credit_frame.add(ClearCancelCreditCard);

        //creating  display frame and adding components
        display_frame=new JFrame("Display");
        DisplayDebitCard=new JButton("Display Debit Card");
        DisplayCreditCard=new JButton("Display Credit Card");

        DisplayDebitCard.setBounds(80,104,172,32);
        DisplayCreditCard.setBounds(80,154,172,32);

        DisplayDebitCard.setFont(new Font("",0,16));
        DisplayCreditCard.setFont(new Font("",0,16));

        display_frame.add(DisplayDebitCard);
        display_frame.add(DisplayCreditCard);

        //adding action listener to main menu button
        mainFrame_addDebit_btn.addActionListener(this);
        mainFrame_addCredit_btn.addActionListener(this);
        mainFrame_Withdraw_btn.addActionListener(this);
        mainFrame_SetCredit_btn.addActionListener(this);
        mainFrame_CancelCredit_btn.addActionListener(this);
        mainFrame_Display_btn.addActionListener(this);

        //adding action listener to main buttons
        DebitAddBtn.addActionListener(this);
        CreditAddBtn.addActionListener(this);
        WithDrawBtn.addActionListener(this);
        setCreditLimitBtn.addActionListener(this);
        CancelCreditCard.addActionListener(this);
        DisplayCreditCard.addActionListener(this);
        DisplayDebitCard.addActionListener(this);

        //adding action listener to clear buttons
        DebitClearBtn.addActionListener(this);
        ClearCreditLimit.addActionListener(this);
        CreditClearBtn.addActionListener(this);
        ClearCancelCreditCard.addActionListener(this);

        //adding action listener to cancel buttons
        WithDrawCancelBtn.addActionListener(this);

        //setting values for frame
        main_frame.setResizable(false);
        main_frame.setSize(592,500);
        main_frame.setLayout(null);
        main_frame.setVisible(true);

        add_debit_frame.setResizable(false);
        add_debit_frame.setSize(551,544);
        add_debit_frame.setLayout(null);

        credit_add_frame.setResizable(false);
        credit_add_frame.setSize(551,660);
        credit_add_frame.setLayout(null);

        credit_limit_frame.setResizable(false);
        credit_limit_frame.setSize(500,530);
        credit_limit_frame.setLayout(null);

        cancel_credit_frame.setResizable(false);
        cancel_credit_frame.setSize(500,340);
        cancel_credit_frame.setLayout(null);

        display_frame.setResizable(false);
        display_frame.setSize(350,300);
        display_frame.setLayout(null);

        withdraw_frame.setResizable(false);
        withdraw_frame.setSize(550,480);
        withdraw_frame.setLayout(null);
    }

    @Override//over riding action performed method to add functionality to the buttons
    public void actionPerformed(ActionEvent b){
        //these buttons direct user from main menu to desiered 
        if(b.getSource()==mainFrame_addDebit_btn){
            add_debit_frame.setVisible(true);
        }
        else if(b.getSource()==mainFrame_addCredit_btn){
            credit_add_frame.setVisible(true);
        }
        else if(b.getSource()==mainFrame_Withdraw_btn){
            withdraw_frame.setVisible(true);
        }
        else if(b.getSource()==mainFrame_SetCredit_btn){
            credit_limit_frame.setVisible(true);
        }
        else if(b.getSource()==mainFrame_CancelCredit_btn){
            cancel_credit_frame.setVisible(true);
        }
        else if(b.getSource()==mainFrame_Display_btn){
            display_frame.setVisible(true);
        } 
        //to clear all the text field of add debit frame
        if(b.getSource()==DebitClearBtn){
            addDebit_cardID_text.setText("");
            addDebit_BankAcc_text.setText("");
            addDebit_ClientName_text.setText("");
            addDebit_BalanceAmt_text.setText("");
            addDebit_IssuerBank_text.setText("");
            addDebit_PIN_text.setText("");
            JOptionPane.showMessageDialog(add_debit_frame,"The values has been cleared.");
        }
        //to clear all the text field of set cedit limit frame
        else if (b.getSource()==ClearCreditLimit){
            setCredit_CardId_text.setText("");
            setCredit_CreditLimit_text.setText("");
            setCredit_graceperiod_text.setText("");
            JOptionPane.showMessageDialog(credit_limit_frame,"The values has been cleared.");
        }
        //to clear all the text field of add cedit frame
        else if (b.getSource()==CreditClearBtn){
            addCredit_CardId_text.setText("");
            addCredit_BankAccount_text.setText("");
            addCredit_ClientName_text.setText("");
            addCredit_BalanceAmount_text.setText("");
            addCredit_issuerbank_text.setText("");
            addCredit_CVCnumber_text.setText("");
            addCredit_InterestRate_text.setText("");
            JOptionPane.showMessageDialog(credit_add_frame,"The values has been cleared.");
        }
        //to clear all the text field of cancel cedit card frame
        else if (b.getSource()==ClearCancelCreditCard ){
            cancelCredit_CardId_text.setText("");
            JOptionPane.showMessageDialog(cancel_credit_frame,"The values has been cleared.");
        }
        //to dispose the withdraw amount frame
        else if(b.getSource()==WithDrawCancelBtn){
            withdraw_frame.dispose();
        }
        //code for add debit button to work
        /*In this Button, a try and catch for numberformat exception is used to avoid exception caused when string value is entered when integer 
        should be entered.Then it checks if there is any empty text is present or not. If present a error message with saying"Empty Field Found" 
        will be displayed.If not then it will assign the text field values to respective variable.Then a object of debit card is created.After 
        that it will check whether the array list BankCard_AL is empty or not.If empty then the object of the debit card is added to the arraylist.
        If the arrylist is not empty then for each loop is used to iterate throghout the arraylist.here a loop_count1 variable is created and
        assigned a value of 0.This loop_count1 variable is there to check if an instance of debit card is present or not.Then if condition is 
        used t check if the current object of the array list is an instance of Debit card or not.If the condition is satisfyed then the loop_count1
        's value increases by 1.Then again if condition is used to check if the entered card id in text field is equal to the card id of the object
        of arrayists. If the card id are same then error message saying "Card ID already exists.Please enter a valid Card ID" is displayed. If not
        then it is checked if the object is the last object of array list to ensure that all of the card id were checked.If this condition is 
        satisfyied then the object is added to the array list.And then if loopc_count's value is zero,it is concluded that the arraylist has
        no instance of debit card, object of debit card will be added to the array list */
        if(b.getSource()==DebitAddBtn){
            try{
                if(addDebit_cardID_text.getText().isEmpty() || addDebit_BankAcc_text.getText().isEmpty() || addDebit_ClientName_text.getText().isEmpty() || addDebit_BalanceAmt_text.getText().isEmpty() || addDebit_IssuerBank_text.getText().isEmpty() || addDebit_PIN_text.getText().isEmpty()){
                    JOptionPane.showMessageDialog(add_debit_frame,"Empty Field Found","Error",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    int cardID=Integer.parseInt(addDebit_cardID_text.getText());
                    String BankAccount=addDebit_BankAcc_text.getText();
                    String issuerbank=addDebit_IssuerBank_text.getText();
                    int BalanceAmount=Integer.parseInt(addDebit_BalanceAmt_text.getText());
                    String ClientName=addDebit_ClientName_text.getText();
                    int PINnumber=Integer.parseInt(addDebit_PIN_text.getText());
                    DebitCard object_Debit_Card = new DebitCard(cardID,BankAccount,issuerbank,BalanceAmount,ClientName,PINnumber);
                    if(BankCard_AL.isEmpty()){
                        BankCard_AL.add(object_Debit_Card);
                        JOptionPane.showMessageDialog(add_debit_frame,"The values of debit card have been added.");
                    }
                    else{
                        for (BankCard i: BankCard_AL ){
                            int loop_count1=0;
                            if(i instanceof DebitCard){
                                loop_count1=loop_count1+1;
                                if(i.getCardID()==cardID){
                                    JOptionPane.showMessageDialog(add_debit_frame,"Card ID already exists.Please enter a valid Card ID","Error",JOptionPane.WARNING_MESSAGE);
                                }
                                else if(i==BankCard_AL.get(BankCard_AL.size() - 1)){
                                    BankCard_AL.add(object_Debit_Card);
                                    JOptionPane.showMessageDialog(add_debit_frame,"The values of debit card have been added.");
                                    break;
                                }
                            }
                            else if (i==BankCard_AL.get(BankCard_AL.size() - 1) && loop_count1==0){
                                BankCard_AL.add(object_Debit_Card);
                                JOptionPane.showMessageDialog(add_debit_frame,"The values of debit card have been added.");
                                break;
                            }
                        }   
                    }
                }
            }
            catch(NumberFormatException  a){
                JOptionPane.showMessageDialog(add_debit_frame,"Please enter valid input","Error",JOptionPane.WARNING_MESSAGE);
            }
        }

        //code for add credit button to work
        /*In this Button, a try and catch for numberformat exception is used to avoid exception caused when string value is entered when integer 
        should be entered.Then it checks if there is any empty text is present or not. If present a error message with saying"Empty Field Found" 
        will be displayed.If not then it will assign the text field values to respective variable.Then a object of credit card is created.After 
        that it will check whether the array list BankCard_AL is empty or not.If empty then the object of the credit card is added to the arraylist.
        If the arrylist is not empty then for each loop is used to iterate throghout the arraylist.here a loop_count2 variable is created and
        assigned a value of 0.This loop_count2 variable is there to check if an instance of credit card is present or not.Then if condition is 
        used to check if the current object of the array list is an instance of Credit card or not.If the condition is satisfyed then the loop_count2
        's value increases by 1.Then again if condition is used to check if the entered card id in text field is equal to the card id of the object
        of arrayists. If the card id are same then error message saying "Card ID already exists.Please enter a valid Card ID" is displayed. If not
        then it is checked if the object is the last object of array list to ensure that all of the card id were checked.If this condition is 
        satisfyied then the object is added to the array list.And then if loopc_count's value is zero,it is concluded that the arraylist has
        no instance of credit card, object of credit card will be added to the array list */
        if(b.getSource()==CreditAddBtn){
            try{
                if(addCredit_CardId_text.getText().isEmpty() || addCredit_BankAccount_text.getText().isEmpty() || addCredit_ClientName_text.getText().isEmpty() || addCredit_BalanceAmount_text.getText().isEmpty() || addCredit_issuerbank_text.getText().isEmpty() || addCredit_CVCnumber_text.getText().isEmpty() || addCredit_InterestRate_text.getText().isEmpty()){
                    JOptionPane.showMessageDialog(credit_add_frame,"Empty Field Found","Error",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    int cardID=Integer.parseInt(addCredit_CardId_text.getText());
                    String BankAccount=addCredit_BankAccount_text.getText();
                    String issuerbank=addCredit_issuerbank_text.getText();
                    int BalanceAmount=Integer.parseInt(addCredit_BalanceAmount_text.getText());
                    String ClientName=addCredit_ClientName_text.getText();
                    int CVCnumber=Integer.parseInt(addCredit_CVCnumber_text.getText());;
                    double InterestRate=Double.parseDouble(addCredit_InterestRate_text.getText());
                    String ExpirationDate =expirationdate_day_cb.getSelectedItem()+"-"+expirationdate_month_cb.getSelectedItem()+"-"+expirationdate_year_cb.getSelectedItem();

                    CreditCard object_Credit_Card = new CreditCard(cardID ,BankAccount,issuerbank,BalanceAmount,ClientName,CVCnumber,InterestRate,ExpirationDate);
                    if(BankCard_AL.isEmpty()){  
                        BankCard_AL.add(object_Credit_Card);
                        JOptionPane.showMessageDialog(credit_add_frame,"The values of credit card have been added." );
                    }
                    else{
                        //boolean isadded=false;
                        for (BankCard i: BankCard_AL){
                            int loop_count2=0;
                            if(i instanceof CreditCard){
                                loop_count2=loop_count2+1;
                                if(i.getCardID()==Integer.parseInt(addCredit_CardId_text.getText())){
                                    JOptionPane.showMessageDialog(credit_add_frame,"Card ID already exists.Please enter a valid Card ID","Error",JOptionPane.WARNING_MESSAGE);
                                    break;
                                }
                                else if(i==BankCard_AL.get(BankCard_AL.size() - 1)){
                                    BankCard_AL.add(object_Credit_Card);
                                    JOptionPane.showMessageDialog(credit_add_frame,"The values of credit card have been added." );
                                    break;
                                }
                            }
                            else if (i==BankCard_AL.get(BankCard_AL.size() - 1) && loop_count2==0){
                                BankCard_AL.add(object_Credit_Card);
                                JOptionPane.showMessageDialog(credit_add_frame,"The values of credit card have been added." );
                                break;
                            }
                        }
                    }
                }
            }  
            catch(NumberFormatException  a){
                JOptionPane.showMessageDialog(credit_add_frame,"Please enter valid input","Error",JOptionPane.WARNING_MESSAGE);
            }
        }

        //for withdraw to work
        /*In this Button, a try and catch for numberformat exception is used to avoid exception caused when string value is entered when integer 
        should be entered.Then it checks if there is any empty text is present or not. If present a error message with saying"Empty Field Found" 
        will be displayed.Else it will check whether the array list BankCard_AL is empty or not, if empty then a error message is displayed saying
        "Cannot WithDraw, No Data Avialable" because we cannot withdraw if no card id is available. If the array list is not empty,for each loop 
        is used to iterate throghout the arraylist.In side the loop if condition is used to check if the current object is the instance of debit 
        card.If not and the object is the last object of the arraylist then an error message is displayed saying "Cannot WithDraw, No Data Avialable".
        But if the object is instance of debit card then the card id is checked with the object's card ID.If the cardIds doesn't match then "Invalid 
        Card ID" error message is displayed If matched then the text field's values are assigned to respective variables.Then downcasting is 
        performed for the parent class's object to asccess the child class method withdraw().Then the entered values in text fields are displayed
        and then the pin  number's validity is check. If pin number match then withdraw method from debit card class is called and if not then "Cannot
        WithDraw, Wrong Pin number" message is displayed indialog box */
        if(b.getSource()==WithDrawBtn){
            try{
                if(withdraw_CardId_text.getText().isEmpty() || withdraw_PIN_text.getText().isEmpty() || withdraw_WithdrawalAmount_text.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(withdraw_frame,"Empty Field Found","Error",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    if(BankCard_AL.isEmpty()){
                        JOptionPane.showMessageDialog(withdraw_frame,"Cannot WithDraw, No Data Avialable","Error",JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        for (BankCard i: BankCard_AL ){
                            if(i instanceof DebitCard){
                                if(i.getCardID()==Integer.parseInt(withdraw_CardId_text.getText())){
                                    int WithdrawalAmount=Integer.parseInt(withdraw_WithdrawalAmount_text.getText());
                                    String DateOfWithdrawal=withdrawalDate_Day_cb.getSelectedItem()+"-"+withdrawalDate_Month_cb.getSelectedItem()+"-"+withdrawalDate_Year_cb.getSelectedItem();
                                    int PINnumber=Integer.parseInt(withdraw_PIN_text.getText());
                                    DebitCard j= (DebitCard) i;
                                    JOptionPane.showMessageDialog(withdraw_frame,"The  entered values are: \n WithdrawalAmount:"+WithdrawalAmount+"\n DateOfWithdrawal:"+DateOfWithdrawal+"\n PINnumber:"+PINnumber);
                                    if (PINnumber==j.getPINnumber()){
                                        j.Withdraw(WithdrawalAmount, DateOfWithdrawal, PINnumber);
                                        JOptionPane.showMessageDialog(withdraw_frame,"Sucessfully Withdrawn","Error",JOptionPane.WARNING_MESSAGE);
                                        break;
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(withdraw_frame,"Cannot WithDraw, Wrong Pin number","Error",JOptionPane.WARNING_MESSAGE);
                                        break;
                                    }
                                }
                                else if(BankCard_AL.get(BankCard_AL. size()-1)==i){
                                    JOptionPane.showMessageDialog(withdraw_frame,"Invalid Card ID","Error",JOptionPane.WARNING_MESSAGE);
                                }
                            }
                            else if(BankCard_AL.get(BankCard_AL. size()-1)==i){
                                JOptionPane.showMessageDialog(withdraw_frame,"Cannot WithDraw, No Data Avialable","Error",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
            catch(NumberFormatException a){
                JOptionPane.showMessageDialog(withdraw_frame,"Please enter valid input","Error",JOptionPane.WARNING_MESSAGE);
            }
        }
        /*In this Button, a try and catch for numberformat exception is used to avoid exception caused when string value is entered when integer 
        should be entered.Then it checks if there is any empty text is present or not. If present a error message with saying"Empty Field Found" 
        will be displayed.Else it will check whether the array list BankCard_AL is empty or not, if empty then a error message is displayed saying
        "Cannot set Credit limt, No Data Avialable" because we cannot set credit limit if no card id is available. If the array list is not empty,
        for each loop is used to iterate throghout the arraylist.Inside the loop if condition is used to check if the current object is the instance
        of credit card.If not and the object is the last object of the arraylist then an error message is displayed saying "Cannot set Credit Limit, 
        No Data Avialable". But if the object is instance of credit card then the card id is checked with the object's card ID.If matched then the 
        text field's values are assigned to respective variables.Then downcasting is performed for the parent class's object to asccess the child 
        class method setCreditLimit().Then the entered values in text fields are then displayed and break is used to stop the loop so that after the
        condition are satisfyied the program doesnt run again.And if id the card id doesnt match and the object is the last object of the arraylist the
        "Invalid Card ID" message is displayed indialog box */
        if(b.getSource()==setCreditLimitBtn){
            try{
                if(setCredit_CardId_text.getText().isEmpty() || setCredit_CreditLimit_text.getText().isEmpty() || setCredit_graceperiod_text.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(credit_limit_frame,"Empty Field Found","Error",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    if(BankCard_AL.isEmpty()){
                        JOptionPane.showMessageDialog(credit_limit_frame," Cannot set Credit Limit, No Data Avialable","Error",JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        for (BankCard i: BankCard_AL ){
                            if(i instanceof CreditCard){
                                if(i.getCardID()==Integer.parseInt(setCredit_CardId_text.getText())){
                                    double CreditLimit=Double.parseDouble(setCredit_CreditLimit_text.getText());
                                    int GracePeriod=Integer.parseInt(setCredit_graceperiod_text.getText());
                                    CreditCard j= (CreditCard) i;//downcasting object of bankcard to creditcard to ascess method of creditcard
                                    j.setCreditLimit( CreditLimit,GracePeriod);
                                    JOptionPane.showMessageDialog(credit_limit_frame,"The  entered values are: \n CreditLimit:"+CreditLimit+"\n GracePeriod:"+GracePeriod);
                                    break;
                                }
                                else if(BankCard_AL.get(BankCard_AL. size()-1)==i){
                                    JOptionPane.showMessageDialog(withdraw_frame,"Invalid Card ID","Error",JOptionPane.WARNING_MESSAGE);
                                }
                              }
                            else if(BankCard_AL.get(BankCard_AL. size()-1)==i){
                                JOptionPane.showMessageDialog(credit_limit_frame,"Cannot set Credit Limit, No Data Avialable","Error",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
            catch(NumberFormatException a){
                JOptionPane.showMessageDialog(withdraw_frame,"Please enter valid input","Error",JOptionPane.WARNING_MESSAGE);
            }
        }
        /*In this Button, a try and catch for numberformat exception is used to avoid exception caused when string value is entered when integer 
        should be entered.Then it checks if there is any empty text is present or not. If present a error message with saying"Empty Field Found" 
        will be displayed.Else it will check whether the array list BankCard_AL is empty or not, if empty then a error message is displayed saying
        "Cannot cancel Credit card, No Data Avialable" because we cannot cancel credit card if no card id is available. If the array list is not empty,
        for each loop is used to iterate throghout the arraylist.Inside the loop if condition is used to check if the current object is the instance
        of credit card.If not and the object is the last object of the arraylist then an error message is displayed saying "Cannot cancel Credit Card, 
        No Data Avialable". But if the object is instance of credit card then the card id is checked with the object's card ID.If matched then the 
        text field's values are assigned to respective variables.Then downcasting is performed for the parent class's object to asccess the child 
        class method setCreditLimit().Then the entered values in text fields are then displayed and break is used to stop the loop so that after the
        condition are satisfyied the program doesnt run again.And if id the card id doesnt match and the object is the last object of the arraylist the
        "Invalid Card ID" message is displayed indialog box */
        if(b.getSource()==CancelCreditCard){
            try{
                if(cancelCredit_CardId_text.getText().isEmpty() ) {
                    JOptionPane.showMessageDialog(cancel_credit_frame,"Empty Field Found","Error",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    if(BankCard_AL.isEmpty()){
                        JOptionPane.showMessageDialog(cancel_credit_frame," Cannot Cancel Credit Card, No Data Avialable","Error",JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        for (BankCard i: BankCard_AL ){
                            if(i instanceof CreditCard){
                                if(i.getCardID()==Integer.parseInt(cancelCredit_CardId_text.getText())){
                                    CreditCard j= (CreditCard) i;//downcasting object of bankcard to creditcard to ascess method of creditcard 
                                    j.cancelCreditCard();
                                    JOptionPane.showMessageDialog(cancel_credit_frame,"The  entered values are: \n CardID:"+cancelCredit_CardId_text.getText());
                                    break;
                                }
                                else if(BankCard_AL.get(BankCard_AL. size()-1)==i){
                                    JOptionPane.showMessageDialog(cancel_credit_frame,"Invalid Card ID","Error",JOptionPane.WARNING_MESSAGE);
                                }
                            }
                            else if(BankCard_AL.get(BankCard_AL. size()-1)==i){
                                JOptionPane.showMessageDialog(cancel_credit_frame,"Cannot Cancel Credit Card, No Data Avialable","Error",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
            catch(NumberFormatException a){
                JOptionPane.showMessageDialog(cancel_credit_frame,"Please enter valid input","Error",JOptionPane.WARNING_MESSAGE);
            }
        }
        /*In this Button, first it will check whether the array list BankCard_AL is empty or not.If empty then a error message is displayed saying
        "Cannot display Credit card, No Data Avialable" because we cannot display credit card if no data of credit card is available.If the arrylist 
        is not empty then a loop_count3 variable is created and assigned a value of 0.This loop_count3 variable is there to check if an instance of 
        credit card is present or not. For each loop is then used to iterate throghout the arraylist.Then if condition is 
        used to check if the current object of the array list is an instance of Credit card or not.If it is an instance of Credit card, then the
        loop_count3's value increases by 1.Then downcasting is performed and display() of credit card id called. After the for each loop is completed 
        if condition is used to check if loop_count3 is zero or not.If zero then error message "No Data Of Credit Card Found" is displayed. Else 
        "Data Displayed" message is displayed.*/

        if(b.getSource()==DisplayCreditCard){
            if(BankCard_AL.isEmpty()){
                JOptionPane.showMessageDialog(display_frame," Cannot display Credit Card, No Data Avialable","Error",JOptionPane.WARNING_MESSAGE);
            }
            else{
                int loop_count3=0;
                for (BankCard i: BankCard_AL ){
                    if(i instanceof CreditCard){
                        loop_count3=loop_count3+1;
                        CreditCard j= (CreditCard) i;//downcasting object of bankcard to creditcard to ascess method of creditcard 
                        j.display();
                    }
                }
                if(loop_count3==0){
                    JOptionPane.showMessageDialog(display_frame,"No Data Of Credit Card Found","Error",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(display_frame,"Data Displayed");
                }
            }
        }
        
        /*In this Button, first it will check whether the array list BankCard_AL is empty or not.If empty then a error message is displayed saying
        "Cannot display Debit card, No Data Avialable" because we cannot display debit card if no data of debit card is available.If the arrylist 
        is not empty then a loop_count4 variable is created and assigned a value of 0.This loop_count4 variable is there to check if an instance of 
        debit card is present or not. For each loop is then used to iterate throghout the arraylist.Then if condition is 
        used to check if the current object of the array list is an instance of debit card or not.If it is an instance of debit card, then the
        loop_count4's value increases by 1.Then downcasting is performed and display() of debit card id called. After the for each loop is completed 
        if condition is used to check if loop_count3 is zero or not.If zero then error message "No Data Of debit Card Found" is displayed. Else 
        "Data Displayed" message is displayed.*/
        
        else if(b.getSource()==DisplayDebitCard){
            if(BankCard_AL.isEmpty()){          
                JOptionPane.showMessageDialog(display_frame," Cannot Display Debit Card, No Data Avialable","Error",JOptionPane.WARNING_MESSAGE);
            }
            else{
                int loop_count4=0;
                for (BankCard i: BankCard_AL ){
                    if(i instanceof DebitCard){
                        loop_count4=loop_count4+1;
                        DebitCard j= (DebitCard) i;//downcasting object of bankcard to creditcard to ascess method of creditcard 
                        j.display();
                    }
                }
                if(loop_count4==0){
                    JOptionPane.showMessageDialog(display_frame,"No Data Of Dredit Card Found","Error",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(display_frame,"Data Displayed");
                }
            }
        }

    }

    public static void main(String[] args){
        new Bank_GUI(); 
    }
}