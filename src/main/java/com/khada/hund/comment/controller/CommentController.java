package com.khada.hund.comment.controller;


import com.khada.hund.comment.model.dto.CommentDTO;
import com.khada.hund.comment.model.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comment")
@Slf4j
public class CommentController {

    private final CommentService service;


    public CommentController(CommentService service) {
        this.service = service;
    }

    @PostMapping("/insert")
    public String insertComment (@ModelAttribute CommentDTO comment){
    	
	    log.info("comment : " + comment);

	    service.insertComment(comment);

	    return "redirect:/";

    }

    @PostMapping("/edit")
    public String editComment(@ModelAttribute CommentDTO comment){

        log.info("comment : " + comment);

        service.editComment(comment);

        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteComment(@ModelAttribute CommentDTO comment){

        log.info("comment : " + comment);

        service.deleteComment(comment);

        return "redirect:/";
    }


}
