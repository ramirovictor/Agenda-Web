package com.ifg.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Crie a l�gica de adicionar contatos ( AdicionaContatoLogic ). Repare que ela
 * � bem parecida com a AlteraContatoLogic . 
 * Crie um formul�rio de adi��o de
 * novo contato. Coloque um link para adicionar novos contatos dentro do
 * lista-contatos.jsp .
 * 
 * @author ramirovictor
 *
 */
public class AdicionaContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		return "/WEB-INF/jsp/adiciona-contato.jsp";
	}

}
