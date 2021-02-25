/**
 * 
 */
package com.devpredator.projectspringweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.devpredator.projectspringweb.services.SpringService;

/**
 * @author c-ado
 *
 */
@ManagedBean(name = "springcontroller")
@ViewScoped
public class SpringJSFController {
	
	private String nombreEmpresa;
	private String nombreEmpleado;
	
	@ManagedProperty("#{springServiceImpl}")
	private SpringService springServiceImpl;
	
	@PostConstruct
	public void init() {
		String nombre = this.springServiceImpl.mostrarNombreEmpresa();
     System.out.println(nombre);
     this.nombreEmpresa= nombre;
     
     String nombreEmpleado = this.springServiceImpl.mostrarNombreEmpleado();
     System.out.println(nombreEmpleado); 
     this.nombreEmpleado=nombreEmpleado;
	}

	/**
	 * @return the springServiceImpl
	 */
	public SpringService getSpringServiceImpl() {
		return springServiceImpl;
	}

	/**
	 * @param springServiceImpl the springServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringService springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
}
