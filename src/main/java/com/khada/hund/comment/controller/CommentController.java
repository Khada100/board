package com.khada.hund.comment.controller;


import com.khada.hund.comment.model.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@Slf4j
public class CommentController {

    private final CommentService service;


    public CommentController(CommentService service) {
        this.service = service;
    }
}
