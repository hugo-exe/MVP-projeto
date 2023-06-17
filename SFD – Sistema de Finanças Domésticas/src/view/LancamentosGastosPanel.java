package view;

import javax.swing.*;

import br.com.sfd.mvp.entities.LancamentosGastos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class LancamentosGastosPanel extends JPanel {
    private JTextField idTextField;
    private JTextField valorTextField;
    private JTextField dataTextField;
    private JTextField quantidadeTextField;
    private JButton adicionarButton;
    private JList<LancamentosGastos> lancamentosList;
    private DefaultListModel<LancamentosGastos> listModel;

    public LancamentosGastosPanel() {
        setLayout(new BorderLayout());

        // Painel de formulário
        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(new JLabel("ID:"));
        idTextField = new JTextField();
        formPanel.add(idTextField);
        formPanel.add(new JLabel("Valor:"));
        valorTextField = new JTextField();
        formPanel.add(valorTextField);
        formPanel.add(new JLabel("Data:"));
        dataTextField = new JTextField();
        formPanel.add(dataTextField);
        formPanel.add(new JLabel("Quantidade:"));
        quantidadeTextField = new JTextField();
        formPanel.add(quantidadeTextField);

        // Botão de adicionar
        adicionarButton = new JButton("Adicionar");
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarLancamento();
            }
        });

        // Lista de lançamentos
        listModel = new DefaultListModel<>();
        lancamentosList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(lancamentosList);

        // Adicionar componentes ao painel principal
        add(formPanel, BorderLayout.NORTH);
        add(adicionarButton, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }

    private void adicionarLancamento() {
        int id = Integer.parseInt(idTextField.getText());
        float valor = Float.parseFloat(valorTextField.getText());
        Date data = new Date(dataTextField.getText());
        String quantidade = quantidadeTextField.getText();

        LancamentosGastos lancamento = new LancamentosGastos(id, valor, data, quantidade);
        listModel.addElement(lancamento);

        // Limpar os campos do formulário
        idTextField.setText("");
        valorTextField.setText("");
        dataTextField.setText("");
        quantidadeTextField.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lançamento de Gastos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new LancamentosGastosPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
