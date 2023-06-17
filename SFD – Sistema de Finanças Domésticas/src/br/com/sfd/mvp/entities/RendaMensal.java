package br.com.sfd.mvp.entities;
import java.util.Date;

public class RendaMensal {
    private int idRendaMensal;
    private float valor;
    private Date data; 
    private String descricao;

    public RendaMensal () {
    }

    public RendaMensal (int idRendaMensal, float valor, Date data, String descricao) {
        super();
        this.idRendaMensal = idRendaMensal;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public void inserirValor(float valor) {
        this.valor = valor;
    }
    
    public void inserirData(Date data) {
        this.data = data;
    }
    
    public void inserirDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public float obterSaldo() {
        return valor;
    }
    
    public void mostrarRelatorios() {
        System.out.println("ID: " + idRendaMensal);
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descricao);
    }
}
