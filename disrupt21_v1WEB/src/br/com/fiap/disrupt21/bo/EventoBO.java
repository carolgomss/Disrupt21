package br.com.fiap.disrupt21.bo;

import java.util.List;

import br.com.fiap.disrupt21.dao.EventoDAO;
import br.com.fiap.disrupt21.domain.Evento;

public class EventoBO {
	private EventoDAO eventoDAO = null;
	
	public EventoBO() {
		this.eventoDAO = new EventoDAO();
	}
	
	public List<Evento> listar(){
		return eventoDAO.listar();
	}
}