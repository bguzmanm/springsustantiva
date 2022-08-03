package cl.sustantiva.matriculas.model.domain.repository;

import cl.sustantiva.matriculas.model.domain.dto.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherRepository {
    Optional<List<Teacher>> findAll();
    Optional<Teacher> findById(int teacherId);
    Teacher save(Teacher teacher);
    void delete(int teacherId);
}
