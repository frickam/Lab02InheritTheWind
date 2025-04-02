public class SmartPiggyBank extends PiggyBank
{
    private double matchPercent;

    public SmartPiggyBank(double balance, double matchPercent)
    {
        super(balance);
        this.matchPercent = matchPercent;
    }

    public SmartPiggyBank(PiggyBank bank, double matchPercent)
    {
        super(bank.getBalance());
        this.matchPercent = matchPercent;
    }

    @Override
    public void stash(double amount)
    {
        super.stash(amount + matchPercent * amount);
    }

    @Override
    public String toString() {
        return "SmartPiggyBank{" + super.toString() +
                "matchPercent=" + matchPercent +
                '}';
    }
}
