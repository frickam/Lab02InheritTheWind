import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    private Worker worker;

    @BeforeEach
    void setUp() {
        worker = new Worker("12345678", "John", "Doe", "Mr.", 1990, 20.0);
    }

    @Test
    void getHourlyPayRate() {
        assertEquals(20.0, worker.getHourlyPayRate());
    }

    @Test
    void setHourlyPayRate() {
        worker.setHourlyPayRate(25.0);
        assertEquals(25.0, worker.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        // Test regular pay
        assertEquals(800.0, worker.calculateWeeklyPay(40.0), 0.01);
        // Test pay with overtime
        assertEquals(950.0, worker.calculateWeeklyPay(45.0), 0.01);
    }

    @Test
    void displayWeeklyPay() {
        // Test regular pay output
        worker.displayWeeklyPay(40.0);
        // Test pay with overtime output
        worker.displayWeeklyPay(45.0);
    }

    @Test
    void testEquals() {
        Worker worker2 = new Worker("12345678", "John", "Doe", "Mr.", 1990, 20.0);
        Worker worker3 = new Worker("87654321", "Jane", "Doe", "Ms.", 1992, 25.0);
        assertTrue(worker.equals(worker2));
        assertFalse(worker.equals(worker3));
    }

    @Test
    void testHashCode() {
        Worker worker2 = new Worker("12345678", "John", "Doe", "Mr.", 1990, 20.0);
        assertEquals(worker.hashCode(), worker2.hashCode());
    }

    @Test
    void testToString() {
        String expected = "Worker{Person{ID='12345678', firstName='John', lastName='Doe', title='Mr.', YOB=1990}hourlyPayRate=20.0}";
        assertEquals(expected, worker.toString());
    }
}