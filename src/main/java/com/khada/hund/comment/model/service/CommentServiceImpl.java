package com.khada.hund.comment.model.service;


import com.khada.hund.comment.model.dao.CommentMapper;
import com.khada.hund.comment.model.dto.CommentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommentServiceImpl implements CommentService{

	private final CommentMapper mapper;

	public CommentServiceImpl(CommentMapper mapper){this.mapper = mapper;};

	@Override
	public void insertComment(CommentDTO comment){
	
		mapper.insertComment(comment);
	}
}
