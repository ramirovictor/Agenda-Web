package com.ifg.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Interface que declara o m�todo executa, que � gen�rico de adicionaContato, ListaContato ...
 * @author ramirovictor
 *
 */
public interface Logica {
	
	String executa(HttpServletRequest req,
			HttpServletResponse res) throws Exception;

}
