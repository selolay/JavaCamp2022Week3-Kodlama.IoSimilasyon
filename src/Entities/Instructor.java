package Entities;

public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;
    private Course[] courses;

    public Instructor() {

    }
    public Instructor(int instructorId, String firstName, String lastName, Course[] courses) {
        this.instructorId = instructorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
