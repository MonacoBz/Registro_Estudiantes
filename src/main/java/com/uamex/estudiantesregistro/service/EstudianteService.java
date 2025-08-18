package com.uamex.estudiantesregistro.service;

import com.uamex.estudiantesregistro.dto.EstudianteDto;
import com.uamex.estudiantesregistro.entity.Estudiante;
import com.uamex.estudiantesregistro.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository){
        this.repository = repository;
    }

    public List<EstudianteDto> getAll(){
        return repository.findAll()
                .stream()
                .map(this::estudianteToEstudianteDTO)
                .toList();
    }
    private EstudianteDto estudianteToEstudianteDTO(Estudiante estudiante){
        return new EstudianteDto(estudiante.getMatricula(), estudiante.getNombre(), estudiante.getApellido_M()
                                    ,estudiante.getApellido_p(),estudiante.getCarrera(), estudiante.getCorreo_electronico(),estudiante.getEdad());
    }
}
