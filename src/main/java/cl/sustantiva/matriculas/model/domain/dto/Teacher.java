package cl.sustantiva.matriculas.model.domain.dto;

import lombok.Data;

@Data
public class Teacher {
    private Integer teacherId;
    private String dni;
    private String name;
    private String email;
    private String phone;
    private Float cost;
    private String bank;
    private String account;
}
