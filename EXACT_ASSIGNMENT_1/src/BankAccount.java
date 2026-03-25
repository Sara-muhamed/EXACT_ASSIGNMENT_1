//Task 5 ⭐⭐
// — Bank Account Variables  Simulate a bank account: String accountHolder,
// long accountNumber, double balance, boolean isActive.
// Print a formatted account statement using String.format() or printf.
public class BankAccount {
    public static void main(String[] args) {
        String accountHolder = "Sara Mohamed";
        long accountNumber = 123456789012345L;
        double balance = 25000.75;
        boolean isActive = true;

        System.out.println("**** Account Statement ****");

        System.out.printf("Account Holder: %s%n", accountHolder);
        System.out.printf("Account Number: %d%n", accountNumber);
        System.out.printf("Balance: %.2f EGP%n", balance);
        System.out.printf("Account Active: %b%n", isActive);



    }
}
