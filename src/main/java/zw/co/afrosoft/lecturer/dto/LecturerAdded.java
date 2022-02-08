package zw.co.afrosoft.lecturer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zw.co.afrosoft.lecturer.entity.Lecturer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LecturerAdded {

    private String status;
    private Lecturer lecturer;
}
