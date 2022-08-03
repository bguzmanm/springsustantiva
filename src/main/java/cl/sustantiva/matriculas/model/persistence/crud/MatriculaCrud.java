package cl.sustantiva.matriculas.model.persistence.crud;

import cl.sustantiva.matriculas.model.persistence.entity.Matricula;
import cl.sustantiva.matriculas.model.persistence.entity.MatriculaPK;
import org.springframework.data.repository.CrudRepository;

public interface MatriculaCrud extends CrudRepository<Matricula, MatriculaPK> {
}
