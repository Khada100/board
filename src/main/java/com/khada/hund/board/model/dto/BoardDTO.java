package com.khada.hund.board.model.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BoardDTO {
    private Long postCode;
    private String title;
    private String writer;
    private String detail;
    private Long recommend;
    private String writeDateTime;
}
