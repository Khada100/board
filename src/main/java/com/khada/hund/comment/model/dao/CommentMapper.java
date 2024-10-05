package com.khada.hund.comment.model.dao;

import com.khada.hund.comment.model.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
	void insertComment(CommentDTO comment);

    List<CommentDTO> selectCommentPostCode(String postCode);

    void editComment(CommentDTO comment);

    void deleteComment(CommentDTO comment);
}
