package com.khada.hund.comment.model.service;


import com.khada.hund.comment.model.dao.CommentMapper;
import com.khada.hund.comment.model.dto.CommentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CommentServiceImpl implements CommentService{

	private final CommentMapper mapper;

	public CommentServiceImpl(CommentMapper mapper){this.mapper = mapper;};

	@Override
	public void insertComment(CommentDTO comment){
	
		mapper.insertComment(comment);
	}

	@Override
	public List<CommentDTO> selectCommentPostCode(String postCode) {
		return mapper.selectCommentPostCode(postCode);
	}

	@Override
	public void editComment(CommentDTO comment) {
		mapper.editComment(comment);
	}

	@Override
	public void deleteComment(CommentDTO comment) {
		mapper.deleteComment(comment);
	}
}
