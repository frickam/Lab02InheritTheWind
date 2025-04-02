public class PiggyBank
{
    private double balance;

    public PiggyBank(double balance)
    {
        this.balance = balance;
    }

    public PiggyBank()
    {
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void stash(double amount)
    {
        balance += amount;
    }

    public void rob(double amount)
    {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "PiggyBank{" +
                "balance=" + balance +
                '}';
    }
}
