package com.uamex.estudiantesregistro.dto;

public record EstudianteDto(String matricula, String nombre
        , String apellido_M, String apellido_P, String carrera, String correo,int edad) {
}
