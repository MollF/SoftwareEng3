package College;

import java.util.ArrayList;

/**
 *
 * @author Mollie Fairclough 1730941
 */
public class Module {
    
    String moduleName;
    String moduleiD;
    ArrayList<Student> students = new ArrayList<>(); // ArrayList of students in module
    ArrayList<CourseProgram> courses = new ArrayList<>(); // ArrayList of students in module
    String course; // Array of courses

    public Module(String moduleName, String moduleiD) {
        this.moduleName = moduleName;
        this.moduleiD = moduleiD;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    // add a module object to the ArrayList Student
    public void addStudent(Student student) {
        students.add(student);
    }
    //remove a module object from the ArrayList Student
      public void removeStudent(Student student) {
        students.remove(student);
    }


    public ArrayList<CourseProgram> getCourses() {
        return courses;
    }

    // add a module object to the ArrayList courses
    public void addCourse(CourseProgram course) {
        courses.add(course);
    }
    //remove a module object from the ArrayList courses
      public void removeCourse(CourseProgram course) {
        courses.remove(course);
    }

 
    
    
}
