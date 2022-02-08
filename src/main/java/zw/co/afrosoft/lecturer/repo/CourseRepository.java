package zw.co.afrosoft.lecturer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.lecturer.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
