
package controle;

import modelo.Aluno;
import modelo.Escola;



public class ControleAluno extends ControleEscola{  
    
    
    public void inserirAluno(Aluno aluno){
       super.inserirPessoa(aluno);
    }
    
    public void excluirAluno(Aluno aluno){
        super.excluirPessoa(aluno);
    }
    
    public Aluno pesquisarAluno(String prontuario){
        for(Escola e: super.getEscola()){
            if(e instanceof Aluno)
                if(prontuario.equals(e.getProntuario()))
                    return (Aluno) e; 
        }
        return null; 
    }
    
}
