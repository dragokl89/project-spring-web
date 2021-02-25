/**
 * 
 */
package com.devpredator.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devpredator.projectspringweb.dao.EmpleadoDAO;
import com.devpredator.projectspringweb.services.SpringService;

/**
 * @author c-ado
 *
 */
@Service
public class SpringServiceImpl implements SpringService {

	
	@Autowired
	private EmpleadoDAO empleadoDaoImpl;
	
	@Override
	public String mostrarNombreEmpresa() {
		// TODO Auto-generated method stub
		return ("Anotaciones de spring y jsf");
	}

	@Override
	public String mostrarNombreEmpleado() {
		// TODO Auto-generated method stub
		return this.empleadoDaoImpl.consultarNombreEmpleado();
	}

}
