/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsp.pep.model;

/**
 *
 * @author Aluno
 */
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    private String inscricao;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String inscricao, String nome, int idade) {
        super(nome, idade);
        this.cnpj = cnpj;
        this.inscricao = inscricao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nPessoaJuridica{" + "cnpj=" + cnpj + 
                ", inscricao=" + inscricao + '}';
    }
    
    @Override
    public void exibir(){
        System.out.println("Exibir PJ");
    }
    
    @Override
    public double calcularPagamento(){
        return 20;
    } 
    
    
}
