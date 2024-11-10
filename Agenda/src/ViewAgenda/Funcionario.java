package ViewAgenda;

import java.util.ArrayList;
import java.util.List;
import Interfaces.Pessoa;

public class Funcionario extends Cliente implements Pessoa{
    private String cargo;
    private String salario;

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public Funcionario(String nome, String telefone, String dataNascimento, String endereco, String bairro, String cidade, String cargo, String salario) {
        super(nome, telefone, dataNascimento, endereco, bairro, cidade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public static void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static void removerFuncionario(Funcionario funcionario) {
        listaFuncionarios.remove(funcionario);
    }

    public String getCargo() {
        return cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + this.cargo + " | Salário: " + this.salario;
    }
}
