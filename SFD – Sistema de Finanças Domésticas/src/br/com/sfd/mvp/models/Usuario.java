package br.com.sfd.mvp.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String senha;
    private String confirmaSenha;
    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(int idUsuario, String nome, String senha, String confirmaSenha) {
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

    public List<Usuario> getUsuarios() {
    	
        return usuarios;
    }

    public void criarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
    public void exibirUsuarios() {
        System.out.println("=== Lista de Usuários ===");
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getIdUsuario());
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("------------------------");
        }
    }
   
    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario() == id) {
                return usuario;
            }
        }
        return null; // Retorna null se não encontrar o usuário com o ID especificado
    }
    
    public boolean validarUsuario() {
        return senha.equals(confirmaSenha);
    }
}
