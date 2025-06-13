import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private String major;
    private int year;
    private double gpa;
    private List<String> enrolledCourses;

    public Student(String id, String firstName, String lastName, String DOB,
                   String email, String phone, String gender, String address,
                   String studentId, String major, int year, double gpa) {

        super(id, firstName, lastName, DOB, email, phone, gender, address);
        this.studentId = studentId;
        this.major = major;
        this.year = year;
        this.gpa = gpa;
        this.enrolledCourses = new ArrayList<>();
    }

    public void getStudentInfo() {
    }

    public void updateStudentInfo() {
    }

    public boolean hasHonor() {
        return gpa >= 3.5;
    }

    public void viewResource() {
    }
}
