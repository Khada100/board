package com.khada.hund.comment.service;

import com.khada.hund.comment.entity.Comment;
import com.khada.hund.comment.repository.CommentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Page<Comment> selectComment(int CommentPageNumber, Long postCode){

        Pageable pageComment = PageRequest.of(CommentPageNumber -1, 10);

        return commentRepository.findByCommentPostCode(pageComment, postCode);
    }


}
