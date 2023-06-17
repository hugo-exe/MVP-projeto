package br.com.sfd.mvp.application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.sfd.mvp.entities.RendaMensal;

public class RendaMensalPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private List<RendaMensal> rendaMensalList;
    private JTextField textFieldId;
    private JTextField textFieldValor;
    private JTextField textFieldData;
    private JTextField textFieldDescricao;

    /**
     * Create the panel.
     */
    public RendaMensalPanel(List<RendaMensal> rendaMensalList) {
        this.rendaMensalList = rendaMensalList;
        setLayout(null);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(10, 11, 46, 14);
        add(lblId);

        textFieldId = new JTextField();
        textFieldId.setBounds(74, 8, 86, 20);
        add(textFieldId);
        textFieldId.setColumns(10);

        JLabel lblValor = new JLabel("Valor:");
        lblValor.setBounds(10, 36, 46, 14);
        add(lblValor);

        textFieldValor = new JTextField();
        textFieldValor.setBounds(74, 33, 86, 20);
        add(textFieldValor);
        textFieldValor.setColumns(10);

        JLabel lblData = new JLabel("Data:");
        lblData.setBounds(10, 61, 46, 14);
        add(lblData);

        textFieldData = new JTextField();
        textFieldData.setBounds(74, 58, 86, 20);
        add(textFieldData);
        textFieldData.setColumns(10);

        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(10, 86, 64, 14);
        add(lblDescricao);

        textFieldDescricao = new JTextField();
        textFieldDescricao.setBounds(74, 83, 86, 20);
        add(textFieldDescricao);
        textFieldDescricao.setColumns(10);

        JButton btnInserir = new JButton("Inserir");
        btnInserir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inserirRendaMensal();
            }
        });
        btnInserir.setBounds(10, 114, 89, 23);
        add(btnInserir);
    }

    private void inserirRendaMensal() {
        int id = Integer.parseInt(textFieldId.getText());
        float valor = Float.parseFloat(textFieldValor.getText());
        Date data = new Date();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            data = sdf.parse(textFieldData.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String descricao = textFieldDescricao.getText();

        RendaMensal rendaMensal = new RendaMensal(id, valor, data, descricao);
        rendaMensalList.add(rendaMensal);

        limparCampos();
    }

    private void limparCampos() {
        textFieldId.setText("");
        textFieldValor.setText("");
        textFieldData.setText("");
        textFieldDescricao.setText("");
    }
}