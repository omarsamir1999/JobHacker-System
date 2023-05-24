package BankingApplication;


import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("1. Open a savings account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Display balance");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Account holder name: ");
                    String accountHolderName = scanner.nextLine();
                    System.out.print("Initial balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Interest rate: ");
                    double interestRate = scanner.nextDouble();
                    SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolderName, balance, interestRate);
                    bank.addAccount(savingsAccount);
                    System.out.println("Account opened successfully");
                    break;
                case 2:
                    System.out.print("Account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(accountNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Account number: ");
                    accountNumber = scanner.nextLine();
                    bank.displayBalance(accountNumber);
                    break;
                case 5:
                    System.out.println("Exiting the application");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
