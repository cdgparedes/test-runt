insert into colegios (id,nombre,id_curso)values(1, 'El colegio del 	Olimpo',1);
insert into colegios (id,nombre,id_curso)values(2, 'El colegio del 	Olimpo',2);
insert into colegios (id,nombre,id_curso)values(3, 'El colegio del 	Olimpo',3);
insert into colegios (id,nombre,id_curso)values(4, 'El colegio del 	Olimpo',4);

insert into cursos (id,grado,salon,id_asignatura)values(1, 10,'A',1);
insert into cursos (id,grado,salon,id_asignatura)values(2, 10,'A',2);
insert into cursos (id,grado,salon,id_asignatura)values(3, 10,'A',3);
insert into cursos (id,grado,salon,id_asignatura)values(4, 10,'B',1);
insert into cursos (id,grado,salon,id_asignatura)values(5, 10,'B',2);
insert into cursos (id,grado,salon,id_asignatura)values(6, 10,'B',4);
insert into cursos (id,grado,salon,id_asignatura)values(7, 11,'A',1);
insert into cursos (id,grado,salon,id_asignatura)values(8, 11,'A',5);
insert into cursos (id,grado,salon,id_asignatura)values(9, 11,'B',1);
insert into cursos (id,grado,salon,id_asignatura)values(10, 11,'A',5);


insert into asignaturas (id,nombre,id_profesor,id_curso,asig_curso)values(1,'Matematicas',1,1,1);
insert into asignaturas (id,nombre,id_profesor,id_curso,asig_curso)values(2,'Español',2,2,2);
insert into asignaturas (id,nombre,id_profesor,id_curso,asig_curso)values(3,'Ingles Basico',3,3,3);
insert into asignaturas (id,nombre,id_profesor,id_curso,asig_curso)values(4,'Ingles Avanzado',3,1,1);
insert into asignaturas (id,nombre,id_profesor,id_curso,asig_curso)values(5,'Pre Icfes',4,1,1);


insert into estudiantes (id,nombre,id_asignatura)values(1,'Afrodita',1);
insert into estudiantes (id,nombre,id_asignatura)values(2,'Apolo',1);
insert into estudiantes (id,nombre,id_asignatura)values(3,'Ares',1);
insert into estudiantes (id,nombre,id_asignatura)values(4,'Artemisa',1);
insert into estudiantes (id,nombre,id_asignatura)values(5,'Atena',1);
insert into estudiantes (id,nombre,id_asignatura)values(6,'Dioniso',1);
insert into estudiantes (id,nombre,id_asignatura)values(7,'Hefesto',1);
insert into estudiantes (id,nombre,id_asignatura)values(8,'Hera',1);
insert into estudiantes (id,nombre,id_asignatura)values(9,'Hermes',1);
insert into estudiantes (id,nombre,id_asignatura)values(10,'Hades',1);
insert into estudiantes (id,nombre,id_asignatura)values(11,'Poseidon',1);
insert into estudiantes (id,nombre,id_asignatura)values(12,'Zeus',1);




insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,1);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(2,1);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(3,1);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,2);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(2,2);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(3,2);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,3);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(2,3);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(3,3);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,4);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(2,4);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(4,4);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,5);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(2,5);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(4,5);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,6);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(2,6);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(4,6);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,7);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(5,7);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,8);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(5,8);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,9);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(5,9);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,10);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(5,10);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,11);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(5,11);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(1,12);
insert into asignatura_estudiante (asignatura_id,estudiante_id)values(5,12);


insert into profesores (id,nombre,id_asignatura)values(1,'Nemesis',1);
insert into profesores (id,nombre,id_asignatura)values(2,'Priapo',2);
insert into profesores (id,nombre,id_asignatura)values(3,'Iris',3);
insert into profesores (id,nombre,id_asignatura)values(4,'Nemisis',5);




