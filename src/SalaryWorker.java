import java.util.Objects;

public class SalaryWorker extends Worker
{
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked)
    {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        System.out.println("The weekly pay is a fraction of the yearly salary.");
        System.out.println("Weekly pay: " + weeklyPay);
    }

    @Override
    public String toCSV()
    {
        return super.toCSV() + ", " + annualSalary;
    }

    @Override
    public String toJSON()
    {
        return super.toJSON() + "\", \"annualSalary\": " + annualSalary + " }";
    }

    @Override
    public String toXML()
    {
        return super.toXML() + "\" annualSalary=\"" + annualSalary + "\" />";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalaryWorker that = (SalaryWorker) o;
        return Double.compare(annualSalary, that.annualSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), annualSalary);
    }

    @Override
    public String toString() {
        return "SalaryWorker{" + super.toString() +
                "annualSalary=" + annualSalary +
                '}';
    }
}
