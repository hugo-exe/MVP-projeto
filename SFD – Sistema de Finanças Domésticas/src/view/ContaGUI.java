package view;

import javax.swing.*;

public class ContaGUI extends JFrame {
    private JLabel idLabel;
    private JTextField idField;
    private JLabel nomeLabel;
    private JTextField nomeField;

    private JButton inserirButton;
    private JButton deletarButton;
    private JButton alterarButton;

    public ContaGUI() {
        setTitle("Gerenciamento de Contas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        idLabel = new JLabel("ID da Conta:");
        idField = new JTextField(10);

        nomeLabel = new JLabel("Nome da Conta:");
        nomeField = new JTextField(10);

        inserirButton = new JButton("Inserir Conta");
        deletarButton = new JButton("Deletar Conta");
        alterarButton = new JButton("Alterar Conta");

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(inserirButton);
        panel.add(deletarButton);
        panel.add(alterarButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ContaGUI contaGUI = new ContaGUI();
            contaGUI.setVisible(true);
        });
    }
}
