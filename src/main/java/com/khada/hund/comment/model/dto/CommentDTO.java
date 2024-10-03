package com.khada.hund.comment.model.dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentDTO {
    private Long commentCode;
    private String commentTime;
    private String commentDetail;
    private Long commentLike;
    private String commentId;
    private Long commentPostCode;
}
