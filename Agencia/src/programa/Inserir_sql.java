package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;   

public class Inserir_sql {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/agenciaviagem";
		String usuario = "root";
		String senha = "Numero@3";
		String comando_sql = "insert into usuario (Nome,Sobrenome,Email,CPF,Endereço,Numero,Complemento,Bairro,Cidade,Estado,Pais,Senha) values ('Carla Irene', 'Gonçalves', 'carlaribeiro.ads@gmail.com','456','Rua Olegário',1.480,'casa','Coqueiros','Queimados','Rio de Janeiro','Brasil','numeral');";
		
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement  preparedStatement = conexao.prepareStatement(comando_sql);
			preparedStatement.executeUpdate();
			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO.");
						
			
		} catch (Exception e) {
			System.out.println("ERRO: CONEXÃO NÃO ESTABELECIDA.");
		}
	}
}
