package College;

/**
 *
 * @author Mollie Fairclough 1730941
 */
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.Years;


public class CourseProgram {
    
    String courseName;
    String modules[];
    String enrolledStudents[];
    DateTime startDate;
    DateTime endDate;

    public CourseProgram(String courseName, String[] modules) {
        this.courseName = courseName;
        this.modules = modules;
    }

    public String[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(String[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

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
    
    
    
}
