package cl.sustantiva.matriculas.model.domain.repository;

import cl.sustantiva.matriculas.model.domain.dto.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    Optional<List<Student>> findAll();
    Optional<Student> findById(int studentId);
    Student save(Student student);
    void delete(int studentId);
}
