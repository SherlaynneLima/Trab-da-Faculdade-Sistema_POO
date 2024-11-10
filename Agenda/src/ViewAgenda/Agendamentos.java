package ViewAgenda;

import java.util.ArrayList;
import java.util.List;

public class Agendamentos {
	private String cliente;
    private String dataAgendamento;
    private String horario;
    private String formaPagamento;
    private String atendente;
    private String servicoUnhas;
    private String servicoCabelo;
    private String servicoMaquiagem;
    private String servicoDesign;
    private String servicoEstetica;
    private String servicoDiaNoiva;
    private String descricao;
    
    private static List<Agendamentos> listaAgendamentos = new ArrayList<>();
    
    public Agendamentos(String cliente, String dataAgendamento, String horario, String formaPagamento, String atendente, String servicoUnhas, String servicoCabelo, String servicoMaquiagem, String servicoDesign, String servicoEstetica, String servicoDiaNoiva, String descricao) {
        this.cliente = cliente;
        this.dataAgendamento = dataAgendamento;
        this.horario = horario;
        this.formaPagamento = formaPagamento;
        this.atendente = atendente;
        this.servicoUnhas = servicoUnhas;
        this.servicoCabelo = servicoCabelo;
        this.servicoMaquiagem = servicoMaquiagem;
        this.servicoDesign = servicoDesign;
        this.servicoEstetica = servicoEstetica;
        this.servicoDiaNoiva = servicoDiaNoiva;
        this.descricao = descricao;
    }
    
    public static void adicionarAgendamentos(Agendamentos agendamentos) {
        listaAgendamentos.add(agendamentos);
    }
    
    public static List<Agendamentos> getListaAgendamentos() {
        return listaAgendamentos;
    }
    
    public static void removerAgendamentos(Agendamentos agendamentos) {
        listaAgendamentos.remove(agendamentos);
    }
    
    public String getCliente() {
        return cliente;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public String getHorario() {
        return horario;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public String getAtendente() {
        return atendente;
    }

    public String getServicoUnhas() {
        return servicoUnhas;
    }
    
    public String getServicoCabelo() {
        return servicoCabelo;
    }
    
    public String getServicoMaquiagem() {
        return servicoMaquiagem;
    }
    
    public String getServicoDesign() {
        return servicoDesign;
    }
    
    public String getServicoEstetica() {
        return servicoEstetica;
    }
    
    public String getServicoDiaNoiva() {
        return servicoDiaNoiva;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    
    @Override
    public String toString() {
        return "Cliente: " + this.cliente + " | Data do Agendamento: " + this.dataAgendamento + " | Horário do Agendamento: " + this.horario +
                " | Forma de Pagamento: " + this.formaPagamento + " | Atendente: " + this.atendente + " | Serviço descrição: " + this.descricao;
    }
}

