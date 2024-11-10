package ViewAgenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TelaListaAgendamentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel JanelaAgendamentos;
	private JTable tabelaAgendamentos;

	public TelaListaAgendamentos() {
		setTitle("Lista de Agendamentos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 530);
		JanelaAgendamentos = new JPanel();
		JanelaAgendamentos.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JanelaAgendamentos);
		
				// tabela
				tabelaAgendamentos = new JTable();
				tabelaAgendamentos.setBounds(1, 26, 1182, 431);
				JanelaAgendamentos.add(tabelaAgendamentos);
				DefaultTableModel modeloTabela = new DefaultTableModel(
					new Object[][] {},
					new String[] {"Cliente", "Data do Agend.", "Horário", "Forma de Pag.", "Atendente", "Unhas", "Cabelo","Maquiagem","Design","Estética","Dia da Noiva","Descrição"}
				);
				tabelaAgendamentos.setModel(modeloTabela);
				tabelaAgendamentos.setFillsViewportHeight(true);
				
				tabelaAgendamentos.getColumnModel().getColumn(0).setPreferredWidth(500); // Cliente
				tabelaAgendamentos.getColumnModel().getColumn(1).setPreferredWidth(400); // Data do Agendamento
				tabelaAgendamentos.getColumnModel().getColumn(2).setPreferredWidth(400); // Horário
				tabelaAgendamentos.getColumnModel().getColumn(3).setPreferredWidth(400); // Forma de Pagamento
				tabelaAgendamentos.getColumnModel().getColumn(4).setPreferredWidth(500); // Atendente
				tabelaAgendamentos.getColumnModel().getColumn(5).setPreferredWidth(400); // Unhas
				tabelaAgendamentos.getColumnModel().getColumn(6).setPreferredWidth(400); // Cabelo
				tabelaAgendamentos.getColumnModel().getColumn(7).setPreferredWidth(400); // Maquiagem
				tabelaAgendamentos.getColumnModel().getColumn(8).setPreferredWidth(400); // Design
				tabelaAgendamentos.getColumnModel().getColumn(9).setPreferredWidth(400); // Estética
				tabelaAgendamentos.getColumnModel().getColumn(10).setPreferredWidth(400); // Dia da noiva
				tabelaAgendamentos.getColumnModel().getColumn(11).setPreferredWidth(1000); // Descrição
				
				popularTabela();
				
				// Centralizar
				DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
				centralizado.setHorizontalAlignment(SwingConstants.CENTER);

				for (int i = 0; i < tabelaAgendamentos.getColumnCount(); i++) {
					tabelaAgendamentos.getColumnModel().getColumn(i).setCellRenderer(centralizado);
				}
				JanelaAgendamentos.setLayout(null);

				JScrollPane scrollPane = new JScrollPane(tabelaAgendamentos);
				scrollPane.setBounds(0, 0, 1184, 500);
				JanelaAgendamentos.add(scrollPane);
				
				tabelaAgendamentos.setRowHeight(50);
				
			// btnExcluir
				JButton btnExcluir = new JButton("Excluir Cliente");
				btnExcluir.setBounds(0, 465, 1182, 23);
		        btnExcluir.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                excluirAgendamento();
		            }
		        });
		        JanelaAgendamentos.add(btnExcluir);
		    }

			private void popularTabela() {
				DefaultTableModel modeloTabela = (DefaultTableModel) tabelaAgendamentos.getModel();
				modeloTabela.setRowCount(0);

				List<Agendamentos> listaAgendamentos = Agendamentos.getListaAgendamentos();
				for (Agendamentos agendamentos : listaAgendamentos) {
					modeloTabela.addRow(new Object[]{
						agendamentos.getCliente(),
						agendamentos.getDataAgendamento(),
						agendamentos.getHorario(),
						agendamentos.getFormaPagamento(),
						agendamentos.getAtendente(),
						agendamentos.getServicoUnhas(),
						agendamentos.getServicoCabelo(),
						agendamentos.getServicoMaquiagem(),
						agendamentos.getServicoDesign(),
						agendamentos.getServicoEstetica(),
						agendamentos.getServicoDiaNoiva(),
						agendamentos.getDescricao()
					});
				}
			}
			
			//excluirAgendamento
			private void excluirAgendamento() {
		        int linhaSelecionada = tabelaAgendamentos.getSelectedRow();
		        if (linhaSelecionada != -1) { 
		            
		            Agendamentos agendamentoParaExcluir = Agendamentos.getListaAgendamentos().get(linhaSelecionada);
		            Agendamentos.removerAgendamentos(agendamentoParaExcluir); 

		            DefaultTableModel modeloTabela = (DefaultTableModel) tabelaAgendamentos.getModel();
		            modeloTabela.removeRow(linhaSelecionada);
		        } else {
		            JOptionPane.showMessageDialog(this, "Por favor, selecione um agendamento para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
		        }
		    }
			
			
		}