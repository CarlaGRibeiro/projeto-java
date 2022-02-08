package programaviagem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class consultar_sql_viagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/agenciaviagem";
		String usuario = "root";
		String senha = "Numero@3";
		String comando_sql = "SELECT *FROM viagem";

		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(comando_sql);
			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO.");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String id_viagem = resultSet.getString("id_viagem");
				String Nome = resultSet.getString("Nome");
				String Email = resultSet.getString("Email");
				String Origem = resultSet.getString("Origem");
				String Destino = resultSet.getString("Destino");
				String Data_dia = resultSet.getString("Data_dia");
				String Data_mes = resultSet.getString("Data_mes");
				String Data_ano = resultSet.getString("Data_ano");
				

				System.out.println("Identificador da viagem: " + id_viagem + " Nome: " + Nome +  " Email: " + Email + " Email: " + Email + " Origem: " + Origem + " Destino " + Destino + " Data: " + Data_dia +", "+ Data_mes + ", " + Data_ano);

			}

			
		} catch (Exception e) {
			System.out.println("ERRO: CONEXÃO NÃO ESTABELECIDA.");
		}
	}

	}

