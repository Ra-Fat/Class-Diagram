import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Person {
    protected String lecturerId;
    protected String department;
    protected List<String> coursesTaught;
    protected String officeHours;  // e.g., "Mon 2-4pm, Wed 10-12am"

    public Lecturer(String id, String name, String email, String phone, int age, String gender, String address,
                    String lecturerId, String department) {
        super(id, name, email, phone, age, gender, address);
        this.lecturerId = lecturerId;
        this.department = department;
        this.coursesTaught = new ArrayList<>();
        this.officeHours = "";
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void updateLecturerId(String newLecturerId) {
        this.lecturerId = newLecturerId;
    }

    public String getDepartment() {
        return department;
    }

    public void updateDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void addCourse(String courseCode) {
        if (!coursesTaught.contains(courseCode)) {
            coursesTaught.add(courseCode);
        }
    }

    public void removeCourse(String courseCode) {
        coursesTaught.remove(courseCode);
    }

    public String getLecturerInfo() {
        return name + " [" + lecturerId + "] - Department: " + department +
               "\nCourses: " + (coursesTaught.isEmpty() ? "None" : String.join(", ", coursesTaught)) +
               "\nOffice Hours: " + (officeHours.isEmpty() ? "Not Set" : officeHours);
    }

    @Override
    public String getContactInfo() {
        return super.getContactInfo() + " | Department: " + department;
    }

    public void updateContactInfo(String newEmail, String newPhone) {
        updateEmail(newEmail);
        updatePhone(newPhone);
    }
}
