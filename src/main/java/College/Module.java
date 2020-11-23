package College;

/**
 *
 * @author Mollie Fairclough 1730941
 */
public class Module {

    public Module(String moduleName, String moduleiD) {
        this.moduleName = moduleName;
        this.moduleiD = moduleiD;
    }
        
    String moduleName;
    String moduleiD;
    String students[]; // Array of students
    String courses[]; // Array of courses


    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

 
    
    
}
