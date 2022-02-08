package zw.co.afrosoft.lecturer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.lecturer.dto.CourseCreatedAcknowledgement;
import zw.co.afrosoft.lecturer.dto.CourseRequest;
import zw.co.afrosoft.lecturer.entity.Course;
import zw.co.afrosoft.lecturer.repo.CourseRepository;

import javax.transaction.Transactional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Transactional
    public CourseCreatedAcknowledgement createCourse(CourseRequest request) {
        Course course= request.getCourse();
        var coursesList = courseRepository.findAll();

        String pre = "CS";
        String name = null;

        int i;
        for (i = 0; i < coursesList.size(); i++){
            i++;
        }
        name = pre + String.format("%03d", i);

        course.setCourseCode(name);
        course.setCourseName(course.getCourseName());
        course = courseRepository.save(course);

        return new CourseCreatedAcknowledgement(course.getCourseName(), "SUCCESS");
    }
}
