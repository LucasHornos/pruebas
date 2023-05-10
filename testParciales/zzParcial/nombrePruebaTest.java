package zzParcial;

import static org.junit.Assert.*;


import org.junit.Test;

import ar.edu.unlam.Alumno;
import ar.edu.unlam.Curso;
import ar.edu.unlam.Instructor;
import ar.edu.unlam.Persona;

public class nombrePruebaTest {

	@Test
	public void queSePuedaCrearUnCurso() {
		Integer codigo=0;
		Double cuota=0.0;
		Curso curso;
		
		curso=new Curso(codigo, cuota);
		
		assertNotNull(curso);
	}

	
	@Test
	public void queSePuedaCrearUnaPersona() {
		Persona persona;
		
		persona=new Persona();
		
		assertNotNull(persona);
	}
	
	
	@Test
	public void queSePuedaCrearUnAlumno() {
		Alumno alumno;
		
		alumno=new Alumno();
		
		assertNotNull(alumno);
	}



	@Test
	public void queSePuedaCrearUnInstructor() {
		Instructor instructor;
		
		instructor=new Instructor();
		
		assertNotNull(instructor);
	}

	

}
