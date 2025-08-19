package com.uamex.estudiantesregistro.exceptions;

public class NoFindException extends RuntimeException{

    public NoFindException(String causa){
        super("No existe el usuario con " + causa);
    }
}
