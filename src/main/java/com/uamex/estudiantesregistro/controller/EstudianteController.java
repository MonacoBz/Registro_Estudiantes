package com.uamex.estudiantesregistro.controller;

import com.uamex.estudiantesregistro.dto.EstudianteDto;
import com.uamex.estudiantesregistro.service.EstudianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service){
        this.service = service;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<EstudianteDto>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<List<EstudianteDto>> getByName(@PathVariable String nombre){
        return ResponseEntity.ok(service.getByName(nombre));
    }

    @GetMapping("/apellidop/{apellidop}")
    public ResponseEntity<List<EstudianteDto>> getByFirstName(@PathVariable String apellidop){
        return ResponseEntity.ok(service.getByApellidoP(apellidop));
    }

    @GetMapping("/apellidom/{apellidom}")
    public ResponseEntity<List<EstudianteDto>> getBySecondName(@PathVariable String apellidom){
        return ResponseEntity.ok(service.getByApellidoM(apellidom));
    }

    @GetMapping("/carrera/{carrera}")
    public ResponseEntity<List<EstudianteDto>> getByCarrera(@PathVariable String carrera){
        return ResponseEntity.ok(service.getByCarrera(carrera));
    }

    @GetMapping("/matricula/{matricula}")
    public ResponseEntity<EstudianteDto> getByMatricula(@PathVariable String matricula){
        return ResponseEntity.ok(service.getByMatricula(matricula));
    }

    @GetMapping("/correo/{correo}")
    public ResponseEntity<EstudianteDto> getByCorreo(@PathVariable String correo){
        return ResponseEntity.ok(service.getByCorreo(correo));
    }


}
