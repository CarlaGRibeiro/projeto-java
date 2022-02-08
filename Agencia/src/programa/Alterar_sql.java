package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Alterar_sql {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/agenciaviagem";
		String usuario = "root";
		String senha = "Numero@3";
		String comando_sql = "update usuario set Numero=? where CPF = ?";

		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(comando_sql);

			preparedStatement.setString(1, "150");
			preparedStatement.setString(2, "123");
			preparedStatement.executeUpdate();

			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO.");
		} catch (Exception e) {
			System.out.println("ERRO: CONEXÃO NÃO ESTABELECIDA.");
		}
	}
}
