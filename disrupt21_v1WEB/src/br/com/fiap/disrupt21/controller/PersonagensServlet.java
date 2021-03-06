package br.com.fiap.disrupt21.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fiap.disrupt21.dao.PersonagemDAO;
import br.com.fiap.disrupt21.domain.Personagem;


@WebServlet("/personagem")
public class PersonagensServlet extends HttpServlet{ 

	private static final long serialVersionUID = -6571221598165133012L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		List<Personagem> personagens = new PersonagemDAO().listar();
		request.setAttribute("personagens", personagens);
		try {
			request.getRequestDispatcher("/WEB-INF/Personagem.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
