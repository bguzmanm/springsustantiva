package cl.sustantiva.matriculas.model.persistence.crud;

import cl.sustantiva.matriculas.model.persistence.entity.RolEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RolCrud extends CrudRepository<RolEntity, Integer> {

    Optional<RolEntity> findByRolName(String rolNome);
}
