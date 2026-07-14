
package control;

import java.util.ArrayList;
import model.Produto;

public class ControleProduto {
   static ArrayList<Produto> produtos = new ArrayList<>(); 
    
    public void addProduto(Produto produto){
        produtos.add(produto); 
    }
    
    public boolean removeProduto(Produto produto){
        return produtos.remove(produto); 
    }
    
    public ArrayList<Produto> getProduto(){
        return produtos; 
    }
    
    public Produto pesquisarProduto(int codigoBarra){
        for(Produto p: produtos){
            if(codigoBarra == p.getCodigoBarra())
                return p; 
        }
        return null; 
    }
    
    public boolean validarProduto(int codigoBarra){
        for(Produto p: produtos){
            if(codigoBarra == p.getCodigoBarra())
                return true; 
        }
        return false;
    }
}
