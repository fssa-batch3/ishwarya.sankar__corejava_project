package day05.practice;

class Account {
    private String accNo;
    private double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public Account() {

    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account, double amount) throws Exception;
    double getBalance(Account account);
}


class AxisATM implements ATM {
    private double withdrawalCharge = 5;

    @Override
    public boolean deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(Account account, double amount) throws Exception {
        if (account.getBalance() < 5000) {
            throw new Exception("Low Balance");
        }

        double totalAmount = amount + withdrawalCharge;

        if (account.getBalance() >= totalAmount) {
            account.setBalance(account.getBalance() - totalAmount);
            return true;
        } else {
            throw new Exception("Low Balance");
        }
    }

    @Override
    public double getBalance(Account account) {
        return account.getBalance();
    }


}

class IciciATM implements ATM {
    private double withdrawalCharge = 10;

    @Override
    public boolean deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(Account account, double amount) throws Exception {
        if (account.getBalance() < 10000) {
            throw new Exception("Low Balance");
        }

        double totalAmount = amount + withdrawalCharge;

        if (account.getBalance() >= totalAmount) {
            account.setBalance(account.getBalance() - totalAmount);
            return true;
        } else {
            throw new Exception("Low Balance");
        }
    }

    @Override
    public double getBalance(Account account) {
        return account.getBalance();
    }


}