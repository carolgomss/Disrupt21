package br.com.fiap.disrupt21.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class SQLConnection {
	
	private Connection conn;
	
	public SQLConnection(){
		try {
			DriverManager.registerDriver(new OracleDriver());
			String host = "oracle.fiap.com.br";
			String port = "1521";
			String SID = "ORCL";
			String user = "rm85183";
			String password = "260895";
			conn = DriverManager.getConnection("jdbc:oracle:thin:@"+host+":"+port+":"+SID+"",user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeQuery(String query) {
		try {
			Statement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			stmt.executeQuery(query);
			return stmt.getGeneratedKeys();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}
	
	public void executeUpdate(String query) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException throwables) {
			throwables.getStackTrace();
		}
	}

	public void closeConnexction() {
		try {
			conn.close();
		} catch (SQLException throwables) {
			throwables.getStackTrace();
		}
	}
}
