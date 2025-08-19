package com.uamex.estudiantesregistro.exceptions;

public class NoCreateException extends RuntimeException{
    public NoCreateException(){
        super("No se pudo crear el estudiante");
    }
}
