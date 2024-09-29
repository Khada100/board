package com.khada.hund.board.model.service;

import com.khada.hund.board.model.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    void insertBoard(BoardDTO board);

    List<BoardDTO> selectAllBoard();

    BoardDTO selectBoardPostCode(String postCode);

    void updateRecommend(String postCode);

    void editBoard(BoardDTO board);

    void deleteBoard(String postCode);
}
