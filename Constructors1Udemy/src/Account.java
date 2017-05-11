/**
 * Created by diamo on 21.04.2017.
 */
public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAdress;
    private String customerPhoneNumber;


    public Account(){

        this("00000",
                10.0,
                "Default name",
                "Default email adresss",
                "default phone" );

        System.out.println("Empty constructor called");

    }

    public Account(String number, double balance, String customerName, String customerEmailAdress, String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAdress = customerEmailAdress;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("constructor with parameters called");
    }

    public Account(String customerName, String customerEmailAdress, String customerPhoneNumber) {
        this("0000",100.0, customerName,customerEmailAdress,customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount <=0)
            System.out.println("Only " + balance +" avalaible. Withdrawal not processed");
        else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " +this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
