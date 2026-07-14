
package view;

import control.ControleCliente;
import control.ControleProduto;
import control.ControleVenda;
import java.util.Date;
import java.util.Scanner;
import model.Cliente;
import model.ItemVenda;
import model.Produto;
import model.Venda;

public class VisaoVenda {
    ControleVenda controleVenda = new ControleVenda(); 
    ControleProduto controleProduto = new ControleProduto();
    ControleCliente controleCliente = new ControleCliente(); 
    
    public void adicionarVenda(){
        ItemVenda itemVenda = new ItemVenda(); 
        Venda venda = new Venda(); 
        Cliente cliente; 
        Date date = new Date(); 
        int codigoBarra; 
        String cpf; 
        Produto produto; 
        Scanner ler = new Scanner(System.in); 
        
        try{
            System.out.print("Digite o codigo de barra do produto que gostaria de comprar:");
            codigoBarra = ler.nextInt(); 
            produto = controleProduto.pesquisarProduto(codigoBarra);
            if(produto != null){
                itemVenda.setProduto(produto);
                System.out.print("Digite a quantidade de produto:");
                itemVenda.setQuantidade(ler.nextInt());
                System.out.print("Digite o valor unitario do produto:");
                itemVenda.setValorUnitario(ler.nextDouble());
                System.out.println("Digite o cpf do cliente:");
                cpf = ler.nextLine(); 
                cliente = controleCliente.pesquisarCliente(cpf); 
                if(cliente != null){
                    System.out.print("Digite a forma de pagamento:");
                    venda.setFormaPagto(ler.nextLine());
                    venda.setDate(date);
                    venda.setTotal(itemVenda.getValorTotal());
                    venda.setItemVenda(itemVenda);
                    venda.setCliente(cliente);
                }
                
            }
        }catch(Exception e){
         e.getMessage(); 
        }
    }
    
    public void excluirVenda(){
        Scanner ler = new Scanner(System.in); 
        String cpf;
        Venda venda; 
        System.out.print("Digite o cpf do cliente:");
        cpf = ler.nextLine(); 
        venda = controleVenda.pesquisarClienteProduto(cpf); 
        if(venda!=null){
            controleVenda.deletarVenda(venda);
        }
    }
    
    public void apresentarTodasVendas(){
        for(Venda v: controleVenda.getVenda()){
             v.toString(); 
             for(ItemVenda i: v.getItemVenda()){
                 i.toString(); 
             }        
        }
    }
    
    public void apresentarVendaCliente(){
        String cpf; 
        Venda venda; 
        Scanner ler = new Scanner(System.in); 
        System.out.print("Digite o cpf do cliente que godtaria de apresentar as vendas:");
        cpf = ler.nextLine(); 
        venda = controleVenda.pesquisarClienteProduto(cpf); 
        if(venda!=null){
            for(ItemVenda i: venda.getItemVenda())
                i.toString(); 
            venda.toString(); 
        }
    }
    
    
    
    
    
}
