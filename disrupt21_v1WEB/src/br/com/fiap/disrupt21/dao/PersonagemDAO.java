package br.com.fiap.disrupt21.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.disrupt21.domain.Personagem;

public class PersonagemDAO {
	
	private Personagem buscarPersonagem(int id) {
		SQLConnection connect = new SQLConnection();
		String query = "SELECT id, nome, descricao FROM personagem WHERE id = " + id;
		ResultSet rs = connect.executeQuery(query);
		
		try {
			while(rs.next()) {
				Personagem personagem = new Personagem();
				personagem.setId(rs.getInt("id"));
				personagem.setNome(rs.getString("nome"));
				personagem.setDescricao(rs.getString("descricao"));
				return personagem;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Personagem> listar() {
		List<Personagem> personagens = new ArrayList<Personagem>();
		SQLConnection connect = new SQLConnection();
		String query = "SELECT id, nome, descricao FROM personagem";
		ResultSet rs = connect.executeQuery(query);
		
		try {
			while(rs.next()) {
				Personagem personagem = new Personagem();
				personagem.setId(rs.getInt("id"));
				personagem.setNome(rs.getString("nome"));
				personagem.setDescricao(rs.getString("descricao"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connect.closeConnexction();
		}
		return personagens;
	}
}
