package com.khada.hund.common;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@ToString
public class ResponseDTO {

    private int status;
    private String message;
    private Object data;

    public ResponseDTO() {
    }

    public ResponseDTO(HttpStatus status, String message, Object data) {
        this.status = status.value();
        this.message = message;
        this.data = data;
    }

}

