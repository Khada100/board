package com.khada.hund.comment.entity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "post_comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_code")
    private Long commentCode;
    @Column(name = "comment_time")
    private String commentTime;
    @Column(name = "comment_detail")
    private String commentDetail;
    @Column(name = "comment_like")
    private Long commentLike;
    @Column(name = "comment_id")
    private String commentId;
    @Column(name = "comment_pwd")
    private String commentPwd;
    @Column(name = "comment_post_code")
    private Long commentPostCode;
}
