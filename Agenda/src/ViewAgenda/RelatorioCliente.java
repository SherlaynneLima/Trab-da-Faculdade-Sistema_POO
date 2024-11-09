package ViewAgenda;

import java.util.List;

public class RelatorioCliente extends Relatorio {
    
    @Override
    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        List<Cliente> listaClientes = Cliente.getListaClientes();

        for (Cliente cliente : listaClientes) {
            relatorio.append(cliente.toString()).append("\n");
        }
        
        return relatorio.toString();
    }
}
