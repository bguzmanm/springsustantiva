package cl.sustantiva.matriculas.model.persistence.crud;

import cl.sustantiva.matriculas.model.persistence.entity.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteCrud extends CrudRepository<Estudiante, Integer> {
}
