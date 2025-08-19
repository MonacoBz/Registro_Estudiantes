package com.uamex.estudiantesregistro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    private String matricula;

    private String nombre;

    @Column(name = "apellido_p")
    private String apellidoP;

    @Column(name = "apellido_m")
    private String apellidoM;

    private int edad;

    private String carrera;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    public Estudiante(String apellido_M, String apellido_p, String carrera, String correo_electronico, int edad, String matricula, String nombre) {
        this.apellidoM = apellido_M;
        this.apellidoP = apellido_p;
        this.carrera = carrera;
        this.correoElectronico = correo_electronico;
        this.edad = edad;
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public Estudiante() {

    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellido_M) {
        this.apellidoM = apellido_M;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellido_p) {
        this.apellidoP = apellido_p;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo_electronico() {
        return correoElectronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correoElectronico = correo_electronico;
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
