package ViewAgenda;

import java.util.List;

public class RelatorioAgendamento extends Relatorio {
    
    @Override
    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        List<Agendamentos> listaAgendamentos = Agendamentos.getListaAgendamentos();

        for (Agendamentos agendamentos : listaAgendamentos) {
            relatorio.append(agendamentos.toString()).append("\n");
        }     
        return relatorio.toString();
    }
}