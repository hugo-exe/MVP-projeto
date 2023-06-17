package br.com.sfd.mvp.entities;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContaPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel idLabel;
    private JTextField idField;
    private JLabel nomeLabel;
    private JTextField nomeField;

    private JButton inserirButton;
    private JButton deletarButton;
    private JButton alterarButton;
    private JButton verButton;

    private Conta conta; // Referência para a instância da classe Conta

    public ContaPanel() {
        initComponents();
        conta = new Conta();
    }

    private void initComponents() {
        setLayout(null);

        idLabel = new JLabel("ID da Conta:");
        idLabel.setBounds(10, 10, 100, 20);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(120, 10, 100, 20);
        add(idField);

        nomeLabel = new JLabel("Nome da Conta:");
        nomeLabel.setBounds(10, 40, 100, 20);
        add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(120, 40, 100, 20);
        add(nomeField);

        inserirButton = new JButton("Inserir Conta");
        inserirButton.setBounds(10, 70, 120, 23);
        inserirButton.addActionListener(e -> inserirConta());
        add(inserirButton);

        deletarButton = new JButton("Deletar Conta");
        deletarButton.setBounds(140, 70, 120, 23);
        deletarButton.addActionListener(e -> deletarConta());
        add(deletarButton);

        alterarButton = new JButton("Alterar Conta");
        alterarButton.setBounds(270, 70, 120, 23);
        alterarButton.addActionListener(e -> alterarConta());
        add(alterarButton);

        verButton = new JButton("Ver Conta");
        verButton.setBounds(400, 70, 120, 23);
        verButton.addActionListener(e -> verConta());
        add(verButton);
    }

    private void inserirConta() {
        int id = Integer.parseInt(idField.getText());
        String nome = nomeField.getText();
        Conta novaConta = new Conta(id, nome);
        conta.inserirConta(novaConta);
    }

    private void deletarConta() {
        int id = Integer.parseInt(idField.getText());
        conta.deletarConta(id);
    }

    private void alterarConta() {
        String nome = nomeField.getText();
        conta.alterarConta(nome);
    }

    private void verConta() {
        int id = Integer.parseInt(idField.getText());
        Conta conta = this.conta.verConta(id);
        if (conta != null) {
            idField.setText(Integer.toString(conta.getIdConta()));
            nomeField.setText(conta.getNomeConta());
        } else {
            // Conta não encontrada
            idField.setText("");
            nomeField.setText("");
        }
    }
}