import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccountClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount("DEFAULT", initialBalance);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String operation = sc.next();
            double amount = sc.nextDouble();
            boolean accepted;

            if (operation.equalsIgnoreCase("D")) {
                accepted = account.deposit(amount);
            } else if (operation.equalsIgnoreCase("W")) {
                accepted = account.withdraw(amount);
            } else {
                accepted = false;
            }

            if (accepted) {
                System.out.printf(java.util.Locale.US, "%.2f%n", account.getBalance());
            } else {
                System.out.println("Invalid Transaction");
            }
        }
        sc.close();
    }
}
