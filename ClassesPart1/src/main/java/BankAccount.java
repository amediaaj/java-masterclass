public class BankAccount {
    long accountNumber;
    double accountBalance;
    String lastName;
    String firstName;
    String email;
    String phoneNumber;

    public BankAccount() {
        // "this" keyword must be first line
        this(5678, "Default last name", "Default first name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accountNumber, String lastName, String firstName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double amount) {
        if(amount >= 0.0) {
            this.accountBalance += amount;
        }

        return this.accountBalance;
    }

    public double withdrawFunds(double amount) {

        if(amount >= 0.0) {
            double currentBalance = this.accountBalance;
            if(currentBalance - amount < 0) return this.accountBalance;

            this.accountBalance -= amount;
        }

        return this.accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
