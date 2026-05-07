package acc.br.pessoa.entity.user.dtos;

import acc.br.pessoa.entity.enums.UserRoles;

public record RegisterDTO(String login, String password, UserRoles role) {

}
