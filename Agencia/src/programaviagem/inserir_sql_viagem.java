package programaviagem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;   

public class inserir_sql_viagem {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/agenciaviagem";
		String usuario = "root";
		String senha = "Numero@3";
		String comando_sql = "insert into viagem (Nome,Email,Origem,Destino,Data_dia,Data_mes,Data_ano) values ('Irene','ribeiro@gmail.com','Rio de Janeiro','Nova York','14','Mar�o','2022')";
		
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement  preparedStatement = conexao.prepareStatement(comando_sql);
			preparedStatement.executeUpdate();
			System.out.println("CONEX�O ESTABELECIDA COM SUCESSO.");
						
			
		} catch (Exception e) {
			System.out.println("ERRO: CONEX�O N�O ESTABELECIDA.");
		}
	}
}
