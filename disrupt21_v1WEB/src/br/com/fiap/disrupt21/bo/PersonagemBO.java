package br.com.fiap.disrupt21.bo;

import java.util.List;

import br.com.fiap.disrupt21.dao.PersonagemDAO;
import br.com.fiap.disrupt21.domain.Personagem;

public class PersonagemBO {
	private PersonagemDAO personagemDAO = null;
	
	public PersonagemBO() {
		this.personagemDAO = new PersonagemDAO();
	}
	
	public List<Personagem> listar(){
		return personagemDAO.listar();
	}
}
