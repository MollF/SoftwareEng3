package College;

/**
 *
 * @author Mollie Fairclough 1730941
 */

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.Years;

public class Student {
    
    String name; // Student's full name
    int age; // Studet's age
    DateTime dob; // -year month day hour minute-
    int IdNum; // Studet's id number
    String username; // Student's username
    String courses[]; // Array of student's courses
    String modules[]; // Array of Student's modules
    DateTime currentDate;// = DateTime.now(); // make this equal current date
    
    
    public Student(String name, DateTime dob, int IdNum) {
        this.name = name;
        this.dob = dob;
        this.IdNum = IdNum;
    }
    
        public int findAge() {
        currentDate = DateTime.now();
        age = Years.yearsBetween(dob, currentDate).getYears();
        return age;
    }
        
    public String createUsername(){
        String usr = name + findAge();
        username = usr.replace(" ","_");
    return username;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }


    
    
    
    
    
    
}
