package zw.co.afrosoft.lecturer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.lecturer.entity.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> {

}
