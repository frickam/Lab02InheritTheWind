import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    private SalaryWorker salaryWorker;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        salaryWorker = new SalaryWorker("12345678", "John", "Doe", "Mr.", 1990, 20.0, 52000.0);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void getAnnualSalary() {
        assertEquals(52000.0, salaryWorker.getAnnualSalary());
    }

    @Test
    void setAnnualSalary() {
        salaryWorker.setAnnualSalary(60000.0);
        assertEquals(60000.0, salaryWorker.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(40.0), 0.01);
        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(45.0), 0.01);
    }



    @Test
    void toCSV() {
        String expected = "12345678, John, Doe, Mr., 1990, 20.0, 52000.0";
        assertEquals(expected, salaryWorker.toCSV());
    }






    @Test
    void testEquals() {
        SalaryWorker salaryWorker2 = new SalaryWorker("12345678", "John", "Doe", "Mr.", 1990, 20.0, 52000.0);
        SalaryWorker salaryWorker3 = new SalaryWorker("87654321", "Jane", "Doe", "Ms.", 1992, 25.0, 60000.0);
        assertTrue(salaryWorker.equals(salaryWorker2));
        assertFalse(salaryWorker.equals(salaryWorker3));
    }

    @Test
    void testHashCode() {
        SalaryWorker salaryWorker2 = new SalaryWorker("12345678", "John", "Doe", "Mr.", 1990, 20.0, 52000.0);
        assertEquals(salaryWorker.hashCode(), salaryWorker2.hashCode());
    }


}