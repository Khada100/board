package com.khada.hund.comment.repository;

import com.khada.hund.comment.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findByCommentPostCode(Pageable pageComment, Long postCode);
}
