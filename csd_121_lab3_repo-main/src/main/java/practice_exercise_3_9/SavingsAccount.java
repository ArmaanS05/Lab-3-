 package practice_exercise_3_9;

public class SavingAccount
{
    private double initBal;
    private double interestRate;
    private double bal;

    public SavingAccount(double initBal, double interestRate)
    {
        bal = initBal;
        this.interestRate = interestRate;
    }

    public double balCheck()
    {
        return bal;
    }

    public void getInterest()
    {
       for (int i = 1; i < 5; i++)
       {
           System.out.println(i + " years of interest.");
           double interest = bal * interestRate / 100;
           bal += interest;
           System.out.println(bal);
       }
    }

}
