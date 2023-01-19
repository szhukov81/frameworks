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
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.edu.sumdu.EmailException;
import ua.edu.sumdu.Student;
import ua.edu.sumdu.Utils;

/**
 *
 * @author serega
 */
public class StatsCalculatorTest {

    static LinkedList<Student> studs;
    static ApplicationContext factory = new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");
    @BeforeAll
    public static void setupData() {
        studs = new LinkedList();
        Student student1 = (Student) factory.getBean("StudentTest");
        student1.setName("Test1");
        student1.setSurname("Test1");
        student1.setAge("19");
        student1.setEmail("test1@test.ua");
        student1.setGroup("test");
        student1.setFaculty("test");
        studs.add(student1);
        
        Student student2 = (Student) factory.getBean("StudentTest");
        student2.setName("Test2");
        student2.setSurname("Test2");
        student2.setAge("29");
        student2.setEmail("test2@test.ua");
        student2.setGroup("test");
        student2.setFaculty("test");
        studs.add(student2);
        
        Student student3 = (Student) factory.getBean("StudentTest");
        student3.setName("Test3");
        student3.setSurname("Test3");
        student3.setAge("24");
        student3.setEmail("test3@test.ua");
        student3.setGroup("test");
        student3.setFaculty("test");
        studs.add(student3);
        
        Student student4 = (Student) factory.getBean("StudentTest");
        student4.setName("Test4");
        student4.setSurname("Test4");
        student4.setAge("27");
        student4.setEmail("test4@test.ua");
        student4.setGroup("test");
        student4.setFaculty("test");
        studs.add(student4);
        
        Student student5 = (Student) factory.getBean("StudentTest");
        student5.setName("Test1");
        student5.setSurname("Test1");
        student5.setAge("24");
        student5.setEmail("test5@test.ua");
        student5.setGroup("test");
        student5.setFaculty("test");
        studs.add(student5);
        
        Student student6 = (Student) factory.getBean("StudentTest");
        student6.setName("Test1");
        student6.setSurname("Test1");
        student6.setAge("21");
        student6.setEmail("test6@test.ua");
        student6.setGroup("test");
        student6.setFaculty("test");
        studs.add(student6);
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
        Student student = (Student) factory.getBean("StudentTest");
        student.setName("Exception");
        student.setSurname("Exception");
        student.setAge("-1");
        student.setEmail("email");
        student.setGroup("test");
        student.setFaculty("test");
        studs.add(student);
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
