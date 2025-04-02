public class Main
{
    public static void main(String[] args)
    {
        PiggyBank aaronBank = new PiggyBank(500.00);
        SmartPiggyBank sallyBank = new SmartPiggyBank(100.0, .50);

        System.out.println("Aaron has " + aaronBank.getBalance());

        System.out.println(aaronBank);
        System.out.println();
        System.out.println(sallyBank);

        aaronBank.stash(200);
        sallyBank.stash(100);



    }
}