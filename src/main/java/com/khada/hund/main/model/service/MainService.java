package com.khada.hund.main.model.service;

import com.khada.hund.main.model.dto.UserDTO;

public interface MainService {

    String loginUser(UserDTO user);

    void insertUser(UserDTO user);
}
