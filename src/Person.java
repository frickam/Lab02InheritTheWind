import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public class Person
{

    private String ID = "";
    private String firstName = "";
    private String lastName = "";
    private String title = "";
    private int YOB = 0;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getFullName()
    {
        return this.getFirstName() + " " + this.getLastName();
    }

    public String getFormalName()
    {
        return title + " " + getFullName();
    }

    public String getAge()
    {
        int currentYear = LocalDate.now().getYear();
        return this.getFullName() + " is " + String.valueOf(currentYear - YOB) + " Years Old.";
    }

    public String getAge(int year)
    {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        if (year > currentYear)
        {
            return "The specified year is in the future";
        }

        return "In " + year + " " + this.getFullName() + " was " + String.valueOf(year - YOB) + " Years Old.";
    }

    public String toCSV()
    {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    public String toJSON()
    {
        return "{ \"ID\": \"" + ID + "\", \"firstName\": \"" + firstName + "\", \"lastName\": \"" + lastName + "\", \"title\": \"" + title + "\", \"YOB\": " + YOB + " }";
    }

    public String toXML()
    {
        return "<Person ID=\"" + ID + "\" firstName=\"" + firstName + "\" lastName=\"" + lastName + "\" title=\"" + title + "\" YOB=\"" + YOB + "\" />";
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(ID, person.ID) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(title, person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, firstName, lastName, title, YOB);
    }
}
