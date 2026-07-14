/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import modelo.Escola;
import modelo.Professor;

/**
 *
 * @author User
 */
public class ControleProfessor extends ControleEscola{
    
    
    public void inserirProfessor(Professor professor){
        super.inserirPessoa(professor);
    }
    
    public void excluirProfessor(Professor professor){
        super.excluirPessoa(professor);
    }
    
    public Professor pesquisarProfessor(String prontuario){
        for(Escola e: super.getEscola()){
            if(e instanceof Professor){
               if(e.getProntuario().equals(prontuario))
                   return (Professor) e; 
            }
        }
        return null; 
    }
    
}
