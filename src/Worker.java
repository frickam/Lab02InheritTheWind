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

    public double calculateWeeklyPay(double hoursWorked)
    {
        if (hoursWorked >= 40)
        {
            double otPay = 0;
            (hoursWorked - 40) * hourlyPayRate * 1.5 = otPay;
            double regPay = 0;
            40 * hourlyPayRate = regPay;
            double total = otPay + regPay;
            return "Overtime pay is: " + otPay + " Regular pay is: " + regPay" Total pay is: " + total;
        }
        else
        {
            double total = hourlyPayRate * hoursWorked;
            return "Total weekly pay is: " + total;
        }
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
