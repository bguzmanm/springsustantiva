package cl.sustantiva.matriculas.model.persistence.crud;

import cl.sustantiva.matriculas.model.persistence.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoCrud extends CrudRepository<Curso, Integer> {
}
