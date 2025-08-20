package com.uamex.estudiantesregistro.exceptions;

public class DuplicateDataException extends RuntimeException{
    public DuplicateDataException(){
        super("Error matricula en uso o correo en uso");
    }
}
