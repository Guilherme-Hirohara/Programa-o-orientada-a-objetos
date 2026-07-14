package controle;

import java.util.ArrayList;
import modelo.Escola;

public abstract class ControleEscola{
    
    private static ArrayList<Escola> escola = new ArrayList<>(); 

    public void inserirPessoa(Escola pessoa){
        escola.add(pessoa); 
    }
    
    public ArrayList<Escola> getEscola(){
        return escola; 
    }
    
    public void excluirPessoa(Escola pessoa){
        escola.remove(pessoa); 
    }
    
}
