package br.com.fiap.disrupt21.domain;

import java.util.List;

public class Personagem {
	private String nome;
	private String descricao;
	private String urlImage;
	private int id;
	private List<Evento> eventos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Evento> getEvento() {
		return eventos;
	}
	public void setEvento(List<Evento> evento) {
		this.eventos = evento;
	}
}
