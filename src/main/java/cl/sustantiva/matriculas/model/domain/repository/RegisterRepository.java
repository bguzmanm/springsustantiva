package cl.sustantiva.matriculas.model.domain.repository;

import cl.sustantiva.matriculas.model.domain.dto.Register;

import java.util.List;
import java.util.Optional;

public interface RegisterRepository {
    Optional<List<Register>> findAll();
    Optional<Register> findById(int registerId);
    Register save(Register register);
    void delete(int registerId);
}
