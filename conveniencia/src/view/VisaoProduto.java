/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import control.ControleProduto;
import java.util.Scanner;
import model.Produto;

/**
 *
 * @author User
 */
public class VisaoProduto {
    ControleProduto controleProduto = new ControleProduto(); 
    
    public void incluirProduto(){
        Produto produto = new Produto();
        Scanner ler = new Scanner(System.in); 
        
        try{
            System.out.print("Digite o nome do produto:");
            produto.setNome(ler.nextLine());
            System.out.print("Digite seu codigo de barra:");
            produto.setCodigoBarra(ler.nextInt());
            System.out.print("Digite seu valor:");
            produto.setPreco(ler.nextDouble());
        }catch(NullPointerException e){
            System.out.println("ERRO - VALOR INVALIDO\n");
        }
        catch(Exception e){
            e.getMessage(); 
        }
        controleProduto.addProduto(produto);
    }
    
    public void excluirProduto(){
        int codigoBarra; 
        Scanner ler = new Scanner(System.in); 
        try{
            System.out.print("Digite o codigo de barra do produto que deseja excluir:");
            codigoBarra = ler.nextInt(); 
            for(Produto p: controleProduto.getProduto()){
                if(codigoBarra == p.getCodigoBarra())
                    controleProduto.removeProduto(p); 
            }
        }catch(Exception e){
            e.getMessage(); 
        }
    }
    
    public void pesquisarProduto(){
        int codigoBarra; 
        Scanner ler = new Scanner(System.in); 
        
        try{
            System.out.print("Digite o codigo de barra do produto que deseja encontrar:");
            codigoBarra= ler.nextInt(); 
            for(Produto p: controleProduto.getProduto()){
                if(codigoBarra == p.getCodigoBarra())
                    p.toString(); 
            }
        }catch(Exception e){
            e.getMessage(); 
        }
    }
    
    public void apresentarProduto(){
        for(Produto p: controleProduto.getProduto()){
            p.toString(); 
        }
    }
    
    public static int validarCodigoBarra(int codigoBarra) throws Exception{
        if(codigoBarra<0){
            throw new Exception("ERRO - VALOR NEGATIVO\n"); 
        }
        else{
            return codigoBarra; 
        }
    }
}
