package br.com.sfd.mvp.application;

import br.com.sfd.mvp.models.Prospeccao;

public class MainProspeccao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
        Prospeccao prospeccao = new Prospeccao(1, "Descrição da Prospeccao", 1000.0f, 12);
        
        prospeccao.executarProspeccao();
        // Saída esperada:
        // Executando prospecção...
        // ID: 1
        // Descrição: Descrição da Prospeccao
        // Valor: 1000.0
        // Parcelas: 12
        
        prospeccao.descricaoSimulador();
        // Saída esperada:
        // Descrição do Simulador: Descrição da Prospeccao
        
        // Atualizando o valor e as parcelas
        prospeccao.inserirValor(2000.0f);
        prospeccao.inserirParcelas(24);
        
        prospeccao.executarProspeccao();
        // Saída esperada:
        // Executando prospecção...
        // ID: 1
        // Descrição: Descrição da Prospeccao
        // Valor: 2000.0
        // Parcelas: 24
	    }
	
	}


