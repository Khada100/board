package com.khada.hund.board.model.dao;

import com.khada.hund.board.model.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    void insertBoard(BoardDTO board);

    List<BoardDTO> selectAllBoard();

    BoardDTO selectBoardPostCode(String postCode);

    void updateRecommend(String postCode);

    void editBoard(BoardDTO board);

    void deleteBoard(String postCode);
}
