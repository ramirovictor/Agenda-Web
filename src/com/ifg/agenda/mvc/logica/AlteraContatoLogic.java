package com.ifg.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * Crie uma l�gica chamada AlteraContatoLogic e teste a mesma atrav�s de um link na listagem da
lista-contatos.jsp . 
Lembre-se, antes de chamar essa l�gica � preciso criar uma outra l�gica que
mostre os dados do contato em uma nova p�gina, permitindo assim a altera��o dos dados, e s�
depois, no clique de um bot�o, que a altera��o ser� de fato efetivada.
 */
public class AlteraContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		return "/WEB-INF/jsp/altera-contatos.jsp";
	}

}
