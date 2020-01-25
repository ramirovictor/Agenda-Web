package com.ifg.agenda.filtro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.ifg.agenda.ConnectionFactory;
/**
 * Filtro para para abrir e fechar a conex�o com o banco de dados
 * Ele permiti  abrir uma conex�o antes da requisi��o e fecha na volta
 * depois que a resposta foi gerada.
 * 
 * @author ramirovictor
 *
 */
@WebFilter("/*")
public class FiltroConexao implements Filter{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		try {
			//abre uma conex�o
			Connection connection = new ConnectionFactory().getConnection();
			
			// Pendura um objeto no request ou seja o connection
		request.setAttribute("conexao", connection);	
		
		//Indica que o processamento do request deve prosseguir
		//permite indicar ao container que o request deve prosseguir seu processamento
		chain.doFilter(request,  response);
		
		
		//fechar conex�o
		
		connection.close();
		
		}catch(SQLException e) {
			
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
