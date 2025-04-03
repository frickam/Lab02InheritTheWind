public class InheritanceDemo
{
    public static void main(String[] args)
    {
        Worker Billy = new Worker("000001", "Billy", "Vickrey", "Mr.", 2001, 17.50);
        Worker Sally = new Worker("000002", "Sally", "Smith", "Mrs.", 2005, 19.50);
        Worker Greg = new Worker("000003", "Greg", "Marston", "Mr.", 1978, 25.0);

        SalaryWorker Steve = new SalaryWorker("000004", "Steve", "Campbell", "Mr.", 1992, 0, 55000);
        SalaryWorker Jenna = new SalaryWorker("000005", "Jenna", "Rodgers", "Mrs.", 1994, 0, 60000);
        SalaryWorker Zack = new SalaryWorker("000006", "Zack", "Witt", "Mr.", 1995, 0, 52000);

    }
}