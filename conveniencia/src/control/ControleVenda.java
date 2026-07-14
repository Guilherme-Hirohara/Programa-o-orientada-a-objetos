
package control;

import java.util.ArrayList;
import model.Cliente;
import model.ItemVenda;
import model.Venda;


public class ControleVenda {
        static ArrayList<Venda> vendas = new ArrayList<>();   
        
        public ArrayList<Venda> getVenda(){
            return vendas; 
        }
        
        public void addVenda(Venda v){
           vendas.add(v); 
        } 
        
        public void deletarVenda(Venda v){
            vendas.remove(v); 
        }
        
        public Venda pesquisarClienteProduto(String cpf){ 
            for(Venda v: vendas){ 
                if(v.getCliente().getCpf().equalsIgnoreCase(cpf))
                    return v; 
            }
            return null; 
        }
        
    
        public Double valorTotalVendaUmProduto(int codigoBarra){
            for(Venda v: vendas){
                for(ItemVenda i: v.getItemVenda()){
                    if(i.getProduto().getCodigoBarra().equals(codigoBarra))
                        return v.getTotal(); 
                }
            }
            return 0.0; 
        }
        
        public Double getTotal(){
            Double total = 0.0; 
            for(Venda v: vendas){
                for(ItemVenda i: v.getItemVenda()){
                    total += i.getValorTotal(); 
                }
            }
            return total; 
        }
        public Double valorTotalVendaCliente(Cliente cliente){
            for(Venda v: vendas){
                if(v.getCliente().equals(cliente)){
                   return v.getTotal(); 
                }
            }
            return 0.0; 
        }
        
        public Venda pesquisarProdutoVenda(int codigoBarra){
            for(Venda v:vendas){
                for(ItemVenda i: v.getItemVenda()){
                    if(i.getProduto().getCodigoBarra() == codigoBarra){
                        return v; 
                    }
                }
            }
            return null; 
        }
        
        
        
        
}
