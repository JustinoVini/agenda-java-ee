package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	// Modulo de conexão 
	// Parametros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = 
			"jdbc:mysql://localhost:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String username = "root";
	private String password = "@Viking569038";
	
	// Metodo de conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	// Teste de conexão 
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
