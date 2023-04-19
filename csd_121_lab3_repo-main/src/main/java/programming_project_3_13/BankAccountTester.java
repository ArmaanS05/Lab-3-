package programming_project_3_13;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000, 100, 2);
        acc.deposit(1000);
        System.out.println("After deposit: " + acc.getBalance());
        acc.withdraw(1000);
        System.out.println("After withdrawl: " + acc.getBalance());
        acc.deposit(1000);
        System.out.println("Expected: 1900");
        System.out.println("After deposit: " + acc.getBalance());


    }
}
