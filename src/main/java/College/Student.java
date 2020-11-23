package College;

/**
 *
 * @author Mollie Fairclough 1730941
 */

import java.util.ArrayList;
import org.joda.time.*;


public class Student {
    
    String name; // Student's full name
    int age; // Studet's age
    DateTime dob; // -"year month day hour minute"-
    int IdNum; // Studet's id number
    String username; // Student's username
    String course; // student's course
    ArrayList<Module> modules = new ArrayList<>(); // ArrayList of student's modules
    DateTime currentDate;// current date
    
    
    public Student(String name, DateTime dob, int IdNum) {
        this.name = name;
        this.dob = dob;
        this.IdNum = IdNum;
    }
    
    // method to calculate student age from dob
        public int findAge() {
        currentDate = DateTime.now();
        age = Years.yearsBetween(dob, currentDate).getYears();
        return age;
    }
    
    // method to create a username for the studet using their full name and age
    public String createUsername(){
        String usr = name + findAge();
        username = usr.replace(" ","_");
    return username;
    }

    public String getCourse() {
        return course;
    }
    public void setCourses(String course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    // add a module object to the ArrayList Module
    public void addModule(Module module) {
        modules.add(module);
    }
    //remove a module object from the ArrayList Module
      public void removeModule(Module module) {
        modules.remove(module);
    }

    @Override
    public String toString() {
        return "Student{" + "name = " + name + ", username = " + username + ", modules = " + modules + ", course = " + course  + '}';
    }

}
