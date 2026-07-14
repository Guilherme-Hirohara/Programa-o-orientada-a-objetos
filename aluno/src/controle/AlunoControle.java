
package controle;

import modelo.Aluno;


public class AlunoControle {
    Aluno[] aluno = new Aluno[20];
    Integer tamanhoVetor = -1; 
    public int getTamanhoVetor()
    {
        return tamanhoVetor; 
    }
    
    public void adicionarAluno(Aluno a1)
    { 
        tamanhoVetor++; 
        aluno[tamanhoVetor] = a1; 
    }
    
    public void excluirAluno(int posicao)
    {
        for(int i=posicao; i<tamanhoVetor; i++)
        {
            aluno[i] = aluno[i+1]; 
        }
        tamanhoVetor--;
        System.out.println("Aluno excluido: " + aluno[posicao].getNome());
    }
    
    public int procurarAluno(String prontuario)
    {
        int i=0;
        int posicao = -1; 
        while(!aluno[i].getProntuario().equals(prontuario)||i<=tamanhoVetor)
        {
            if(aluno[i].getProntuario().equals(prontuario))
                posicao = i; 
            i++; 
        }
        return posicao; 
    }
    
    public boolean alunoAprovadoNota(int posicao)
    {
      if(aluno[posicao].getMedia()>=6)
      {
       return true;
      }
      else
      {
      return false;           
      }
    }
    
    public boolean alunoAprovadoFrequencia(int posicao)
    {
        if(aluno[posicao].getFrequencia()>=75)
        {
            return true; 
        }
        else
            return false; 
    }
    
    public void alterarDadosAluno(String prontuario)
    {
        System.out.println("\n---------------DIGITE OS DADOS---------------");
        System.out.println("");
    }
    
    
}
