package br.com.sfd.mvp.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sfd.mvp.bd.ConexaoMySQL;

public class UsuarioSql {
    private int idUsuario;
    private String nome;
    private String senha;
    private String confirmaSenha;
    private List<UsuarioSql> usuarios = new ArrayList<>();

    public UsuarioSql() {
    }

    public UsuarioSql(int idUsuario, String nome, String senha, String confirmaSenha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.senha = senha;
        this.confirmaSenha = confirmaSenha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public List<UsuarioSql> getUsuarios() {
    	
        return usuarios;
    }

    public void criarUsuario(Usuario usuario) {
        try (Connection conexao = ConexaoMySQL.obterConexao()) {
            String sql = "INSERT INTO usuarios (idUsuario, nome, senha, confirmaSenha) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, usuario.getIdUsuario());
            statement.setString(2, usuario.getNome());
            statement.setString(3, usuario.getSenha());
            statement.setString(4, usuario.getConfirmaSenha());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerUsuario(Usuario usuario) {
        try (Connection conexao = ConexaoMySQL.obterConexao()) {
            String sql = "DELETE FROM usuarios WHERE idUsuario = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, usuario.getIdUsuario());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void exibirUsuarios() {
        try (Connection conexao = ConexaoMySQL.obterConexao()) {
            String sql = "SELECT * FROM usuarios";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("=== Lista de Usuários ===");
            while (resultSet.next()) {
                int id = resultSet.getInt("idUsuario");
                String nome = resultSet.getString("nome");
                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Usuario buscarUsuarioPorId(int id) {
        try (Connection conexao = ConexaoMySQL.obterConexao()) {
            String sql = "SELECT * FROM usuarios WHERE idUsuario = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int idUsuario = resultSet.getInt("idUsuario");
                String nome = resultSet.getString("nome");
                String senha = resultSet.getString("senha");
                String confirmaSenha = resultSet.getString("confirmaSenha");
                return new Usuario(idUsuario, nome, senha, confirmaSenha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean validarUsuario() {
        return senha.equals(confirmaSenha);
    }
}
/*Certifique-se de importar as classes necessárias e substituir os detalhes da conexão com o MySQL de acordo com a sua configuração.
Lembre-se de que é apenas um exemplo e você pode precisar adaptar o código às suas necessidades específicas.
*/
