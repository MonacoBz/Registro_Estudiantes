package com.uamex.estudiantesregistro.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "ESTUDIANTE")
public class Estudiante {
    @Id
    private String matricula;

    private String nombre;

    private String apellido_p;

    private String apellido_M;

    private int edad;

    private String carrera;

    private String correo_electronico;

    public Estudiante(String apellido_M, String apellido_p, String carrera, String correo_electronico, int edad, String matricula, String nombre) {
        this.apellido_M = apellido_M;
        this.apellido_p = apellido_p;
        this.carrera = carrera;
        this.correo_electronico = correo_electronico;
        this.edad = edad;
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public Estudiante() {

    }

    public String getApellido_M() {
        return apellido_M;
    }

    public void setApellido_M(String apellido_M) {
        this.apellido_M = apellido_M;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
