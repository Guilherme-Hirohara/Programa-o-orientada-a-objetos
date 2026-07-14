
package modelo;


public class Professor extends Escola{
    
    private Double salario; 
    private String especialidade; 

    public Professor() {
    }

    public Professor(Double salario, String especialidade, String nome, String cpf, String prontuario, String dataNascimento, String endereco) {
        super(cpf, nome, dataNascimento, endereco, prontuario); 
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
    
    
    
}
