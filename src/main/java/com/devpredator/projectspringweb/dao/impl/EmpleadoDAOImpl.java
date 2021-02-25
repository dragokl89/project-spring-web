/**
 * 
 */
package com.devpredator.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.devpredator.projectspringweb.dao.EmpleadoDAO;

/**
 * @author c-ado
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		// TODO Auto-generated method stub
		return "Carlos Orbe";
	}

}
