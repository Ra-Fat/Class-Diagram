
import java.util.ArrayList;

public class Classroom {
    private String classroomId;
    private String classroomName;
    private int capacity;
    private String location;
    private ArrayList<Student> studentsInClassroom;
    private Lecturer lecturerInClassroom;
    private Course courseInClassroom;


    public Classroom(String classroomId, String classroomName, int capacity, String location) {
        this.classroomId = classroomId;
        this.classroomName = classroomName;
        this.capacity = capacity;
        this.location = location;
    }

    public void addStudentToClassroom(Student student){

    }
    public void addLecturerToClassroom(Lecturer lecturer){

    }
    public void addCourseToClassroom(Course course){

    }

    public String getClassroomId() {
        return "";
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClassroomInfo() {
        return "Classroom ID: " + classroomId + ", Name: " + classroomName + 
               ", Capacity: " + capacity + ", Location: " + location;
    }
}
