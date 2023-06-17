package br.com.sfd.mvp.application;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import br.com.sfd.mvp.entities.ContaPanel;
import br.com.sfd.mvp.entities.LancamentosGastos;
import br.com.sfd.mvp.entities.LancamentosGastosPanel;
import br.com.sfd.mvp.entities.ProspeccaoPanel;
import br.com.sfd.mvp.entities.RendaMensal;
import br.com.sfd.mvp.entities.RendaMensalPanel;
import view.RendaMensalGUI;

public class MainProgram {

    private JFrame frame;
    private List<LancamentosGastos> lancamentos;
    private List<RendaMensal> rendaMensalList;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainProgram window = new MainProgram();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MainProgram() {
        lancamentos = new ArrayList<>();
        rendaMensalList = new ArrayList<>();
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame = new JFrame();
        frame.setBounds(100, 100, 1280, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnConta = new JButton("Conta");
        btnConta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirContaPanel();
            }
        });

        JButton btnProspeccao = new JButton("Prospecção");
        btnProspeccao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirProspeccaoPanel();
            }
        });

        JButton btnRendaMensal = new JButton("Renda Mensal");
        btnRendaMensal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirRendaMensalPanel();
            }
        });

        JButton btnLancamentosGastos = new JButton("Lançamentos Gastos");
        btnLancamentosGastos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirLancamentosPanel();
            }
        });

        JButton btnUsuario = new JButton("Usuário");
        btnUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        btnConta.setBounds(10, 10, 200, 23);
        frame.getContentPane().add(btnConta);

        btnProspeccao.setBounds(220, 10, 200, 23);
        frame.getContentPane().add(btnProspeccao);

        btnRendaMensal.setBounds(430, 10, 200, 23);
        frame.getContentPane().add(btnRendaMensal);

        btnLancamentosGastos.setBounds(640, 10, 200, 23);
        frame.getContentPane().add(btnLancamentosGastos);

        btnUsuario.setBounds(850, 10, 200, 23);
        frame.getContentPane().add(btnUsuario);

    }

    private void exibirLancamentosPanel() {
        JFrame lancamentosFrame = new JFrame("Lançamentos de Gastos");
        lancamentosFrame.setSize(1280, 800);

        LancamentosGastosPanel lancamentosPanel = new LancamentosGastosPanel(lancamentos);
        lancamentosFrame.add(lancamentosPanel);

        lancamentosFrame.setVisible(true);
    }

    private void exibirContaPanel() {
        JFrame contaFrame = new JFrame("Conta");
        contaFrame.setSize(1280, 800);
        ContaPanel contaPanel = new ContaPanel();
        contaFrame.add(contaPanel);

        contaFrame.setVisible(true);
    }

    private void exibirRendaMensalPanel() {
        JFrame rendaMensalFrame = new JFrame("Renda Mensal");
        rendaMensalFrame.setSize(1000, 800);

        Component rendaMensalGUI = new RendaMensalGUI(rendaMensalList);
        rendaMensalFrame.add(rendaMensalGUI);

        rendaMensalFrame.setVisible(true);
    }

    private void exibirProspeccaoPanel() {
        JFrame prospeccaoFrame = new JFrame("Prospecção");
        prospeccaoFrame.setSize(300, 200);

        ProspeccaoPanel prospeccaoPanel = new ProspeccaoPanel();
        prospeccaoFrame.add(prospeccaoPanel);

        prospeccaoFrame.setVisible(true);
    }
}
