package com.uamex.estudiantesregistro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejadorExcepciones {

    @ExceptionHandler({NoUpdateException.class
            ,NoCreateException.class
            ,NoDeleteException.class})
    public ResponseEntity<String> customExceptions(Exception e){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }
    @ExceptionHandler(NoFindException.class)
    public ResponseEntity<String> noFindException(NoFindException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
    }
    @ExceptionHandler(DuplicateDataException.class)
    public ResponseEntity<String> duplicateMatriculaException(DuplicateDataException e){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(e.getMessage());
    }

}
