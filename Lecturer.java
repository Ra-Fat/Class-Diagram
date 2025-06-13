import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Person {
    protected String lecturerId;
    protected String department;
    protected String position;
    protected String hireDate;
    protected List<String> coursesTaught;

    public Lecturer(String id, String firstName, String lastName, String DOB,
                    String email, String phone, String gender, String address,
                    String lecturerId, String department, String position, String hireDate) {

        super(id, firstName, lastName, DOB, email, phone, gender, address);
        this.lecturerId = lecturerId;
        this.department = department;
        this.position = position;
        this.hireDate = hireDate;
        this.coursesTaught = new ArrayList<>();
    }

    public void getLecturerInfo() {
    }

    public void updateLecturerInfo() {
    }

    public void checkAttendance() {
    }

    public void updateDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    public void addCourse(String courseCode) {
    }

    public void removeCourse(String courseCode) {
    }
}
