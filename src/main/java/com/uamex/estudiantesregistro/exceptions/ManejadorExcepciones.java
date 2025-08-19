package com.uamex.estudiantesregistro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejadorExcepciones {

    @ExceptionHandler(NoFindException.class)
    public ResponseEntity<String> noFindException(NoFindException e){
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(e.getMessage());
    }

}
