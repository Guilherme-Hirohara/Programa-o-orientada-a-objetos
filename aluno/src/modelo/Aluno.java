
package modelo;


public class Aluno {
    private String nome; 
    private String prontuario; 
    private Double notaProva; 
    private Double notaTrabalho; 
    private Double frequencia; 
    private String turma; 
    private boolean aprovacao; 
    
    public void Aluno(String novoNome, String novoProntuario, String novaTurma)
    {
       nome = novoNome; 
       prontuario = novoProntuario; 
       turma = novaTurma; 
       frequencia = 0.0; 
       notaProva = 0.0; 
       notaTrabalho = 0.0; 
       
    }
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setProntuario(String novoProntuario) {
       prontuario = novoProntuario;
    }

    public void setNotaProva(Double novaNotaProva) {
        notaProva = novaNotaProva;
    }

    public void setNotaTrabalho(Double novaNotaTrabalho) {
        notaTrabalho = novaNotaTrabalho;
    }

    public void setFrequencia(Double novaFrequencia) {
       frequencia = novaFrequencia;
    }

    public void setTurma(String novaTurma) {
        turma = novaTurma;
    }

    public void setAprovacao(boolean novaAprovacao)
    {
        aprovacao = novaAprovacao; 
    }
    public String getNome() {
        return nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public Double getNotaTrabalho() {
        return notaTrabalho;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public String getTurma() {
        return turma;
    }
    
    public Double getMedia(){
        return (notaProva+notaTrabalho)/2; 
    }
    
    public boolean getAprovacao()
    {
        return aprovacao; 
    }
    
}
