package ViewAgenda;

import java.util.List;

public class RelatorioFuncionario extends Relatorio {
    
    @Override
    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        List<Funcionario> listaFuncionarios = Funcionario.getListaFuncionarios();

        for (Funcionario funcionario : listaFuncionarios) {
            relatorio.append(funcionario.toString()).append("\n");
        }     
        return relatorio.toString();
    }
}
