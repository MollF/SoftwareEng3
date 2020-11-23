/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        Student instance = new Student("John Doe", new DateTime(1998,07,02,00,30), 12345678);
        String expResult = "John_Doe22";
        
        String result = instance.createUsername();
        assertEquals(expResult, result);
        
    }
    
        /**
     * Test of createUsername method, of class Student.
     */
    @Test
    public void testAddModule() {
        System.out.println("AddModule");
        Module m = new Module("Digital Signal Processing","EE445");
        Student s = new Student("John Doe", new DateTime(1998,07,02,00,30), 12345678);
        
        s.addModule(m);
        ArrayList<Module> moduleList = s.getModules();
        assert(moduleList.contains(m));
        
    }
    
        /**
     * Test of createUsername method, of class Student.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("RemoveModule");
        Module m = new Module("Digital Signal Processing","EE445");
        Student s = new Student("John Doe", new DateTime(1998,07,02,00,30), 12345678);
        
        s.addModule(m);
        s.removeModule(m);
        ArrayList<Module> moduleList = s.getModules();
        assert(!moduleList.contains(m)); 

    }

    
}
