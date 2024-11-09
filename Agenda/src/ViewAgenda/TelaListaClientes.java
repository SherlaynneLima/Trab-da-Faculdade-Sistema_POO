package ViewAgenda;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaListaClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel JanelaListaClientes;
	private JTable tabelaClientes;

	public TelaListaClientes() {
		setTitle("Lista de Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 530);
		JanelaListaClientes = new JPanel();
		JanelaListaClientes.setBorder(new EmptyBorder(5, 5, 5, 5));
		JanelaListaClientes.setLayout(new BorderLayout(0, 0));
		setContentPane(JanelaListaClientes);

		// tabela
		tabelaClientes = new JTable();
		DefaultTableModel modeloTabela = new DefaultTableModel(
			new Object[][] {},
			new String[] {"Nome", "Telefone", "Data Nascimento", "Endereço", "Bairro", "Cidade"}
		);
		tabelaClientes.setModel(modeloTabela);
		tabelaClientes.setFillsViewportHeight(true);
		
		tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(500); // Nome
		tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(400); // Telefone
		tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(400); // Data Nascimento
		tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(500); // Endereço
		tabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(400); // Bairro
		tabelaClientes.getColumnModel().getColumn(5).setPreferredWidth(400); // Cidade
		
		popularTabela();
		
		// Centralizar
		DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
		centralizado.setHorizontalAlignment(SwingConstants.CENTER);

		for (int i = 0; i < tabelaClientes.getColumnCount(); i++) {
		    tabelaClientes.getColumnModel().getColumn(i).setCellRenderer(centralizado);
		}

		JScrollPane scrollPane = new JScrollPane(tabelaClientes);
		JanelaListaClientes.add(scrollPane, BorderLayout.CENTER);
	
	// btnExcluir
		JButton btnExcluir = new JButton("Excluir Cliente");
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirCliente();
            }
        });
        JanelaListaClientes.add(btnExcluir, BorderLayout.SOUTH);
    }

	private void popularTabela() {
		DefaultTableModel modeloTabela = (DefaultTableModel) tabelaClientes.getModel();
		modeloTabela.setRowCount(0);

		List<Cliente> listaClientes = Cliente.getListaClientes();
		for (Cliente cliente : listaClientes) {
			modeloTabela.addRow(new Object[]{
				cliente.getNome(),
				cliente.getTelefone(),
				cliente.getDataNascimento(),
				cliente.getEndereco(),
				cliente.getBairro(),
				cliente.getCidade()
			});
		}
	}
	
	//excluirCliente
	private void excluirCliente() {
        int linhaSelecionada = tabelaClientes.getSelectedRow();
        if (linhaSelecionada != -1) { 
            
            Cliente clienteParaExcluir = Cliente.getListaClientes().get(linhaSelecionada);
            Cliente.removerCliente(clienteParaExcluir); 

            DefaultTableModel modeloTabela = (DefaultTableModel) tabelaClientes.getModel();
            modeloTabela.removeRow(linhaSelecionada);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um cliente para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

