import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {

		final String URL = "jdbc:postgresql://localhost:5432/";
		final String USER = "postgres";
		final String PASSWORD = "123456";

		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Banco conectado com sucesso!");
		
		String sql = "create database Rom";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.execute();
		
		

	}

}
