package com.codingshuttle.linkedin.user_service.dto;

import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String email;
    private String password;
}
