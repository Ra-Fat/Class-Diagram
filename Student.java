import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private String major;
    private int year;
    private double gpa;
    private List<String> enrolledCourses;

    public Student(String id, String name, String email, String phone, int age, String gender, String address,
                   String studentId, String major, int year, double gpa) {

        super(id, name, email, phone, age, gender, address);
        this.studentId = studentId;
        this.major = major;
        this.year = year;
        this.gpa = gpa;
        this.enrolledCourses = new ArrayList<>();
    }

    public void getStudentInfo() {}

    public void updateStudentInfo() {}

    public boolean hasHonor() {return gpa >= 3.5;}

    
}
