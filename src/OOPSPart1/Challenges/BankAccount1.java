package OOPSPart1.Challenges;

public class BankAccount1 {
    private String customerName;
    private long accountNumber;
    private double accountBalance;
    private String email;
    private long phoneNumber;

    public String getCustomerName() {
        return customerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public void withdraw(double withdrawalAmount){
        if(accountBalance-withdrawalAmount<0) System.out.println("Can't withdraw funds");
        else{
            accountBalance-=withdrawalAmount;
            System.out.println("Successfully Withdrawn : " + withdrawalAmount + "remaining balance is : "+ accountBalance);
        }
    }
    public void deposit(double depositMoney){
        accountBalance+=depositMoney;
        System.out.println("Total balance is : "+ accountBalance);
    }
}
