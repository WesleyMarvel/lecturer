package zw.co.afrosoft.lecturer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseCreatedAcknowledgement {
    
    private String courseCode;
    private String status;
}
