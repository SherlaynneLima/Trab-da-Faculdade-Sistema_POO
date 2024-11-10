package ViewAgenda;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import enums.Cargo;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaCadastrarFuncionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel JanelaCadastroFuncionario;
	private JTextField txtNomeCadastrar;
	private JTextField txtDataNascimentoCadastrar;
	private JTextField txtBairroCadastrar;
	private JTextField txtTelefoneCadastrar;
	private JTextField txtEnderecoCadastrar;
	private JTextField txtCidadeCadastrar;
	private JTextField txtSalarioCadastrar;

	public TelaCadastrarFuncionario() {
		setTitle("Cadastro de Funcionário");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 530);
		JanelaCadastroFuncionario = new JPanel();
		JanelaCadastroFuncionario.setBackground(Color.WHITE);
		JanelaCadastroFuncionario.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(JanelaCadastroFuncionario);
		JanelaCadastroFuncionario.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(TelaCadastrarFuncionario.class.getResource("/Agenda GlamMenor.png")));
		lblLogo.setBounds(178, 11, 328, 176);
		JanelaCadastroFuncionario.add(lblLogo);
		
		JLabel lblpreenchaAsInformaes = new JLabel("<html><body style='text-align: justify;'>Preencha as informa\u00E7\u00F5es dos seus funcion\u00E1rios nos campos abaixo. Ao finalizar, clique em 'Confirmar' para concluir o cadastro.</body></html>");
		lblpreenchaAsInformaes.setVerticalAlignment(SwingConstants.TOP);
		lblpreenchaAsInformaes.setHorizontalAlignment(SwingConstants.CENTER);
		lblpreenchaAsInformaes.setForeground(Color.GRAY);
		lblpreenchaAsInformaes.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblpreenchaAsInformaes.setBounds(21, 188, 638, 47);
		JanelaCadastroFuncionario.add(lblpreenchaAsInformaes);
		
		JLabel lblNomeCadastrar = new JLabel("Nome:");
		lblNomeCadastrar.setForeground(Color.GRAY);
		lblNomeCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNomeCadastrar.setBounds(21, 249, 72, 22);
		JanelaCadastroFuncionario.add(lblNomeCadastrar);
		
		JLabel lblDataNascimentoCadastrar = new JLabel("<html>Data <br> Nascimento:</html>");
		lblDataNascimentoCadastrar.setForeground(Color.GRAY);
		lblDataNascimentoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDataNascimentoCadastrar.setBounds(21, 282, 81, 35);
		JanelaCadastroFuncionario.add(lblDataNascimentoCadastrar);
		
		JLabel lblBairroCadastrar = new JLabel("Bairro:");
		lblBairroCadastrar.setForeground(Color.GRAY);
		lblBairroCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblBairroCadastrar.setBounds(21, 328, 72, 22);
		JanelaCadastroFuncionario.add(lblBairroCadastrar);
		
		txtNomeCadastrar = new JTextField();
		txtNomeCadastrar.setForeground(Color.GRAY);
		txtNomeCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtNomeCadastrar.setColumns(10);
		txtNomeCadastrar.setBackground(new Color(240, 248, 255));
		txtNomeCadastrar.setBounds(106, 243, 210, 35);
		JanelaCadastroFuncionario.add(txtNomeCadastrar);
		
		txtDataNascimentoCadastrar = new JTextField();
		txtDataNascimentoCadastrar.setForeground(Color.GRAY);
		txtDataNascimentoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtDataNascimentoCadastrar.setColumns(10);
		txtDataNascimentoCadastrar.setBackground(new Color(240, 248, 255));
		txtDataNascimentoCadastrar.setBounds(106, 282, 210, 35);
		JanelaCadastroFuncionario.add(txtDataNascimentoCadastrar);
		
		txtBairroCadastrar = new JTextField();
		txtBairroCadastrar.setForeground(Color.GRAY);
		txtBairroCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtBairroCadastrar.setColumns(10);
		txtBairroCadastrar.setBackground(new Color(240, 248, 255));
		txtBairroCadastrar.setBounds(106, 321, 210, 35);
		JanelaCadastroFuncionario.add(txtBairroCadastrar);
		
		JLabel lblTelefoneCadastrar = new JLabel("Telefone:");
		lblTelefoneCadastrar.setForeground(Color.GRAY);
		lblTelefoneCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTelefoneCadastrar.setBounds(354, 251, 72, 22);
		JanelaCadastroFuncionario.add(lblTelefoneCadastrar);
		
		txtTelefoneCadastrar = new JTextField();
		txtTelefoneCadastrar.setForeground(Color.GRAY);
		txtTelefoneCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtTelefoneCadastrar.setColumns(10);
		txtTelefoneCadastrar.setBackground(new Color(240, 248, 255));
		txtTelefoneCadastrar.setBounds(426, 243, 210, 35);
		JanelaCadastroFuncionario.add(txtTelefoneCadastrar);
		
		JLabel lblEnderecoCadastrar = new JLabel("Endere\u00E7o:");
		lblEnderecoCadastrar.setForeground(Color.GRAY);
		lblEnderecoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnderecoCadastrar.setBounds(354, 288, 72, 22);
		JanelaCadastroFuncionario.add(lblEnderecoCadastrar);
		
		txtEnderecoCadastrar = new JTextField();
		txtEnderecoCadastrar.setForeground(Color.GRAY);
		txtEnderecoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtEnderecoCadastrar.setColumns(10);
		txtEnderecoCadastrar.setBackground(new Color(240, 248, 255));
		txtEnderecoCadastrar.setBounds(426, 282, 210, 35);
		JanelaCadastroFuncionario.add(txtEnderecoCadastrar);
		
		JLabel lblCidadeCadastrar = new JLabel("Cidade:");
		lblCidadeCadastrar.setForeground(Color.GRAY);
		lblCidadeCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCidadeCadastrar.setBounds(354, 327, 72, 22);
		JanelaCadastroFuncionario.add(lblCidadeCadastrar);
		
		txtCidadeCadastrar = new JTextField();
		txtCidadeCadastrar.setForeground(Color.GRAY);
		txtCidadeCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtCidadeCadastrar.setColumns(10);
		txtCidadeCadastrar.setBackground(new Color(240, 248, 255));
		txtCidadeCadastrar.setBounds(426, 321, 210, 35);
		JanelaCadastroFuncionario.add(txtCidadeCadastrar);
		
		JLabel lblCargoCadastrar = new JLabel("Cargo:");
		lblCargoCadastrar.setForeground(Color.GRAY);
		lblCargoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCargoCadastrar.setBounds(21, 366, 72, 22);
		JanelaCadastroFuncionario.add(lblCargoCadastrar);
		
		JComboBox<String> cbxListaCargo = new JComboBox<String>();
		cbxListaCargo.setBounds(105, 361, 211, 35);
		cbxListaCargo.setForeground(Color.GRAY);
		JanelaCadastroFuncionario.add(cbxListaCargo);
		//Lista Cargo
		for(Cargo cargo: Cargo.values()){
			cbxListaCargo.addItem(cargo.toString());
		}
		
		JLabel lblSalarioCadastrar = new JLabel("Sal\u00E1rio:");
		lblSalarioCadastrar.setForeground(Color.GRAY);
		lblSalarioCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSalarioCadastrar.setBounds(354, 371, 72, 22);
		JanelaCadastroFuncionario.add(lblSalarioCadastrar);
		
		txtSalarioCadastrar = new JTextField();
		txtSalarioCadastrar.setForeground(Color.GRAY);
		txtSalarioCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtSalarioCadastrar.setColumns(10);
		txtSalarioCadastrar.setBackground(new Color(240, 248, 255));
		txtSalarioCadastrar.setBounds(426, 360, 210, 35);
		JanelaCadastroFuncionario.add(txtSalarioCadastrar);
		
		JButton btnConfirmarCadastrar = new JButton("Confirmar");
		btnConfirmarCadastrar.setForeground(new Color(0, 139, 139));
		btnConfirmarCadastrar.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnConfirmarCadastrar.setBackground(new Color(152, 251, 152));
		btnConfirmarCadastrar.setBounds(178, 422, 159, 40);
		JanelaCadastroFuncionario.add(btnConfirmarCadastrar);
		
		btnConfirmarCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Formulário funcionário
                Funcionario funcionario = new Funcionario(
                    txtNomeCadastrar.getText(),
                    txtTelefoneCadastrar.getText(),
                    txtDataNascimentoCadastrar.getText(),
                    txtEnderecoCadastrar.getText(),
                    txtBairroCadastrar.getText(),
                    txtCidadeCadastrar.getText(),
                    cbxListaCargo.getSelectedItem().toString(),
                    txtSalarioCadastrar.getText());

                Funcionario.adicionarFuncionario(funcionario);

                JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");

                limparCampos();
            }
        });

	// btnVerFuncionario	
				JButton btnVerFuncionario = new JButton("Ver Funcionarios");
				btnVerFuncionario.setForeground(new Color(0, 0, 139));
				btnVerFuncionario.setFont(new Font("SansSerif", Font.BOLD, 14));
				btnVerFuncionario.setBackground(new Color(173, 216, 230));
				btnVerFuncionario.setBounds(364, 422, 159, 40);
				JanelaCadastroFuncionario.add(btnVerFuncionario);

				btnVerFuncionario.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						TelaListaFuncionarios telaListaFuncionario = new TelaListaFuncionarios();
						telaListaFuncionario.setVisible(true);
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
        txtSalarioCadastrar.setText("");
	}
}
