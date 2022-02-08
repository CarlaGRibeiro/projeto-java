package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consulta_sql {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/agenciaviagem";
		String usuario = "root";
		String senha = "Numero@3";
		String comando_sql = "SELECT *FROM usuario";

		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(comando_sql);
			System.out.println("CONEX�O ESTABELECIDA COM SUCESSO.");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String id_usuario = resultSet.getString("id_usuario");

				String Nome = resultSet.getString("Nome");
				String Sobrenome = resultSet.getString("Sobrenome");
				String Email = resultSet.getString("Email");
				String CPF = resultSet.getString("CPF");
				String Endere�o = resultSet.getString("Endere�o");
				String Numero = resultSet.getString("Numero");
				String Complemento = resultSet.getString("Complemento");
				String Bairro = resultSet.getString("Bairro");
				String Cidade = resultSet.getString("Cidade");
				String Estado = resultSet.getString("Estado");
				String Pais = resultSet.getString("Pais");
 
				System.out.println("Identificador da viagem: " + id_usuario + " Nome: " + Nome + " Sobrenome: " + Sobrenome + " Email: " + Email + " CPF: " + CPF
						+ " Endere�o: " + Endere�o + " Numero " + Numero + " Complemento: " + Complemento + " Bairro: "
						+ Bairro + " Cidade: " + Cidade + " Estado: " + Estado + " Pais: " + Pais);

			}

			
		} catch (Exception e) {
			System.out.println("ERRO: CONEX�O N�O ESTABELECIDA.");
		}
	}
}
