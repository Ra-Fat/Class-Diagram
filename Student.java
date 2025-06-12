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

    public void enrollCourse(String courseName) {
        if (!enrolledCourses.contains(courseName)) {
            enrolledCourses.add(courseName);
        }
    }

    public void dropCourse(String courseName) {
        enrolledCourses.remove(courseName);
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void updateMajor(String newMajor) {
        this.major = newMajor;
    }

    public void updateYear(int newYear) {
        this.year = newYear;
    }

    public String getStudentInfo() {
        return name + " [" + studentId + "] - Major: " + major + ", Year: " + year + ", GPA: " + gpa;
    }

    public double getGPA() {
        return gpa;
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        }
    }

    public boolean hasHonor() {
        return gpa >= 3.5;
    }
}
