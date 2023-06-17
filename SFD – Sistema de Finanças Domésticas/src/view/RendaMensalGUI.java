package view;

import javax.swing.*;

import br.com.sfd.mvp.models.RendaMensal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RendaMensalGUI extends JFrame {
    private JLabel idLabel;
    private JTextField idField;
    private JLabel valorLabel;
    private JTextField valorField;
    private JLabel dataLabel;
    private JTextField dataField;
    private JLabel descricaoLabel;
    private JTextField descricaoField;
    private JButton mostrarRelatoriosButton;

    public RendaMensalGUI() {
        setTitle("Renda Mensal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        idLabel = new JLabel("ID da Renda Mensal:");
        idField = new JTextField(10);

        valorLabel = new JLabel("Valor:");
        valorField = new JTextField(10);

        dataLabel = new JLabel("Data (dd/MM/yyyy):");
        dataField = new JTextField(10);

        descricaoLabel = new JLabel("Descrição:");
        descricaoField = new JTextField(10);

        mostrarRelatoriosButton = new JButton("Mostrar Relatórios");

        panel.add(idLabel);
        panel.add(idField);
        panel.add(valorLabel);
        panel.add(valorField);
        panel.add(dataLabel);
        panel.add(dataField);
        panel.add(descricaoLabel);
        panel.add(descricaoField);
        panel.add(mostrarRelatoriosButton);

        mostrarRelatoriosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                float valor = Float.parseFloat(valorField.getText());
                Date data = parseDate(dataField.getText());
                String descricao = descricaoField.getText();

                RendaMensal rendaMensal = new RendaMensal(id, valor, data, descricao);
                rendaMensal.mostrarRelatorios();
            }
        });

        add(panel);
    }

    private Date parseDate(String dateString) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RendaMensalGUI rendaMensalGUI = new RendaMensalGUI();
            rendaMensalGUI.setVisible(true);
        });
    }
}
