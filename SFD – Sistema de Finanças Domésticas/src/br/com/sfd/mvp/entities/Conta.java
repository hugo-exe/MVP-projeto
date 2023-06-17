package br.com.sfd.mvp.entities;

import java.util.List;

public class Conta {
    private int idConta;
    private String nomeConta;
    private List<Conta> contas ;
     
     
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
    public void deletarConta(int idConta) {
        this.deletarConta(idConta);
    }
    public void alterarConta(String nome) {
        this.alterarConta(nome);
    }
    
    public Conta verConta(int idConta) {
        for (Conta conta : contas) {
            if (conta.getIdConta() == idConta) {
                return conta;
            }
        }
        return null;
    }
}