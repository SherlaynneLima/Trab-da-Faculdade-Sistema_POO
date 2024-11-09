package ViewAgenda;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastrarCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel JanelaCadastroCliente;
	private JTextField txtNomeCadastrar;
	private JTextField txtTelefoneCadastrar;
	private JTextField txtEnderecoCadastrar;
	private JTextField txtCidadeCadastrar;
	private JTextField txtDataNascimentoCadastrar;
	private JTextField txtBairroCadastrar;
	private JButton btnVerClientes;
	
	
	public TelaCadastrarCliente() {
		setTitle("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 530);
		JanelaCadastroCliente = new JPanel();
		JanelaCadastroCliente.setBackground(Color.WHITE);
		JanelaCadastroCliente.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(JanelaCadastroCliente);
		JanelaCadastroCliente.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(TelaCadastrarCliente.class.getResource("/Agenda GlamMenor.png")));
		lblLogo.setBounds(176, 11, 328, 176);
		JanelaCadastroCliente.add(lblLogo);

		JLabel lblinfo1Cadastrar = new JLabel("<html><body style='text-align: justify;'>Preencha as informa\u00E7\u00F5es do cliente nos campos abaixo. Ao finalizar, clique em 'Confirmar' para concluir o cadastro.</body></html>");
        lblinfo1Cadastrar.setVerticalAlignment(SwingConstants.TOP);
        lblinfo1Cadastrar.setHorizontalAlignment(SwingConstants.CENTER);
        lblinfo1Cadastrar.setForeground(Color.GRAY);
        lblinfo1Cadastrar.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        lblinfo1Cadastrar.setBounds(30, 187, 618, 47);
		JanelaCadastroCliente.add(lblinfo1Cadastrar);
		
		JLabel lblNomeCadastrar = new JLabel("Nome:");
        lblNomeCadastrar.setForeground(Color.GRAY);
        lblNomeCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNomeCadastrar.setBounds(33, 276, 72, 22);
		JanelaCadastroCliente.add(lblNomeCadastrar);

        JLabel lblTelefoneCadastrar = new JLabel("Telefone:");
        lblTelefoneCadastrar.setForeground(Color.GRAY);
        lblTelefoneCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblTelefoneCadastrar.setBounds(366, 278, 72, 22);
        JanelaCadastroCliente.add(lblTelefoneCadastrar);

        JLabel lblDataNascimentoCadastrar = new JLabel("<html>Data <br> Nascimento:</html>");
        lblDataNascimentoCadastrar.setForeground(Color.GRAY);
        lblDataNascimentoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblDataNascimentoCadastrar.setBounds(33, 309, 81, 35);
        JanelaCadastroCliente.add(lblDataNascimentoCadastrar);

        JLabel lblEnderecoCadastrar = new JLabel("Endere\u00E7o:");
        lblEnderecoCadastrar.setForeground(Color.GRAY);
        lblEnderecoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblEnderecoCadastrar.setBounds(366, 315, 72, 22);
        JanelaCadastroCliente.add(lblEnderecoCadastrar);

        JLabel lblBairroCadastrar = new JLabel("Bairro:");
        lblBairroCadastrar.setForeground(Color.GRAY);
        lblBairroCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblBairroCadastrar.setBounds(33, 355, 72, 22);
        JanelaCadastroCliente.add(lblBairroCadastrar);
        
        JLabel lblCidadeCadastrar = new JLabel("Cidade:");
        lblCidadeCadastrar.setForeground(Color.GRAY);
        lblCidadeCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblCidadeCadastrar.setBounds(366, 354, 72, 22);
        JanelaCadastroCliente.add(lblCidadeCadastrar);
        
        txtNomeCadastrar = new JTextField();
        txtNomeCadastrar.setForeground(Color.GRAY);
        txtNomeCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
        txtNomeCadastrar.setColumns(10);
        txtNomeCadastrar.setBackground(new Color(240, 248, 255));
        txtNomeCadastrar.setBounds(118, 270, 210, 35);
        JanelaCadastroCliente.add(txtNomeCadastrar);

        txtTelefoneCadastrar = new JTextField();
        txtTelefoneCadastrar.setForeground(Color.GRAY);
        txtTelefoneCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
        txtTelefoneCadastrar.setColumns(10);
        txtTelefoneCadastrar.setBackground(new Color(240, 248, 255));
        txtTelefoneCadastrar.setBounds(438, 270, 210, 35);
        JanelaCadastroCliente.add(txtTelefoneCadastrar);

        txtEnderecoCadastrar = new JTextField();
        txtEnderecoCadastrar.setForeground(Color.GRAY);
        txtEnderecoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
        txtEnderecoCadastrar.setColumns(10);
        txtEnderecoCadastrar.setBackground(new Color(240, 248, 255));
        txtEnderecoCadastrar.setBounds(438, 309, 210, 35);
        JanelaCadastroCliente.add(txtEnderecoCadastrar);

        txtCidadeCadastrar = new JTextField();
        txtCidadeCadastrar.setForeground(Color.GRAY);
        txtCidadeCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
        txtCidadeCadastrar.setColumns(10);
        txtCidadeCadastrar.setBackground(new Color(240, 248, 255));
        txtCidadeCadastrar.setBounds(438, 348, 210, 35);
        JanelaCadastroCliente.add(txtCidadeCadastrar);

        txtDataNascimentoCadastrar = new JTextField();
        txtDataNascimentoCadastrar.setForeground(Color.GRAY);
        txtDataNascimentoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
        txtDataNascimentoCadastrar.setColumns(10);
        txtDataNascimentoCadastrar.setBackground(new Color(240, 248, 255));
        txtDataNascimentoCadastrar.setBounds(118, 309, 210, 35);
        JanelaCadastroCliente.add(txtDataNascimentoCadastrar);

        txtBairroCadastrar = new JTextField();
        txtBairroCadastrar.setForeground(Color.GRAY);
        txtBairroCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
        txtBairroCadastrar.setColumns(10);
        txtBairroCadastrar.setBackground(new Color(240, 248, 255));
        txtBairroCadastrar.setBounds(118, 348, 210, 35);
        JanelaCadastroCliente.add(txtBairroCadastrar);
        
        JButton btnConfirmarCadastrar = new JButton("Confirmar");
        btnConfirmarCadastrar.setForeground(new Color(0, 139, 139));
        btnConfirmarCadastrar.setFont(new Font("SansSerif", Font.BOLD, 17));
        btnConfirmarCadastrar.setBackground(new Color(152, 251, 152));
        btnConfirmarCadastrar.setBounds(189, 418, 149, 40);
        JanelaCadastroCliente.add(btnConfirmarCadastrar);
        
        btnConfirmarCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Formulário Cliente
                Cliente cliente = new Cliente(
                    txtNomeCadastrar.getText(),
                    txtTelefoneCadastrar.getText(),
                    txtDataNascimentoCadastrar.getText(),
                    txtEnderecoCadastrar.getText(),
                    txtBairroCadastrar.getText(),
                    txtCidadeCadastrar.getText());

                Cliente.adicionarCliente(cliente);

                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

                limparCampos();
            }
        });
	
	// btnVerClientes
			btnVerClientes = new JButton("Ver Clientes");
			btnVerClientes.setForeground(new Color(0, 0, 139));
			btnVerClientes.setFont(new Font("SansSerif", Font.BOLD, 17));
			btnVerClientes.setBackground(new Color(173, 216, 230));
			btnVerClientes.setBounds(357, 418, 149, 40);
			JanelaCadastroCliente.add(btnVerClientes);

			btnVerClientes.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					TelaListaClientes telaListaClientes = new TelaListaClientes();
					telaListaClientes.setVisible(true);
				}
			});
		}


    private void limparCampos() {
        txtNomeCadastrar.setText("");
        txtTelefoneCadastrar.setText("");
        txtDataNascimentoCadastrar.setText("");
        txtEnderecoCadastrar.setText("");
        txtBairroCadastrar.setText("");
        txtCidadeCadastrar.setText("");
    }
    
}
