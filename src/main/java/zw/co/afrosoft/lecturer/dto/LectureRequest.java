package zw.co.afrosoft.lecturer.dto;


import zw.co.afrosoft.lecturer.entity.Lecturer;


public class LectureRequest {

    private Lecturer lecturer;

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
