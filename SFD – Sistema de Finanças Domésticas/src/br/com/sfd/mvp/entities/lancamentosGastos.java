package br.com.sfd.mvp.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class LancamentosGastos {
	private int idLancamentosGerais;
	 private float valorGasto;
	 private List<LancamentosGastos> ValoresGastos = new ArrayList<>();
	 private Date dataGasto;
	 private List<LancamentosGastos> datasGastos = new ArrayList<>();
	 private String quantidadePorConsumo;
	 private List<LancamentosGastos> quantidadesPorConsumos = new ArrayList<>();
	 
	 public LancamentosGastos() {
	 }

	public LancamentosGastos(int idLancamentosGerais, float valorGasto, Date dataGasto, String quantidadePorConsumo) {
		this.idLancamentosGerais = idLancamentosGerais;
		this.valorGasto = valorGasto;
		this.dataGasto = dataGasto;
		this.quantidadePorConsumo = quantidadePorConsumo;
	}

	public int getIdLancamentosGerais() {
		return idLancamentosGerais;
	}

	public void setIdLancamentosGerais(int idLancamentosGerais) {
		this.idLancamentosGerais = idLancamentosGerais;
	}

	public float getValorGasto() {
		return valorGasto;
	}

	public void setValorGasto(float valorGasto) {
		this.valorGasto = valorGasto;
	}

	public Date getDataGasto() {
		return dataGasto;
	}

	public void setDataGasto(Date dataGasto) {
		this.dataGasto = dataGasto;
	}

	public String getQuantidadePorConsumo() {
		return quantidadePorConsumo;
	}

	public void setQuantidadePorConsumo(String quantidadePorConsumo) {
		this.quantidadePorConsumo = quantidadePorConsumo;
	}

	public List<LancamentosGastos> getValoresGastos() {
		return ValoresGastos;
	}
	
	public void criarValoreGasto(LancamentosGastos valorGasto) {
		ValoresGastos.add(valorGasto);
    }
	
	public void deletarValoreGasto(LancamentosGastos valorGasto) {
		ValoresGastos.remove(valorGasto);
    }
	
	public void alterarValoreGasto(int index, LancamentosGastos newvalorGasto) {
		ValoresGastos.set(index, newvalorGasto);
    }
	
	public List<LancamentosGastos> getDatasGastos() {
        return datasGastos;
    }

    public void criarDatasGastos(LancamentosGastos dataGasto) {
        datasGastos.add(dataGasto);
    }

    public void deletarDatasGastos(LancamentosGastos dataGasto) {
        datasGastos.remove(dataGasto);
    }

    public void alterarDatasGastos(int index, LancamentosGastos newDataGasto) {
        datasGastos.set(index, newDataGasto);
    }

    public List<LancamentosGastos> getQuantidadesPorConsumos() {
        return quantidadesPorConsumos;
    }

    public void criarQuantidadesPorConsumos(LancamentosGastos quantidadePorConsumo) {
        quantidadesPorConsumos.add(quantidadePorConsumo);
    }

    public void deletarQuantidadesPorConsumos(LancamentosGastos quantidadePorConsumo) {
        quantidadesPorConsumos.remove(quantidadePorConsumo);
    }

    public void alterarQuantidadesPorConsumos(int index, LancamentosGastos newQuantidadePorConsumo) {
        quantidadesPorConsumos.set(index, newQuantidadePorConsumo);
    }
}