
package visao;

import controle.ControleAluno;
import java.util.Scanner;
import modelo.Aluno;
import modelo.Escola;


public class VisaoAluno {
    
    ControleAluno controleAluno = new ControleAluno(); 
    
  
    
    public void inserirAluno(){
        Aluno aluno = new Aluno(); 
        Scanner ler = new Scanner(System.in); 
        boolean continuar = true;
        do{
        try{
            System.out.print("Digite o nome do aluno:");
            aluno.setNome(verificarString(ler.nextLine()));
            System.out.print("Digite o cpf do aluno:");
            aluno.setCpf(verificarString(ler.nextLine())); 
            System.out.print("Digite o seu endereco:");
            aluno.setEndereco(verificarString(ler.nextLine()));
            System.out.print("Digite sua data de nascimento:");
            aluno.setDataNascimento(verificarString(ler.nextLine()));
            System.out.print("Digite o curso do aluno:");
            aluno.setCurso(verificarString(ler.nextLine())); 
            aluno.setNota1(0.0); 
            aluno.setNota2(0.0);
            continuar = false; 
        }catch(Exception e){
            e.getMessage();
        }
        }while(continuar); 
    } 
    
    public void excluirAluno(){
        String prontuario = new String(); 
        boolean continuar=true; 
        Scanner ler = new Scanner(System.in); 
        do{
        try{
            System.out.print("Digite o prontuario do aluno que deseja excluir:");
            prontuario = verificarString(ler.nextLine());
            continuar = false; 
        }catch(Exception e){
            e.getMessage(); 
        }
        }while(continuar); 
        
        for(Escola e: controleAluno.getEscola()){
            if(e instanceof Aluno){
                if(prontuario.equals(e.getProntuario()))
                    controleAluno.excluirAluno((Aluno) e);
            }
        }
    }
    
    public void mostrarAluno(){
        
    }
    
    public void inserirNota1(){
        
    }
    public static String verificarString(String string) throws Exception{
        if(string.isEmpty())
            throw new Exception("ERRO - NENHUM DIGITO FOI COLOCADO...\n"); 
        else
            return string; 
    }

    
}
