package zw.co.afrosoft.lecturer.dto;


import zw.co.afrosoft.lecturer.entity.Course;


public class CourseRequest {

    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
