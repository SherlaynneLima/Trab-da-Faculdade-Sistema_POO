package ViewAgenda;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel JanelaInicial;

	public TelaInicial() {
        setTitle("Agenda Glam");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 530);
        JanelaInicial = new JPanel();
        JanelaInicial.setBackground(Color.WHITE);
        JanelaInicial.setLayout(null);
        setContentPane(JanelaInicial);
        
        JLabel lblTitulo = new JLabel("Bem-vindo ao Sistema de Salão");
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        lblTitulo.setBounds(255, 31, 222, 30);
        JanelaInicial.add(lblTitulo);
        
        JButton btnCadastrarCliente = new JButton("Cadastrar Novo Cliente");
        btnCadastrarCliente.setBackground(new Color(152, 251, 152));
        btnCadastrarCliente.setForeground(new Color(0, 139, 139));
        btnCadastrarCliente.setFont(new Font("Dialog", Font.BOLD, 12));
        btnCadastrarCliente.setBounds(29, 107, 200, 30);
        JanelaInicial.add(btnCadastrarCliente);
        
        JButton btnVerClientes = new JButton("Ver Lista de Clientes");
        btnVerClientes.setBackground(new Color(135, 206, 235));
        btnVerClientes.setFont(new Font("Dialog", Font.BOLD, 12));
        btnVerClientes.setBounds(239, 107, 200, 30);
        JanelaInicial.add(btnVerClientes);
        
        JLabel lblImg = new JLabel("");
        lblImg.setIcon(new ImageIcon(TelaInicial.class.getResource("/Agenda Glam100x50.png")));
        lblImg.setBounds(10, 11, 100, 50);
        JanelaInicial.add(lblImg);
        
        JButton btnAgendarClientes = new JButton("Agendar Clientes");
        btnAgendarClientes.setFont(new Font("Dialog", Font.BOLD, 12));
        btnAgendarClientes.setBackground(new Color(255, 228, 196));
        btnAgendarClientes.setBounds(449, 107, 200, 30);
        JanelaInicial.add(btnAgendarClientes);
        
        JButton btnVerFuncionario = new JButton("Ver Lista de Funcion\u00E1rios");
        btnVerFuncionario.setFont(new Font("Dialog", Font.BOLD, 12));
        btnVerFuncionario.setBackground(new Color(135, 206, 235));
        btnVerFuncionario.setBounds(239, 152, 200, 30);
        JanelaInicial.add(btnVerFuncionario);
        
        JButton btnCadastrarFuncionario = new JButton("Cadastrar Novo Funcionario");
        btnCadastrarFuncionario.setForeground(new Color(0, 139, 139));
        btnCadastrarFuncionario.setFont(new Font("Dialog", Font.BOLD, 12));
        btnCadastrarFuncionario.setBackground(new Color(152, 251, 152));
        btnCadastrarFuncionario.setBounds(29, 152, 200, 30);
        JanelaInicial.add(btnCadastrarFuncionario);
        
        JButton btnRelatorio = new JButton("Ver Relatorio");
        btnRelatorio.setFont(new Font("Dialog", Font.BOLD, 12));
        btnRelatorio.setBackground(new Color(220, 220, 220));
        btnRelatorio.setBounds(449, 152, 200, 30);
        JanelaInicial.add(btnRelatorio);
        
        // btnCadastrarCliente
        btnCadastrarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastrarCliente telaCadastrar = new TelaCadastrarCliente();
                telaCadastrar.setVisible(true);
            }
        });
        
     // btnCadastrarFuncionario
        btnCadastrarFuncionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastrarFuncionario telaCadastrarFunc = new TelaCadastrarFuncionario();
                telaCadastrarFunc.setVisible(true);
            }
        });
        
        // btnVerClientes
        btnVerClientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaListaClientes telaLista = new TelaListaClientes();
                telaLista.setVisible(true);
            }
        });
        
     // btnAgendarClientes
        btnAgendarClientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaAgenda telaAgenda = new TelaAgenda();
                telaAgenda.setVisible(true);
            }
        });
        
     // btnVerFuncionario
        btnVerFuncionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaListaFuncionario telaListaFunc = new TelaListaFuncionario();
                telaListaFunc.setVisible(true);
            }
        });
        
     // btnRelatorio
        btnRelatorio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRelatorio telaRelatorio = new TelaRelatorio();
                telaRelatorio.setVisible(true);
            }
        });
    }
}