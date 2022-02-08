package zw.co.afrosoft.lecturer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.lecturer.dto.LectureRequest;
import zw.co.afrosoft.lecturer.dto.LecturerAdded;
import zw.co.afrosoft.lecturer.entity.Lecturer;
import zw.co.afrosoft.lecturer.repo.LecturerRepository;

import javax.transaction.Transactional;

@Service
public class LecturerService {

    @Autowired
    private LecturerRepository lecturerRepository;

    @Transactional
    public LecturerAdded addLecturer(LectureRequest request){
        Lecturer lecturer = request.getLecturer();
        lecturer = lecturerRepository.save(lecturer);

        return new LecturerAdded("SUCCESS", lecturer);
    }
}
