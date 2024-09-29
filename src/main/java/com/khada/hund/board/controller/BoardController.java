package com.khada.hund.board.controller;


import com.khada.hund.board.model.dto.BoardDTO;
import com.khada.hund.board.model.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/board")
public class BoardController {

    private final BoardService service;

    public BoardController(BoardService service) {
        this.service = service;
    }

    @GetMapping("/write")
    public ModelAndView postingForum(ModelAndView mv){

        mv.setViewName("/board/writePage");
        return mv;
    }

    @PostMapping("/write")
    public String insertBoard (@ModelAttribute BoardDTO board){

        log.info("board : "  + board);

        service.insertBoard(board);

        return "redirect:/";
    }

    @GetMapping("/{postCode}")
    public ModelAndView boardDetail(@PathVariable String postCode, ModelAndView mv){

        log.info("postCode : " + postCode);

        BoardDTO board = service.selectBoardPostCode(postCode);

        service.updateRecommend(postCode);

        mv.addObject("board", board);

        mv.setViewName("board/detail");

        return mv;
    }

    @GetMapping("/edit/{postCode}")
    public ModelAndView boardEdit(@PathVariable String postCode, ModelAndView mv){

        BoardDTO board = service.selectBoardPostCode(postCode);

        mv.addObject("board", board);

        log.info("board : " + board);

        mv.setViewName("board/editBoard");

        return mv;
    }

    @PostMapping("/edit")
    public String editBoard(@ModelAttribute BoardDTO board){

        service.editBoard(board);

        return "redirect:/";
    }

    @PostMapping("/delete/{postCode}")
    public String deleteBoard(@PathVariable String postCode){

        service.deleteBoard(postCode);
        return "redirect:/";
    }
}
