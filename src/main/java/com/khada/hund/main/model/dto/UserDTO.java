package com.khada.hund.main.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    String id;
    String name;
    String email;
    String phone;
    String pwd;
}
