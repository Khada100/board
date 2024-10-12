package com.khada.hund.main.model.service;


import com.khada.hund.main.model.dao.MainMapper;
import com.khada.hund.main.model.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MainServiceImpl implements MainService{

    private final MainMapper mapper;

    public MainServiceImpl(MainMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String loginUser(UserDTO user) {

        String isLogin = "";

        UserDTO loginUser = mapper.loginUser(user);

        log.info("loginUser : "  + loginUser);

        if (loginUser == null){
            isLogin = "false";
        }else {
            isLogin = "true";
        }
        log.info("loginUser123: "  + loginUser);
        return isLogin;
    }

    @Override
    public void insertUser(UserDTO user) {
        mapper.insertUser(user);
    }
}
