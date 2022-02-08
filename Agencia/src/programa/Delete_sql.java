package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Delete_sql {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/agenciaviagem";
		String usuario = "root";
		String senha = "Numero@3";
		String comando_sql = "delete from usuario where CPF =?";
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(comando_sql);
			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO.");
			
			System.out.println("Informe o CPF do usuario que deseja excluir: ");
			Scanner digite = new Scanner(System.in);
			String CPF_usuario = digite.next();
			
			//ResultSet resultSet = preparedStatement.executeQuery();

			
			preparedStatement.setString(1, CPF_usuario);
			preparedStatement.executeUpdate();
			System.out.println("Deletado com sucesso!");
			
		} catch (Exception e) {
			System.out.println("ERRO: CONEXÃO NÃO ESTABELECIDA.");
		}
	}
}
