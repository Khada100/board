package com.khada.hund.comment.model.dao;

import com.khada.hund.comment.model.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
	void insertComment(CommentDTO comment);
}
