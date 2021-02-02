//	    ANSWER TO THE QUESTION NO B :
//*****************************************

public class Account {

    //Attributes
private int accountNumber;
private String accountHolderName;
private double balance;

    //Methods

public  int getAccountNumber( ){
    return accountNumber;
}
public void setAccountNumber(int an){
    this.accountNumber=an;
}
public String getAccountHolderName( ) {
    return accountHolderName;
}
public void setAccountHolderName(String ahn){
    this.accountHolderName=ahn;
}
public double getBalance( ){
    return balance;
}
public void setBalance(double b){
    this.balance=b;
}

void showDetails()
{
    System.out.println("ACCOUNT NUMBER : "+getAccountNumber( ));
    System.out.println("ACCOUNT HOLDER NAME : "+getAccountHolderName( ) );
    System.out.println("BALANCE : "+getBalance( ));

};
}
