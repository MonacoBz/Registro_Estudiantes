package com.uamex.estudiantesregistro.repository;

import com.uamex.estudiantesregistro.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,String> {

    Optional<Estudiante> findByMatricula(String s);

    Optional<Estudiante> findByCorreoElectronico(String correoElectronico);

    List<Estudiante> findByNombre(String nombre);

    List<Estudiante> findByApellidoM(String apellidoM);

    List<Estudiante> findByApellidoP(String apellidoP);

    List<Estudiante> findByCarrera(String carrera);

    boolean existsByCorreoElectronico(String correoElectronico);


}
