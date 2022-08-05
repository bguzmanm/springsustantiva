package cl.sustantiva.matriculas.model.domain.repository;


import cl.sustantiva.matriculas.model.domain.dto.Rol;

import java.util.List;
import java.util.Optional;

public interface RolRepository {
    Optional<List<Rol>> findAll();
    Optional<Rol> findById(int rolId);
    Optional<Rol> findByRolName(String rolName);
    Rol save(Rol rol);
    void delete(int rolId);
}
