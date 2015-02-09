select a.nombre, a.apellido, p.nombre, p.apellido, c.nombre
from alumno a 
inner join alumnocurso ac 
on a.id_alumno=ac.al_id_alumno
inner join curso c
on ac.al_id_curso=c.id_curso
inner join profesor p  
on c.Profesor_id_profesor=p.id_profesor
where c.nombre='matematica'
order by a.apellido asc