package com.uamex.estudiantesregistro.exceptions;

public class NoUpdateException extends RuntimeException{

    public NoUpdateException(){
        super("No se pudo actualizar el usuario");
    }
}
