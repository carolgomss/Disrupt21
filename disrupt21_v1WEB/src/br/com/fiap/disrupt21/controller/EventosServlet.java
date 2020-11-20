package br.com.fiap.disrupt21.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.disrupt21.dao.EventoDAO;
import br.com.fiap.disrupt21.domain.Evento;

@WebServlet("/eventos")
 
public class EventosServlet extends HttpServlet{

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		List<Evento> eventos = new EventoDAO().listar();
		request.setAttribute("eventos", eventos);
		try {
			request.getRequestDispatcher("/WEB-INF/Evento.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}