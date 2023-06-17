package view;

import javax.swing.*;

import br.com.sfd.mvp.models.Usuario;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class UsuarioGUI extends JFrame {
    private JLabel idLabel;
    private JTextField idField;
    private JLabel nomeLabel;
    private JTextField nomeField;
    private JLabel senhaLabel;
    private JPasswordField senhaField;
    private JLabel confirmaSenhaLabel;
    private JPasswordField confirmaSenhaField;
    private JButton criarUsuarioButton;
    private JButton removerUsuarioButton;
    private JButton exibirUsuariosButton;
    private JButton buscarUsuarioButton;

    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioGUI() {
        setTitle("Usuários");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        idLabel = new JLabel("ID do Usuário:");
        idField = new JTextField(10);

        nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(10);

        senhaLabel = new JLabel("Senha:");
        senhaField = new JPasswordField(10);

        confirmaSenhaLabel = new JLabel("Confirmar Senha:");
        confirmaSenhaField = new JPasswordField(10);

        criarUsuarioButton = new JButton("Criar Usuário");
        removerUsuarioButton = new JButton("Remover Usuário");
        exibirUsuariosButton = new JButton("Exibir Usuários");
        buscarUsuarioButton = new JButton("Buscar Usuário");

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(senhaLabel);
        panel.add(senhaField);
        panel.add(confirmaSenhaLabel);
        panel.add(confirmaSenhaField);
        panel.add(criarUsuarioButton);
        panel.add(removerUsuarioButton);
        panel.add(exibirUsuariosButton);
        panel.add(buscarUsuarioButton);

        criarUsuarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String nome = nomeField.getText();
                String senha = new String(senhaField.getPassword());
                String confirmaSenha = new String(confirmaSenhaField.getPassword());

                Usuario usuario = new Usuario(id, nome, senha, confirmaSenha);
                usuarios.add(usuario);
                JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");
            }
        });

        removerUsuarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());

                Usuario usuarioRemover = null;
                for (Usuario usuario : usuarios) {
                    if (usuario.getIdUsuario() == id) {
                        usuarioRemover = usuario;
                        break;
                    }
                }

                if (usuarioRemover != null) {
                    usuarios.remove(usuarioRemover);
                    JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                }
            }
        });

        exibirUsuariosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder usuariosText = new StringBuilder();
                usuariosText.append("=== Lista de Usuários ===\n");
                for (Usuario usuario : usuarios) {
                    usuariosText.append("ID: ").append(usuario.getIdUsuario()).append("\n");
                    usuariosText.append("Nome: ").append(usuario.getNome()).append("\n");
                    usuariosText.append("------------------------\n");
                }
                JOptionPane.showMessageDialog(null, usuariosText.toString());
            }
        });

        buscarUsuarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());

                Usuario usuarioEncontrado = null;
                for (Usuario usuario : usuarios) {
                    if (usuario.getIdUsuario() == id) {
                        usuarioEncontrado = usuario;
                        break;
                    }
                }

                if (usuarioEncontrado != null) {
                    StringBuilder usuarioText = new StringBuilder();
                    usuarioText.append("Usuário encontrado:\n");
                    usuarioText.append("ID: ").append(usuarioEncontrado.getIdUsuario()).append("\n");
                    usuarioText.append("Nome: ").append(usuarioEncontrado.getNome()).append("\n");
                    JOptionPane.showMessageDialog(null, usuarioText.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                }
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UsuarioGUI usuarioGUI = new UsuarioGUI();
            usuarioGUI.setVisible(true);
        });
    }
}
