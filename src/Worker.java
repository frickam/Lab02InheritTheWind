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

    public void displayWeeklyPay(double hoursWorked) {
        double regPay;
        double otPay = 0;
        double totalPay;

        if (hoursWorked > 40) {
            regPay = 40 * hourlyPayRate;
            otPay = (hoursWorked - 40) * hourlyPayRate * 1.5;
        } else {
            regPay = hoursWorked * hourlyPayRate;
        }
        totalPay = regPay + otPay;

        System.out.println("Number of regular hours: " + (hoursWorked > 40 ? 40 : hoursWorked));
        System.out.println("Total regular pay: " + regPay);
        System.out.println("Number of overtime hours: " + (hoursWorked > 40 ? (hoursWorked - 40) : 0));
        System.out.println("Total overtime pay: " + otPay);
        System.out.println("Total combined pay: " + totalPay);
    }

    @Override
    public String toCSV()
    {
        return super.toCSV() + ", " + hourlyPayRate;
    }

    @Override
    public String toJSON()
    {
        return super.toJSON() + "\", \"hourlyPayRate\": " + hourlyPayRate + " }";
    }

    @Override
    public String toXML()
    {
        return super.toXML() + "\" hourlyPayRate=\"" + hourlyPayRate + "\" />";
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
