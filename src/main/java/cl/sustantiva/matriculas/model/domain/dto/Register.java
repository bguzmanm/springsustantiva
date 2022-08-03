package cl.sustantiva.matriculas.model.domain.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Register {
    private Integer studentId;
    private Integer gradeId;
    private Student student;
    private Grade grade;
    private LocalDate date;
}
