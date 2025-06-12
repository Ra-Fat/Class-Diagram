import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int creditHours;
    private String department;
    private List<String> enrolledStudentIds;

    public Course(String courseCode, String courseName, int creditHours, String department) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.department = department;
        this.enrolledStudentIds = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void updateCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void updateCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void updateCreditHours(int creditHours) {
        if (creditHours > 0) {
            this.creditHours = creditHours;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void updateDepartment(String department) {
        this.department = department;
    }

    public List<String> getEnrolledStudentIds() {
        return enrolledStudentIds;
    }

    public boolean enrollStudent(String studentId) {
        if (!enrolledStudentIds.contains(studentId)) {
            enrolledStudentIds.add(studentId);
            return true;
        }
        return false;
    }

    public String getCourseInfo() {
        return courseCode + ": " + courseName + " (" + creditHours + " credits), Dept: " + department +
               ", Enrolled Students: " + enrolledStudentIds.size();
    }
}
