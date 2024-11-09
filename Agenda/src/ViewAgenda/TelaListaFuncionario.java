package ViewAgenda;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaListaFuncionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel JanelaListaFuncionario;
	private JTable tabelaFuncionario;

	public TelaListaFuncionario() {
		setTitle("Lista de Funcionário");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 530);
		JanelaListaFuncionario = new JPanel();
		JanelaListaFuncionario.setBorder(new EmptyBorder(5, 5, 5, 5));
		JanelaListaFuncionario.setLayout(new BorderLayout(0, 0));
		setContentPane(JanelaListaFuncionario);

		// tabela
		tabelaFuncionario = new JTable();
		DefaultTableModel modeloTabela = new DefaultTableModel(
			new Object[][] {},
			new String[] {"Nome", "Telefone", "Data Nascimento", "Endereço", "Bairro", "Cidade", "Cargo", "Salário"}
		);
		tabelaFuncionario.setModel(modeloTabela);
		tabelaFuncionario.setFillsViewportHeight(true);
		
		tabelaFuncionario.getColumnModel().getColumn(0).setPreferredWidth(500); // Nome
		tabelaFuncionario.getColumnModel().getColumn(1).setPreferredWidth(400); // Telefone
		tabelaFuncionario.getColumnModel().getColumn(2).setPreferredWidth(400); // Data Nascimento
		tabelaFuncionario.getColumnModel().getColumn(3).setPreferredWidth(500); // Endereço
		tabelaFuncionario.getColumnModel().getColumn(4).setPreferredWidth(400); // Bairro
		tabelaFuncionario.getColumnModel().getColumn(5).setPreferredWidth(400); // Cidade
		tabelaFuncionario.getColumnModel().getColumn(6).setPreferredWidth(400); // Cargo
		tabelaFuncionario.getColumnModel().getColumn(7).setPreferredWidth(400); // Salário
		
		
		popularTabela();
		
		// Centralizar 
		DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
		centralizado.setHorizontalAlignment(SwingConstants.CENTER);

		for (int i = 0; i < tabelaFuncionario.getColumnCount(); i++) {
			tabelaFuncionario.getColumnModel().getColumn(i).setCellRenderer(centralizado);
		}

		JScrollPane scrollPane = new JScrollPane(tabelaFuncionario);
		JanelaListaFuncionario.add(scrollPane, BorderLayout.CENTER);
	
	// btnExcluir
		JButton btnExcluir = new JButton("Excluir Funcionário");
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirCliente();
            }
        });
        JanelaListaFuncionario.add(btnExcluir, BorderLayout.SOUTH);
    }

	private void popularTabela() {
		DefaultTableModel modeloTabela = (DefaultTableModel) tabelaFuncionario.getModel();
		modeloTabela.setRowCount(0);

		List<Funcionario> listaFuncionarios = Funcionario.getListaFuncionarios();
		for (Funcionario funcionario : listaFuncionarios) {
			modeloTabela.addRow(new Object[]{
				funcionario.getNome(),
				funcionario.getTelefone(),
				funcionario.getDataNascimento(),
				funcionario.getEndereco(),
				funcionario.getBairro(),
				funcionario.getCidade(),
				funcionario.getCargo(),
				funcionario.getSalario()
				
			});
		}
	}
	// excluirCliente
	private void excluirCliente() {
        int linhaSelecionada = tabelaFuncionario.getSelectedRow();
        if (linhaSelecionada != -1) { 

            Funcionario FuncionarioParaExcluir = Funcionario.getListaFuncionarios().get(linhaSelecionada);
            Funcionario.removerFuncionario(FuncionarioParaExcluir); 

            DefaultTableModel modeloTabela = (DefaultTableModel) tabelaFuncionario.getModel();
            modeloTabela.removeRow(linhaSelecionada);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um Funcionário para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
