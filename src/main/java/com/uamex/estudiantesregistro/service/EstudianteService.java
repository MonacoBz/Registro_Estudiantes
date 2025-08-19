package com.uamex.estudiantesregistro.service;

import com.uamex.estudiantesregistro.dto.EstudianteDto;
import com.uamex.estudiantesregistro.entity.Estudiante;
import com.uamex.estudiantesregistro.exceptions.NoCreateException;
import com.uamex.estudiantesregistro.exceptions.NoFindException;
import com.uamex.estudiantesregistro.exceptions.NoUpdateException;
import com.uamex.estudiantesregistro.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository){
        this.repository = repository;
    }

    public boolean createStudent(EstudianteDto estudiante){
        try{
            Estudiante data = estudianteDtoToEstudiante(estudiante);
            repository.save(data);
        }catch (Exception e){
            throw new NoCreateException();
        }
        return true;
    }

    public List<EstudianteDto> getAll(){
        return repository.findAll()
                .stream()
                .map(this::estudianteToEstudianteDTO)
                .toList();
    }

    public List<EstudianteDto> getByName(String name){
        List<EstudianteDto> data =  repository.findByNombre(name)
                .stream()
                .map(this::estudianteToEstudianteDTO)
                .toList();
        if(data.isEmpty())throw new NoFindException("El nombre(s): " + name);
        return data;
    }

    public List<EstudianteDto> getByApellidoP(String apellidoP){
        List<EstudianteDto> data = repository.findByApellidoP(apellidoP)
                .stream()
                .map(this::estudianteToEstudianteDTO)
                .toList();
        if(data.isEmpty())throw new NoFindException("El apellido Paterno: " + apellidoP);
        return data;
    }

    public List<EstudianteDto> getByApellidoM(String apellidoM){
        List<EstudianteDto> data = repository.findByApellidoM(apellidoM)
                .stream()
                .map(this::estudianteToEstudianteDTO)
                .toList();
        if(data.isEmpty())throw new NoFindException("El apellido Materno: " + apellidoM);
        return data;
    }

    public List<EstudianteDto> getByCarrera(String carrera){
        List<EstudianteDto> data = repository.findByCarrera(carrera)
                .stream()
                .map(this::estudianteToEstudianteDTO)
                .toList();
        if(data.isEmpty())throw new NoFindException("La carrera : " + carrera);
        return data;
    }

    public EstudianteDto getByMatricula(String matricula){
        Estudiante data = repository
                .findByMatricula(matricula)
                .orElseThrow(() -> new NoFindException("La matricula: " + matricula));
       return estudianteToEstudianteDTO(data);
    }

    public EstudianteDto getByCorreo(String correo){
        Estudiante data = repository
                .findByCorreoElectronico(correo)
                .orElseThrow(()->new NoFindException("El correo: " + correo));
        return estudianteToEstudianteDTO(data);
    }

    public boolean updateEstudiante(EstudianteDto estudiante){
        try {
            Estudiante data = repository.findByMatricula(estudiante.matricula())
                    .orElseThrow(() -> new NoFindException("La matricula: " + estudiante.matricula()));
            data.setNombre(estudiante.nombre());
            data.setApellidoP(estudiante.apellido_P());
            data.setApellidoM(estudiante.apellido_M());
            data.setCarrera(estudiante.carrera());
            data.setEdad(estudiante.edad());
            data.setCorreo_electronico(estudiante.correo());
            repository.save(data);
        }catch (Exception e){
            throw new NoUpdateException();
        }
        return true;
    }



    private EstudianteDto estudianteToEstudianteDTO(Estudiante estudiante){
        return new EstudianteDto(estudiante.getMatricula()
                ,estudiante.getNombre()
                ,estudiante.getApellidoM()
                ,estudiante.getApellidoP()
                ,estudiante.getCarrera()
                ,estudiante.getCorreo_electronico()
                ,estudiante.getEdad());
    }
    private Estudiante estudianteDtoToEstudiante(EstudianteDto estudiante){
        return new Estudiante(estudiante.matricula()
                , estudiante.nombre(),
                estudiante.apellido_P(),
                estudiante.apellido_M(),
                estudiante.edad(),
                estudiante.correo(),
                estudiante.carrera());
    }
}
