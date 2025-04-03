import java.util.ArrayList;

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

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(Billy);
        workers.add(Sally);
        workers.add(Greg);
        workers.add(Steve);
        workers.add(Jenna);
        workers.add(Zack);

        for (Worker worker : workers) {
            System.out.println(worker);
        }

        int[] hoursWorked = {40, 50, 40};

        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-10s%n", "ID", "Name", "Title", "Week 1", "Week 2", "Week 3", "Total");
        System.out.println("------------------------------------------------------------------------------");
        for (Worker worker : workers) {
            double totalPay = 0;
            System.out.printf("%-10s %-15s %-10s", worker.getID(), worker.getFullName(), worker.getTitle());
            for (int hours : hoursWorked) {
                double weeklyPay = worker.calculateWeeklyPay(hours);
                totalPay += weeklyPay;
                System.out.printf(" %-10.2f", weeklyPay);
            }
            System.out.printf(" %-10.2f%n", totalPay);
        }

    }
}