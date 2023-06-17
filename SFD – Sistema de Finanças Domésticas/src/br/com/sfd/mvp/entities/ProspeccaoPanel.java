package br.com.sfd.mvp.entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProspeccaoPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel idLabel;
    private JTextField idField;
    private JLabel descricaoLabel;
    private JTextField descricaoField;
    private JLabel valorLabel;
    private JTextField valorField;
    private JLabel parcelasLabel;
    private JTextField parcelasField;
    private JButton executarButton;

    public ProspeccaoPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        idLabel = new JLabel("ID da Prospeccao:");
        idField = new JTextField(10);

        descricaoLabel = new JLabel("Descrição:");
        descricaoField = new JTextField(10);

        valorLabel = new JLabel("Valor:");
        valorField = new JTextField(10);

        parcelasLabel = new JLabel("Parcelas:");
        parcelasField = new JTextField(10);

        executarButton = new JButton("Executar Prospeccao");

        add(idLabel);
        add(idField);
        add(descricaoLabel);
        add(descricaoField);
        add(valorLabel);
        add(valorField);
        add(parcelasLabel);
        add(parcelasField);
        add(executarButton);

        executarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String descricao = descricaoField.getText();
                float valor = Float.parseFloat(valorField.getText());
                int parcelas = Integer.parseInt(parcelasField.getText());

                Prospeccao prospeccao = new Prospeccao(id, descricao, valor, parcelas);
                prospeccao.executarProspeccao();
            }
        });
    }
}
