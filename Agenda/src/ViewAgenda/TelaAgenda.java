package ViewAgenda;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import enums.HorarioSalao;
import enums.TipoPagamento;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;

public class TelaAgenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel JanelaAgendamento;

	public TelaAgenda() {
		setTitle("Agendamento Glam");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 530);
		JanelaAgendamento = new JPanel();
		JanelaAgendamento.setBackground(Color.WHITE);
		JanelaAgendamento.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(JanelaAgendamento);
		JanelaAgendamento.setLayout(null);
		
		JLabel lblInfo2 = new JLabel("<html><body style='text-align: justify;'>Preencha as informa\u00E7\u00F5es nos campos abaixo para registrar o agendamento. Ao finalizar, clique em 'Confirmar'.</body></html>");
		lblInfo2.setVerticalAlignment(SwingConstants.TOP);
		lblInfo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo2.setForeground(Color.GRAY);
		lblInfo2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblInfo2.setBounds(136, 35, 399, 36);
		JanelaAgendamento.add(lblInfo2);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(TelaAgenda.class.getResource("/Agenda Glam100x50.png")));
		lblImg.setBounds(562, 11, 100, 50);
		JanelaAgendamento.add(lblImg);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setForeground(Color.GRAY);
		lblCliente.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCliente.setBounds(22, 88, 61, 22);
		JanelaAgendamento.add(lblCliente);
		
		
        JComboBox<String> cbxListaClientes = new JComboBox<>();
        cbxListaClientes.setBounds(100, 85, 211, 30); 
        JanelaAgendamento.add(cbxListaClientes);
        // Lista de Cliente
        for (Cliente cliente : Cliente.getListaClientes()) {
            cbxListaClientes.addItem(cliente.getNome());
        }
        
		JLabel lblDataAgendamento = new JLabel("<html>Data do <br>Agendamento:</html>");
		lblDataAgendamento.setForeground(Color.GRAY);
		lblDataAgendamento.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDataAgendamento.setBounds(330, 82, 90, 35);
		JanelaAgendamento.add(lblDataAgendamento);
		
		JComboBox<String> cbxData = new JComboBox<String>();
		cbxData.setBounds(435, 85, 211, 30);
		JanelaAgendamento.add(cbxData);
		
		// Data Agendamento
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i <= 25; i++) {
            LocalDate data = hoje.plusDays(i); 
            cbxData.addItem(data.format(formatter)); 
        }
		
		JLabel lblHorario = new JLabel("Hor\u00E1rio:");
		lblHorario.setForeground(Color.GRAY);
		lblHorario.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblHorario.setBounds(22, 129, 61, 22);
		JanelaAgendamento.add(lblHorario);
		
		JComboBox<String> cbxHorario = new JComboBox<String>();
		cbxHorario.setBounds(100, 126, 211, 30);
		JanelaAgendamento.add(cbxHorario);
		// Horários do enum
		for (HorarioSalao horario: HorarioSalao.values()) {
			cbxHorario.addItem(horario.getHorario());
		}
		
		JLabel lblFormaPgmt = new JLabel("<html>Forma de <br>Pagamento:<html>");
		lblFormaPgmt.setForeground(Color.GRAY);
		lblFormaPgmt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFormaPgmt.setBounds(330, 124, 90, 35);
		JanelaAgendamento.add(lblFormaPgmt);
		
		JComboBox<String> cbxFormaPgmt = new JComboBox<String>();
		cbxFormaPgmt.setBounds(435, 126, 211, 30);
		JanelaAgendamento.add(cbxFormaPgmt);
		// Tipo de Pagamento
		for(TipoPagamento forma: TipoPagamento.values()){
			cbxFormaPgmt.addItem(forma.toString());
		}
		
		JComboBox<String> cbxAtendente = new JComboBox<String>();
		cbxAtendente.setBounds(100, 167, 211, 30);
		JanelaAgendamento.add(cbxAtendente);
		// Lista de Funcionário
		for (Funcionario funcionario : Funcionario.getListaFuncionarios()) {
            cbxAtendente.addItem(funcionario.getNome());
        }
		
		JLabel lblInfo3 = new JLabel("Descri\u00E7\u00E3o do Servi\u00E7o");
		lblInfo3.setVerticalAlignment(SwingConstants.TOP);
		lblInfo3.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo3.setForeground(Color.GRAY);
		lblInfo3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblInfo3.setBounds(236, 210, 176, 22);
		JanelaAgendamento.add(lblInfo3);
		
		JLabel lblInfo1 = new JLabel("Agende o momento da beleza do seu cliente!");
		lblInfo1.setVerticalAlignment(SwingConstants.TOP);
		lblInfo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo1.setForeground(Color.GRAY);
		lblInfo1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblInfo1.setBounds(193, 11, 300, 22);
		JanelaAgendamento.add(lblInfo1);
		
		JCheckBox chckbxUnhasAgendamento = new JCheckBox("Unhas");
		chckbxUnhasAgendamento.setForeground(Color.GRAY);
		chckbxUnhasAgendamento.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxUnhasAgendamento.setBackground(Color.WHITE);
		chckbxUnhasAgendamento.setBounds(22, 253, 61, 23);
		JanelaAgendamento.add(chckbxUnhasAgendamento);
		
		JCheckBox chckbxdesignDesobrancelhas = new JCheckBox("<html>Design de <br>Sobrancelhas</html>");
		chckbxdesignDesobrancelhas.setForeground(Color.GRAY);
		chckbxdesignDesobrancelhas.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxdesignDesobrancelhas.setBackground(Color.WHITE);
		chckbxdesignDesobrancelhas.setBounds(22, 290, 100, 36);
		JanelaAgendamento.add(chckbxdesignDesobrancelhas);
		
		JLabel lblImgUnhasAgendamento = new JLabel("");
		lblImgUnhasAgendamento.setIcon(new ImageIcon(TelaAgenda.class.getResource("/unhas.png")));
		lblImgUnhasAgendamento.setBounds(129, 246, 61, 30);
		JanelaAgendamento.add(lblImgUnhasAgendamento);
		
		JLabel lblImgSobrancelhaAgendamento = new JLabel("");
		lblImgSobrancelhaAgendamento.setIcon(new ImageIcon(TelaAgenda.class.getResource("/sobrancelha.png")));
		lblImgSobrancelhaAgendamento.setBounds(136, 291, 54, 35);
		JanelaAgendamento.add(lblImgSobrancelhaAgendamento);
		
		JCheckBox chckbxcabeloCorteprocedimentos = new JCheckBox("<html>Cabelo Corte/<br>Procedimentos</html>");
		chckbxcabeloCorteprocedimentos.setForeground(Color.GRAY);
		chckbxcabeloCorteprocedimentos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxcabeloCorteprocedimentos.setBackground(Color.WHITE);
		chckbxcabeloCorteprocedimentos.setBounds(244, 246, 105, 33);
		JanelaAgendamento.add(chckbxcabeloCorteprocedimentos);
		
		JCheckBox chckbxesteticaFacialcorporal = new JCheckBox("<html>Est\u00E9tica Facial/<br>Corporal</html>");
		chckbxesteticaFacialcorporal.setForeground(Color.GRAY);
		chckbxesteticaFacialcorporal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxesteticaFacialcorporal.setBackground(Color.WHITE);
		chckbxesteticaFacialcorporal.setBounds(244, 289, 105, 37);
		JanelaAgendamento.add(chckbxesteticaFacialcorporal);
		
		JLabel lblImgCabeloAgendamento = new JLabel("");
		lblImgCabeloAgendamento.setIcon(new ImageIcon(TelaAgenda.class.getResource("/cabelo.png")));
		lblImgCabeloAgendamento.setBounds(366, 246, 46, 35);
		JanelaAgendamento.add(lblImgCabeloAgendamento);
		
		JLabel lblImgEsteticaAgendamento = new JLabel("");
		lblImgEsteticaAgendamento.setIcon(new ImageIcon(TelaAgenda.class.getResource("/estetica2.png")));
		lblImgEsteticaAgendamento.setBounds(366, 296, 46, 30);
		JanelaAgendamento.add(lblImgEsteticaAgendamento);
		
		JCheckBox chckbxMaquiagemAgendamento = new JCheckBox("Maquiagem");
		chckbxMaquiagemAgendamento.setForeground(Color.GRAY);
		chckbxMaquiagemAgendamento.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxMaquiagemAgendamento.setBackground(Color.WHITE);
		chckbxMaquiagemAgendamento.setBounds(471, 253, 90, 23);
		JanelaAgendamento.add(chckbxMaquiagemAgendamento);
		
		JCheckBox chckbxdiaDanoiva = new JCheckBox("Dia da Noiva");
		chckbxdiaDanoiva.setForeground(Color.GRAY);
		chckbxdiaDanoiva.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxdiaDanoiva.setBackground(Color.WHITE);
		chckbxdiaDanoiva.setBounds(471, 302, 100, 23);
		JanelaAgendamento.add(chckbxdiaDanoiva);
		
		JLabel lblImgMaquiagemAgendamento = new JLabel("");
		lblImgMaquiagemAgendamento.setIcon(new ImageIcon(TelaAgenda.class.getResource("/maquiagem.png")));
		lblImgMaquiagemAgendamento.setBounds(594, 246, 57, 30);
		JanelaAgendamento.add(lblImgMaquiagemAgendamento);
		
		JLabel lblImgNoivaAgendamento = new JLabel("");
		lblImgNoivaAgendamento.setIcon(new ImageIcon(TelaAgenda.class.getResource("/noiva.png")));
		lblImgNoivaAgendamento.setBounds(594, 295, 56, 31);
		JanelaAgendamento.add(lblImgNoivaAgendamento);
		
		JLabel lblInfo4 = new JLabel("<html><body style='text-align: justify;'>Por favor, descreva abaixo os servi\u00E7os que deseja realizar no sal\u00E3o, para que possamos atend\u00EA-lo da melhor forma poss\u00EDvel.</body></html>");
		lblInfo4.setForeground(Color.GRAY);
		lblInfo4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblInfo4.setBounds(22, 337, 640, 35);
		JanelaAgendamento.add(lblInfo4);
		
		JTextArea txtAreaDescricaoAgendamento = new JTextArea();
		txtAreaDescricaoAgendamento.setForeground(Color.BLACK);
		txtAreaDescricaoAgendamento.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAreaDescricaoAgendamento.setBackground(SystemColor.control);
		txtAreaDescricaoAgendamento.setBounds(22, 383, 406, 79);
		JanelaAgendamento.add(txtAreaDescricaoAgendamento);
		
		JButton btnConfirmarAgendamento = new JButton("Confirmar");
		btnConfirmarAgendamento.setForeground(new Color(0, 139, 139));
		btnConfirmarAgendamento.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnConfirmarAgendamento.setBackground(new Color(152, 251, 152));
		btnConfirmarAgendamento.setBounds(481, 400, 138, 35);
		JanelaAgendamento.add(btnConfirmarAgendamento);
		
		JLabel lblAtendente = new JLabel("Atendente:");
		lblAtendente.setForeground(Color.GRAY);
		lblAtendente.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAtendente.setBounds(22, 173, 76, 22);
		JanelaAgendamento.add(lblAtendente);		
			
	}
}
