package com.khada.hund.board.model.service;



import com.khada.hund.board.model.dao.BoardMapper;
import com.khada.hund.board.model.dto.BoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService{

    private final BoardMapper mapper;

    public BoardServiceImpl(BoardMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void insertBoard(BoardDTO board) {
        mapper.insertBoard(board);
    }

    @Override
    public List<BoardDTO> selectAllBoard() {

        return mapper.selectAllBoard();
    }

    @Override
    public BoardDTO selectBoardPostCode(String postCode) {
        return mapper.selectBoardPostCode(postCode);
    }

    @Override
    public void updateRecommend(String postCode) {
        mapper.updateRecommend(postCode);
    }

    @Override
    public void editBoard(BoardDTO board) {
        mapper.editBoard(board);
    }

    @Override
    public void deleteBoard(String postCode) {
        mapper.deleteBoard(postCode);
    }
}
