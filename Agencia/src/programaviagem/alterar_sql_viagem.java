package programaviagem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;   

public class alterar_sql_viagem {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/agenciaviagem";
		String usuario = "root";
		String senha = "Numero@3";
		String comando_sql = "update viagem set Destino=? where Email = ?";

		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(comando_sql);

			preparedStatement.setString(1, "CANADÁ");
			preparedStatement.setString(2, "carlaribeiro.ads@gmail.com");
			preparedStatement.executeUpdate();

			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO.");
		} catch (Exception e) {
			System.out.println("ERRO: CONEXÃO NÃO ESTABELECIDA.");
		}
	}
}