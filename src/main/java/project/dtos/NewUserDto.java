package project.dtos;

import lombok.Data;

@Data
public class NewUserDto {
    private String username;
    private String password;
    private String email;
}
