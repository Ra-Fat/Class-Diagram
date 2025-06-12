import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentId;
    private String name;
    private String building;
    private List<Course> courses;
    private List<Lecturer> lecturers;

    public Department(String departmentId, String name, String building) {
        this.departmentId = departmentId;
        this.name = name;
        this.building = building;
        this.courses = new ArrayList<>();
        this.lecturers = new ArrayList<>();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void updateDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public String getBuilding() {
        return building;
    }

    public void updateBuilding(String building) {
        this.building = building;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void addLecturer(Lecturer lecturer) {
        if (!lecturers.contains(lecturer)) {
            lecturers.add(lecturer);
        }
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturers.remove(lecturer);
    }

    public String getDepartmentInfo() {
        return "Department: " + name + " (ID: " + departmentId + "), Building: " + building +
               ", Courses: " + courses.size() + ", Lecturers: " + lecturers.size();
    }
}
