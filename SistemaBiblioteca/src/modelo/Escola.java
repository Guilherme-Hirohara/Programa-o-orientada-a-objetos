
package modelo;


public abstract class Escola {
    private String cpf; 
    private String nome; 
    private String dataNascimento; 
    private String endereco; 
    private String prontuario; 

    public Escola() {
    }

    public Escola(String cpf, String nome, String dataNascimento, String endereco, String prontuario) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.prontuario = prontuario; 
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public String getProntuario(){
        return prontuario;
    }
    
    public void setProntuario(String prontuario){
        this.prontuario = prontuario; 
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
