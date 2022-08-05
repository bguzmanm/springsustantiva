package cl.sustantiva.matriculas.model.persistence.mapper;

import cl.sustantiva.matriculas.model.domain.dto.Rol;
import cl.sustantiva.matriculas.model.persistence.entity.RolEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RolMapper {
    @Mappings({
            @Mapping(source = "rolId", target = "rolId"),
            @Mapping(source = "rolName", target = "rolName"),
    })
    Rol toRol(RolEntity rol);
    List<Rol> toRoles(Iterable<RolEntity> roles);
    @InheritInverseConfiguration
    RolEntity toRolEntity(Rol rol);
}
