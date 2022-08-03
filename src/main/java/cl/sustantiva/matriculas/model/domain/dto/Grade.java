package cl.sustantiva.matriculas.model.domain.dto;

import lombok.Data;

@Data
public class Grade {
    private Integer gradeId;
    private String code;
    private String name;
    private Integer teacherId;
    private Teacher teacher;
}
