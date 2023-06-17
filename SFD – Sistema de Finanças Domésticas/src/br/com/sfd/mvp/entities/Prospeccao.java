package br.com.sfd.mvp.entities;
public class Prospeccao {
    private int idProspeccao;
    private String descricao;
    private float valor;
    private int parcelas;

    public Prospeccao (){
    }

    public Prospeccao (int idProspeccao, String descricao, float valor, int parcelas) {
        super();
        this.idProspeccao = idProspeccao;
        this.descricao = descricao;
        this.valor = valor;
        this.parcelas = parcelas;
    }

    public void descricaoSimulador() {
        System.out.println("Descrição do Simulador: " + descricao);
    }
    
    public void inserirValor(float valor) {
        this.valor = valor;
    }
    
    public void inserirParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
    public void executarProspeccao() {
        System.out.println("Executando prospecção...");
        System.out.println("ID: " + idProspeccao);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Parcelas: " + parcelas);
    }
}
