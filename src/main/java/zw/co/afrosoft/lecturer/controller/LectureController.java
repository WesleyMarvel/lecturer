package zw.co.afrosoft.lecturer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import zw.co.afrosoft.lecturer.dto.CourseCreatedAcknowledgement;
import zw.co.afrosoft.lecturer.dto.CourseRequest;
import zw.co.afrosoft.lecturer.dto.LectureRequest;
import zw.co.afrosoft.lecturer.dto.LecturerAdded;
import zw.co.afrosoft.lecturer.service.CourseService;
import zw.co.afrosoft.lecturer.service.LecturerService;

@RestController
public class LectureController {

    @Autowired
    private CourseService service;
    @Autowired
    private LecturerService service2;


    @PostMapping("/createcourse")
    public CourseCreatedAcknowledgement createCourse(@RequestBody CourseRequest request){
        return service.createCourse(request);
    }

    @PostMapping("/addlecturer")
    public LecturerAdded addLecturer(@RequestBody LectureRequest request){
        return service2.addLecturer(request);
    }
}
