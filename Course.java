import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int credit;
    private String department;
    private List<String> enrolledStudentIds;

    public Course(String courseCode, String courseName, int credit, String department) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.enrolledStudentIds = new ArrayList<>();
    }

    public String getCourseInfo() {
        return "";
    }


    public void updateCourseInfo() {
    }

    public int getCreditHours() {
        return credit;
    }

    public void updateCreditHours(int creditHours) {
    }


    public List<String> getEnrolledStudentIds() {
        return enrolledStudentIds;
    }

}
