package zw.co.afrosoft.lecturer.entity;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long cid;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_code")
    private String courseCode;

    @ManyToOne
    private Lecturer lecturer;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
