package com.khada.hund.main.model.dao;

import com.khada.hund.main.model.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {

    UserDTO loginUser(UserDTO user);
}
