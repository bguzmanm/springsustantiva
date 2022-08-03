package cl.sustantiva.matriculas.model.persistence.crud;

import cl.sustantiva.matriculas.model.persistence.entity.Facilitador;
import org.springframework.data.repository.CrudRepository;

public interface FacilitadorCrud extends CrudRepository<Facilitador, Integer> {
}
