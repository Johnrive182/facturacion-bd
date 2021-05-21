package edu.ucacue.factura.controlador;

import edu.ucacue.factura.infraestructura.repositorio.PersonaRepositorio;
import edu.ucacue.factura.modelo.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Principal {
	
	@Autowired
    PersonaRepositorio personaRepositorio;
	
public Principal () {
	
}
	public void insertarPersona() {
	Persona p1 = new Persona(1, "John","Rivera","83838383","09989889");
	personaRepositorio.save(p1);	
	}
}
