package programaviagem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletar_sql_viagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/agenciaviagem";
		String usuario = "root";
		String senha = "Numero@3";
		String comando_sql = "delete from viagem where id_viagem =?";
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(comando_sql);
			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO.");
			
			System.out.println("Informe o id da viagem que deseja excluir: ");
			Scanner digite = new Scanner(System.in);
			String id_usuario = digite.next();
			
			//ResultSet resultSet = preparedStatement.executeQuery();

			
			preparedStatement.setString(1, id_usuario);
			preparedStatement.executeUpdate();
			System.out.println("Deletado com sucesso!");
			
		} catch (Exception e) {
			System.out.println("ERRO: CONEXÃO NÃO ESTABELECIDA.");
		}
	}
}
