package cl.sustantiva.matriculas.model.persistence.crud;

import cl.sustantiva.matriculas.model.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrud extends CrudRepository<UserEntity, String> {
    boolean existsByUsername(String username);
}
