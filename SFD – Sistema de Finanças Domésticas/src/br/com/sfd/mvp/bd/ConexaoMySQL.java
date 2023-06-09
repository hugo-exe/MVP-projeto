package br.com.sfd.mvp.bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco";
	private static final String USUARIO = "usuario_mysql";
	private static final String SENHA = "senha_mysql";

	public static Connection obterConexao() throws SQLException {
		return DriverManager.getConnection(URL, USUARIO, SENHA);
	}
}
/* Certifique-se de substituir nome_do_banco, usuario_mysql e senha_mysql 
pelos valores corretos de acordo com a configuração do seu ambiente MySQL.
*/