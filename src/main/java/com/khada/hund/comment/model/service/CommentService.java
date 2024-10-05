package com.khada.hund.comment.model.service;

import com.khada.hund.comment.model.dto.CommentDTO;

import java.util.List;

public interface CommentService {

	void insertComment(CommentDTO comment);

    List<CommentDTO> selectCommentPostCode(String postCode);

    void editComment(CommentDTO comment);

    void deleteComment(CommentDTO comment);
}
