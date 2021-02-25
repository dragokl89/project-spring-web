/**
 * 
 */
package com.devpredator.projectspringweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.devpredator.projectspringweb.services.SpringService;

/**
 * @author c-ado
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration (locations = {"classpath:applicationContext-test.xml"})
public class SpringJUnit4Test {

	
	@Autowired
	private SpringService springServiceImpl;
	@Test
	public void test() {
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpleado());
	}

}
