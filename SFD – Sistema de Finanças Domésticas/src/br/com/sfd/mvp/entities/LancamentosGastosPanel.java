package br.com.sfd.mvp.entities;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LancamentosGastosPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField idField;
    private JTextField valorField;
    private JTextField dataField;
    private JTextField quantidadeField;
    private JButton addButton;
    private JButton removeButton;

    private List<LancamentosGastos> lancamentos;
    private JButton exibirButton_1;

    public LancamentosGastosPanel(List<LancamentosGastos> lancamentos) {
        this.lancamentos = lancamentos;

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 90, 150, 30);
        idField = new JTextField();
        idField.setBounds(170, 90, 225, 30);
        JLabel valorLabel = new JLabel("Valor Gasto:");
        valorLabel.setBounds(10, 135, 150, 30);
        valorField = new JTextField();
        valorField.setBounds(170, 131, 225, 30);
        JLabel dataLabel = new JLabel("Data Gasto:");
        dataLabel.setBounds(10, 176, 150, 30);
        dataField = new JTextField();
        dataField.setBounds(170, 172, 225, 30);
        JLabel quantidadeLabel = new JLabel("Quantidade por Consumo:");
        quantidadeLabel.setBounds(10, 217, 150, 30);
        quantidadeField = new JTextField();
        quantidadeField.setBounds(170, 217, 225, 30);

        addButton = new JButton("Adicionar");
        addButton.setBounds(10, 11, 150, 30);
        removeButton = new JButton("Remover");
        removeButton.setBounds(170, 11, 150, 30);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarLancamentoGasto();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerLancamentoGasto();
            }
        });
        setLayout(null);

        add(idLabel);
        add(idField);
        add(valorLabel);
        add(valorField);
        add(dataLabel);
        add(dataField);
        add(quantidadeLabel);
        add(quantidadeField);
        add(addButton);
        add(removeButton);
        
        exibirButton_1 = new JButton("Exibir");
        exibirButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		exibirLancamentos();
        	}
        });
        exibirButton_1.setBounds(330, 11, 150, 30);
        add(exibirButton_1);
    }

    private void adicionarLancamentoGasto() {
        int id = Integer.parseInt(idField.getText());
        float valor = Float.parseFloat(valorField.getText());
        Date data = new Date(); // Você pode modificar para obter a data do campo dataField se desejar
        String quantidade = quantidadeField.getText();

        LancamentosGastos lancamento = new LancamentosGastos(id, valor, data, quantidade);
        lancamentos.add(lancamento);

        limparCampos();
        exibirLancamentos();
    }

    private void removerLancamentoGasto() {
        int id = Integer.parseInt(idField.getText());

        LancamentosGastos lancamentoRemover = null;
        for (LancamentosGastos lancamento : lancamentos) {
            if (lancamento.getIdLancamentosGerais() == id) {
                lancamentoRemover = lancamento;
                break;
            }
        }

        if (lancamentoRemover != null) {
            lancamentos.remove(lancamentoRemover);
            limparCampos();
            exibirLancamentos();
        } else {
            JOptionPane.showMessageDialog(this, "Lancamento não encontrado!");
        }
    }

    private void limparCampos() {
        idField.setText("");
        valorField.setText("");
        dataField.setText("");
        quantidadeField.setText("");
    }

    private void exibirLancamentos() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Lista de Lançamentos de Gastos ===\n");
        for (LancamentosGastos lancamento : lancamentos) {
            sb.append("ID: ").append(lancamento.getIdLancamentosGerais()).append("\n");
            sb.append("Valor Gasto: ").append(lancamento.getValorGasto()).append("\n");
            sb.append("Data Gasto: ").append(lancamento.getDataGasto()).append("\n");
            sb.append("Quantidade por Consumo: ").append(lancamento.getQuantidadePorConsumo()).append("\n");
            sb.append("-----------------------------\n");
        }
        JOptionPane.showMessageDialog(this, sb.toString(), "Lançamentos de Gastos", JOptionPane.INFORMATION_MESSAGE);
    }
}
