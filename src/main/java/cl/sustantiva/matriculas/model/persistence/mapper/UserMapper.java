package cl.sustantiva.matriculas.model.persistence.mapper;

import cl.sustantiva.matriculas.model.domain.dto.User;
import cl.sustantiva.matriculas.model.persistence.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RolMapper.class})
public interface UserMapper {

    @Mappings({
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "enabled", target = "enabled"),
            @Mapping(source = "roles", target = "roles"),
    })
    User toUser(UserEntity user);
    List<User> toUsers(List<UserEntity> users);
    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);

}
