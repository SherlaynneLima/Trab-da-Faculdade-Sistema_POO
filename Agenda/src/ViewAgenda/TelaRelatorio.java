package ViewAgenda;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaRelatorio extends JFrame {
	private static final long serialVersionUID = 1L;
    private JTextArea textAreaRelatorio;
    
    public TelaRelatorio() {
    	setBackground(Color.WHITE);
        setTitle("Relatório de Agendamentos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1120, 530);
        getContentPane().setLayout(null);
        
        textAreaRelatorio = new JTextArea();
        textAreaRelatorio.setBackground(new Color(245, 245, 245));
        textAreaRelatorio.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaRelatorio);
        scrollPane.setBounds(0, 0, 1100, 491);
        getContentPane().add(scrollPane);
        
        JLabel lblInfo = new JLabel("Relat\u00F3rios");
        lblInfo.setBackground(new Color(211, 211, 211));
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
        lblInfo.setFont(new Font("Tahoma", Font.BOLD, 16));
        scrollPane.setColumnHeaderView(lblInfo);

        exibirRelatorio();
    }

    private void exibirRelatorio() {
        //instanciando
        Relatorio relatorioCliente = new RelatorioCliente();
        Relatorio relatorioFuncionario = new RelatorioFuncionario();
        Relatorio relatorioAgendamento = new RelatorioAgendamento();

        String relatorioCompleto = "\n\n Clientes do salão de beleza:\n\n" + relatorioCliente.gerarRelatorio() 
            + "\n\n Funcionários do salão de beleza:\n\n" + relatorioFuncionario.gerarRelatorio() + "\n\n Agendamentos do salão de beleza:\n\n" + relatorioAgendamento.gerarRelatorio();

        textAreaRelatorio.setText(relatorioCompleto);
    }
}
