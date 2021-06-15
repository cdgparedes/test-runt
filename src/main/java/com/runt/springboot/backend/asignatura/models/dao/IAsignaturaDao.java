package com.runt.springboot.backend.asignatura.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.runt.springboot.backend.asignatura.models.entity.Asignatura;


public interface IAsignaturaDao extends CrudRepository<Asignatura,Long>{

	
	/*@Query(value="SELECT P.NOMBRE AS PROFESOR, A.NOMBRE AS ASIGNATURA, E.NOMBRE FROM ASIGNATURAS A "
		       + "INNER JOIN PROFESORES P  ON  A.ID_PROFESOR = P.ID "
			   + "INNER JOIN ESTUDIANTES E ON A.ID_ESTUDIANTE = E.ID "
		       + "WHERE A.ID_PROFESOR = ?1", nativeQuery = true)*/
	@Query(value="SELECT A.NOMBRE AS ASIGNATURA FROM ASIGNATURAS A "
		       + "WHERE A.ID_PROFESOR= :id_profesor", nativeQuery = true)
    List<Asignatura> findToidTeacher( @Param("id_profesor") Long id_profesor);
	
}
