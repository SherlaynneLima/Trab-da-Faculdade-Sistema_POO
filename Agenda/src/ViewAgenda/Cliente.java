package ViewAgenda;

import java.util.ArrayList;
import java.util.List;
import Interfaces.Pessoa;

public class Cliente implements Pessoa{
	private String nome;
    private String telefone;
    private String dataNascimento;
    private String endereco;
    private String bairro;
    private String cidade;
    
    private static List<Cliente> listaClientes = new ArrayList<>();
    
    public Cliente(String nome, String telefone, String dataNascimento, String endereco, String bairro, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    
    public static void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    
    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public static void removerCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public String getBairro() {
        return bairro;
    }

    @Override
    public String getCidade() {
        return cidade;
    }

    @Override
    public String getDataNascimento() {
        return dataNascimento;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Telefone: " + this.telefone + " | Data Nascimento: " + this.dataNascimento +
                " | Endereço: " + this.endereco + " | Bairro: " + this.bairro + " | Cidade: " + this.cidade;
    }
}
