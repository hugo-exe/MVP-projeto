package br.com.sfd.mvp.models;
public class Conta {
    private int idConta;
     private String nomeConta;

     public Conta() {
     }

    public Conta(int idConta, String nomeConta) {
        this.idConta = idConta;
        this.nomeConta = nomeConta;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta( int idConta) {
        this.idConta = idConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public void inserirConta(Conta conta) {
        this.inserirConta(conta);
    }
    public void deletarConta(Conta conta) {
        this.deletarConta(conta);
    }
    public void alterarConta(String nome) {
        this.alterarConta(nome);
    }


}