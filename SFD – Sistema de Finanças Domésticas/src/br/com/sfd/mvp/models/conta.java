public class conta {
    private int idConta;
     private String nomeConta;

     public conta() {
     }

    public conta(int idConta, String nomeConta) {
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

    public void inserirConta(conta conta) {
        this.inserirConta(conta);
    }
    public void deletarConta(conta conta) {
        this.deletarConta(conta);
    }
    public void alterarConta(String nome) {
        this.alterarConta(nome);
    }


}