package College;

/**
 *
 * @author Mollie Fairclough 1730941
 */
import java.util.ArrayList;
import org.joda.time.*;


public class CourseProgram {
    
    String courseName;
    ArrayList<Student> enrolledStudents = new ArrayList<>(); // ArrayList of students in course
    ArrayList<Module> courseModules = new ArrayList<>(); // ArrayList of modules in course
    DateTime startDate;
    DateTime endDate;

    public CourseProgram(String courseName) {
        this.courseName = courseName;
    }
    
    
    
    public ArrayList<Student> getStudents() {
        return enrolledStudents;
    }

    // add a module object to the ArrayList enrolledStudents
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }
    //remove a module object from the ArrayList enrolledStudents
      public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }
    
    
    public ArrayList<Module> getModules() {
        return courseModules;
    }

    // add a module object to the courseModules
    public void addModule(Module module) {
        courseModules.add(module);
    }
    //remove a module object from the ArrayList courseModules
      public void removeModule(Module module) {
        courseModules.remove(module);
    }

    
      
      
      
    
    // getters and setters for course start and end dates
    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "CourseProgram{" + "courseName=" + courseName + ", courseModules=" + courseModules + '}';
    }
    
    
    
}
