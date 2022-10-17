package Entities;

public class Course {
    private int courseId;
    private String title;
    private String instructor;
    private int price;
    private String info;
    private String img;

    public Course() {

    }

    public Course(int courseId, String title, String instructor, int price, String info, String img) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
        this.price = price;
        this.info = info;
        this.img = img;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
