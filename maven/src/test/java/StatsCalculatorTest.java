/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.LinkedList;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.edu.sumdu.EmailException;
import ua.edu.sumdu.Student;
import ua.edu.sumdu.Utils;

/**
 *
 * @author serega
 */
public class StatsCalculatorTest {

    static LinkedList<Student> studs;

    @BeforeAll
    public static void setupData() {
        studs = new LinkedList();
        studs.add(new Student("Test1", "Test1", "19", "test1@test.ua", "test", "test"));
        studs.add(new Student("Test2", "Test2", "29", "test2@test.ua", "test", "test"));
        studs.add(new Student("Test3", "Test3", "24", "test3@test.ua", "test", "test"));
        studs.add(new Student("Test4", "Test4", "27", "test4@test.ua", "test", "test"));
        studs.add(new Student("Test5", "Test5", "24", "test5@test.ua", "test", "test"));
        studs.add(new Student("Test6", "Test6", "21", "test6@test.ua", "test", "test"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getEmailDomainTest() {
        String result = Utils.getEmailDomain("test@gmail.com");
        assertEquals(result, "gmail.com");
    }

    @Test
    public void whenExceptionThrown_thenExpactationSatisfied() throws EmailException {
        studs.add(new Student("Exception", "Exception", "-1", "email", "test", "test"));
        Assertions.assertThrows(EmailException.class, () -> {
            Utils.calculatePopularDomain(studs);

        });
        studs.remove(6);
    }

    @Test
    public void patternMatchesTest() {
        String emailAddress = "username@domain.com";
        assertTrue(Utils.patternMatches(emailAddress));
    }

    @Test
    public void calculatePopularDomainTest() throws EmailException {
        String result = Utils.calculatePopularDomain(studs);
        assertEquals("test.ua", result);
    }

    @Test
    public void calculateMeanAgeTest() {
        double result = Utils.calculateMeanAge(studs);
        assertEquals(24, result);
    }
}
