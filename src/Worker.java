import java.util.Objects;

public class Worker extends Person
{
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked >= 40) {
            double otPay = (hoursWorked - 40) * hourlyPayRate * 1.5;
            double regPay = 40 * hourlyPayRate;
            double total = otPay + regPay;
            System.out.println("Overtime pay is: " + otPay + " Regular pay is: " + regPay + " Total pay is: " + total);
            return total;
        } else {
            double total = hourlyPayRate * hoursWorked;
            System.out.println("Total weekly pay is: " + total);
            return total;
        }
    }

    public void displayWeeklyPay(double hoursWorked)
    {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return Double.compare(hourlyPayRate, worker.hourlyPayRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourlyPayRate);
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }
}
