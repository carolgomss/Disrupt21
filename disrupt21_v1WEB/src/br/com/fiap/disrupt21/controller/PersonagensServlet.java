package br.com.fiap.disrupt21.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.disrupt21.dao.PersonagemDAO;
import br.com.fiap.disrupt21.domain.Personagem;


@WebServlet("/personagens")
public class PersonagensServlet extends HttpServlet{ 

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Personagem> personagens = new PersonagemDAO().listar();
		request.setAttribute("personagens", personagens);
		request.getRequestDispatcher("WEB-INF/personagem.jsp").forward(request, response);
	}
}
