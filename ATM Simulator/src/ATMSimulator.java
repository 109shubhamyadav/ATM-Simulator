import java.util.Scanner;

public class ATMSimulator {
    private static final String PIN = "1234";
    private static double balance = 10000.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your 4-digit PIN: ");
        String enteredPin = sc.nextLine();

        if (!enteredPin.equals(PIN)) {
            System.out.println("Incorrect PIN. Access Denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showBalance();
                    break;
                case 2:
                    withdrawMoney(sc);
                    break;
                case 3:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 3);

        sc.close();
    }

    private static void showBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    private static void withdrawMoney(Scanner sc) {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash.");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }
}
