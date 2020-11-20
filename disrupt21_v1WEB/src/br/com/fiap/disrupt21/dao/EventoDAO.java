package br.com.fiap.disrupt21.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.disrupt21.domain.Evento;

public class EventoDAO {
	
	private Evento buscarEvento(int id) {
		SQLConnection connect = new SQLConnection();
		String query = "SELECT id, titulo_evento, desc_evento, data FROM eventos";
		ResultSet rs = connect.executeQuery(query);
		
		try {
			while(rs.next()) {
				Evento evento = new Evento();
				evento.setId(rs.getInt("id"));
				evento.setTitulo(rs.getString("titulo_evento"));
				evento.setDescricao(rs.getString("desc_evento"));
				evento.setData(rs.getDate("data"));
				return evento;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public List<Evento> listar(){
		List<Evento> eventos = new ArrayList<Evento>();
		SQLConnection connect = new SQLConnection();
		String query = "SELECT id, titulo_evento, desc_evento, data FROM eventos";
		ResultSet rs = connect.executeQuery(query);
		
		try {
			while(rs.next()) {
				Evento evento = new Evento();
				evento.setId(rs.getInt("id"));
				evento.setTitulo(rs.getString("titulo_evento"));
				evento.setDescricao(rs.getString("desc_evento"));
				evento.setData(rs.getDate("data"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connect.closeConnexction();
		}
		return eventos;
	}

//	buscar eventos de personagem
//	buscar unico personagem
}
