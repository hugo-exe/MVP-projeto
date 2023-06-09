package br.com.sfd.mvp.application2;

import java.util.Date;

import br.com.sfd.mvp.entities.LancamentosGastos;

public class MainTestLançamentosG {

	    public static void main(String[] args) {
	        // Criação de objetos LancamentosGastos
	        LancamentosGastos lancamento1 = new LancamentosGastos(1, 50.0f, new Date(), "2 unidades");
	        LancamentosGastos lancamento2 = new LancamentosGastos(2, 100.0f, new Date(), "5 unidades");
	        LancamentosGastos lancamento3 = new LancamentosGastos(3, 75.0f, new Date(), "3 unidades");

	        // Teste dos métodos
	        LancamentosGastos lancamentos = new LancamentosGastos();

	        // Criar valores de gastosd
	        lancamentos.criarValoreGasto(lancamento1);
	        lancamentos.criarValoreGasto(lancamento2);
	        lancamentos.criarValoreGasto(lancamento3);

	        // Exibir valores de gastos 
	        System.out.println("Valores de Gastos:");
	        for (LancamentosGastos valorGasto : lancamentos.getValoresGastos()) {
	            System.out.println("ID: " + valorGasto.getIdLancamentosGerais());
	            System.out.println("Valor: " + valorGasto.getValorGasto());
	            System.out.println("------------------------");
	        }

	        // Deletar valor de gasto
	        lancamentos.deletarValoreGasto(lancamento2);

	        // Exibir valores de gastos após deletar
	        System.out.println("Valores de Gastos após deletar:");
	        for (LancamentosGastos valorGasto : lancamentos.getValoresGastos()) {
	            System.out.println("ID: " + valorGasto.getIdLancamentosGerais());
	            System.out.println("Valor: " + valorGasto.getValorGasto());
	            System.out.println("------------------------");
	        }

	        // Criar datas de gastos
	        lancamentos.criarDatasGastos(lancamento1);
	        lancamentos.criarDatasGastos(lancamento2);
	        lancamentos.criarDatasGastos(lancamento3);

	        // Exibir datas de gastos
	        System.out.println("Datas de Gastos:");
	        for (LancamentosGastos dataGasto : lancamentos.getDatasGastos()) {
	            System.out.println("ID: " + dataGasto.getIdLancamentosGerais());
	            System.out.println("Data: " + dataGasto.getDataGasto());
	            System.out.println("------------------------");
	        }

	        // Deletar data de gasto
	        lancamentos.deletarDatasGastos(lancamento2);

	        // Exibir datas de gastos após deletar
	        System.out.println("Datas de Gastos após deletar:");
	        for (LancamentosGastos dataGasto : lancamentos.getDatasGastos()) {
	            System.out.println("ID: " + dataGasto.getIdLancamentosGerais());
	            System.out.println("Data: " + dataGasto.getDataGasto());
	            System.out.println("------------------------");
	        }

	        // Alterar data de gasto
	        LancamentosGastos novaDataGasto = new LancamentosGastos(2, 100.0f, new Date(), "5 unidades - atualizado");
	        lancamentos.alterarDatasGastos(1, novaDataGasto);

	        // Exibir datas de gastos após alterar
	        System.out.println("Datas de Gastos após alterar:");
	        for (LancamentosGastos dataGasto : lancamentos.getDatasGastos()) {
	            System.out.println("ID: " + dataGasto.getIdLancamentosGerais());
	            System.out.println("Data: " + dataGasto.getDataGasto());
	            System.out.println("------------------------");
	        }

	        // Criar quantidades por consumos
	        lancamentos.criarQuantidadesPorConsumos(lancamento1);
	        lancamentos.criarQuantidadesPorConsumos(lancamento2);
	        lancamentos.criarQuantidadesPorConsumos(lancamento3);

	        // Exibir quantidades por consumos
	        System.out.println("Quantidades por Consumos:");
	        for (LancamentosGastos quantidadePorConsumo : lancamentos.getQuantidadesPorConsumos()) {
	            System.out.println("ID: " + quantidadePorConsumo.getIdLancamentosGerais());
	            System.out.println("Quantidade: " + quantidadePorConsumo.getQuantidadePorConsumo());
	            System.out.println("------------------------");
	        }

	        // Deletar quantidade por consumo
	        lancamentos.deletarQuantidadesPorConsumos(lancamento2);

	        // Exibir quantidades por consumos após deletar
	        System.out.println("Quantidades por Consumos após deletar:");
	        for (LancamentosGastos quantidadePorConsumo : lancamentos.getQuantidadesPorConsumos()) {
	            System.out.println("ID: " + quantidadePorConsumo.getIdLancamentosGerais());
	            System.out.println("Quantidade: " + quantidadePorConsumo.getQuantidadePorConsumo());
	            System.out.println("------------------------");
	        }

	        // Alterar quantidade por consumo
	        LancamentosGastos novaQuantidadePorConsumo = new LancamentosGastos(2, 100.0f, new Date(), "5 unidades - atualizado");
	        lancamentos.alterarQuantidadesPorConsumos(1, novaQuantidadePorConsumo);

	        // Exibir quantidades por consumos após alterar
	        System.out.println("Quantidades por Consumos após alterar:");
	        for (LancamentosGastos quantidadePorConsumo : lancamentos.getQuantidadesPorConsumos()) {
	            System.out.println("ID: " + quantidadePorConsumo.getIdLancamentosGerais());
	            System.out.println("Quantidade: " + quantidadePorConsumo.getQuantidadePorConsumo());
	            System.out.println("------------------------");
	        }
	    }
}