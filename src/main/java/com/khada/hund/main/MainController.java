package com.khada.hund.main;


import com.khada.hund.board.model.dto.BoardDTO;
import com.khada.hund.board.model.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Slf4j
public class MainController {

    private final BoardService boardService;

    public MainController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping(value = {"/", "/main"})
    public ModelAndView mainLocation(ModelAndView mv){

        List<BoardDTO> boardList = boardService.selectAllBoard();

        mv.addObject("boardList" , boardList);

        log.info("boardList : " + boardList);

        mv.setViewName("main/index");
        return mv;
    }
}
