//    TASK 3
//    ATM INTERFACE
//        1.Create a class to represent the ATM machine.
//        2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
//        checking the balance.
//        3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
//        checkBalance().
//        4. Create a class to represent the user's bank account, which stores the account balance.
//        5. Connect the ATM class with the user's bank account class to access and modify the account
//        balance.
//        6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
//        7. Display appropriate messages to the user based on their chosen options and the success or failure
//        of their transactions.


package Task3;

import java.util.Scanner;


public class ATMMACHINE {
    public BankAccount account;

    public ATMMACHINE(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM Machine");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public void checkBalance() {
        double balance = account.getBalance();
        System.out.println("Your balance is $" + balance);
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Initialize with a balance of $1000
        ATMMACHINE atm = new ATMMACHINE(userAccount);
        atm.run();
    }
}
