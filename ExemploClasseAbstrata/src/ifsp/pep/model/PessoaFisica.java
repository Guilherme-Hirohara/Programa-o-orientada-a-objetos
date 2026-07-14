/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp.pep.model;

/**
 *
 * @author Aluno
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private String rg;

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String rg, String nome, int idade) {
        super(nome, idade);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nPessoaFisica{" + "cpf=" + cpf + 
                ", rg=" + rg + '}';
    }    
    
    @Override
    public void exibir(){
        System.out.println("Exibir PF");
    }
    
    @Override
    public double calcularPagamento(){
        return 10;
    }
    
}
