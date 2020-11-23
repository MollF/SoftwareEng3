/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import College.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.DateTime;

/**
 *
 * @author 35387
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    /**
     * Test of findAge method, of class Student.
     */
    @Test
    public void testFindAge() {
        System.out.println("findAge");
        Student instance = new Student("John Doe", new DateTime(1998,07,02,00,30), 12345678);
        int expResult = 22;
        int result = instance.findAge();
        assertEquals(expResult, result);

    }
    
    /**
     * Test of createUsername method, of class Student.
     */
    @Test
    public void testCreateUsername() {
        System.out.println("createUsername");
        //String name = "";
       // int age = 0;
        Student instance = new Student("John Doe", new DateTime(1998,07,02,00,30), 12345678);
        String expResult = "John_Doe22";
        
        String result = instance.createUsername();
        assertEquals(expResult, result);

    }


}
