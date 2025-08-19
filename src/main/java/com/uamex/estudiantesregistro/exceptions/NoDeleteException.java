package com.uamex.estudiantesregistro.exceptions;

public class NoDeleteException extends RuntimeException{
    public NoDeleteException(){
        super("No se pudo eliminar al estudiante");
    }
}
