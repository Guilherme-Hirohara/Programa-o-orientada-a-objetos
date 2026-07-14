/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Aluno extends Escola{
    private String curso; 
    private Double nota1; 
    private Double nota2; 

    public Aluno() {
    }

    public Aluno(String curso, Double nota1, Double nota2, String nome, String cpf, String prontuario, String dataNascimento, String endereco) {
        super(cpf, nome, dataNascimento, endereco, prontuario);
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

        
    public String getCurso() {
        return curso;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    
    @Override
    public String toString(){
        return "Nome:" + super.getNome() + "\nCPF:" + super.getCpf() + "\nProntuario:" + 
                super.getProntuario() + "\nData de nascimento:" + super.getDataNascimento()
    }
}
