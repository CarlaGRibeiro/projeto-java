package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.util.Scanner;

public class  inserir2 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/agenciaviagem";
		String usuario = "root";
		String senha = "Numero@3";
		String comando_sql = "INSERT INTO usuario (Nome,Sobrenome,Email,CPF,Endereço,Numero,Complemento,Bairro,Cidade,Estado,Pais,Senha) VALUES (?,?,?,?,?,?,?,?,?,?)";

		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(comando_sql);

			System.out.println("Informe seu nome:");
			Scanner digitenome = new Scanner(System.in);
			String NomeUsuario = digitenome.next();
			
			System.out.println("Informe seu sobrenome:");
			Scanner digitesobrenome = new Scanner(System.in);
			String SobrenomeUsuario = digitesobrenome.next();

			System.out.println("Informe seu E-mail:");
			Scanner digiteemail = new Scanner(System.in);
			String EmailUsuario = digiteemail.next();

			System.out.println("Informe seu CPF:");
			Scanner digitecpf = new Scanner(System.in);
			String CPFUsuario = digitecpf.next();

			System.out.println("Informe seu Endereço:");
			Scanner digiteendereco = new Scanner(System.in);
			String EnderecoUsuario = digiteendereco.next();

			System.out.println("Informe o número da casa ou apto:");
			Scanner digitenumero = new Scanner(System.in);
			String NumeroUsuario = digitenumero.next();

			System.out.println("Informe o complemento(caso não haja digite 0.)");
			Scanner digitecomp = new Scanner(System.in);
			String CompUsuario = digitecomp.next();

			System.out.println("Informe seu bairro:");
			Scanner digitebairro = new Scanner(System.in);
			String BairroUsuario = digitebairro.next();

			System.out.println("Informe seu país:");
			Scanner digitepais = new Scanner(System.in);
			String PaisUsuario = digitepais.next();

			System.out.println("Cadastre uma senha.(Deve conter:letras maiúsculas e minúsculas,números e caracteres especiais.");
			Scanner digitesenha = new Scanner(System.in);
			String SenhaUsuario = digitesenha.next();

			preparedStatement.setString(1,NomeUsuario);
			preparedStatement.setString(2,SobrenomeUsuario);
			preparedStatement.setString(3,(EmailUsuario));
			preparedStatement.setString(4,(CPFUsuario));
			preparedStatement.setString(5,(EnderecoUsuario));
			preparedStatement.setString(6,(NumeroUsuario));
			preparedStatement.setString(7,(CompUsuario));
			preparedStatement.setString(8,(BairroUsuario));
			preparedStatement.setString(9,(PaisUsuario));
			preparedStatement.setString(10,(SenhaUsuario));
			
			preparedStatement.executeUpdate();

			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO.");
		} catch (Exception e) {
			System.out.println("ERRO: CONEXÃO NÃO ESTABELECIDA.");
		}
	}
}
