/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import control.ControleCliente;
import java.util.Scanner;
import model.Cliente;

/**
 *
 * @author User
 */
public class VisaoCliente {
    ControleCliente controleCliente = new ControleCliente(); 
    
    public void inserir_cliente(){
        Cliente cliente = new Cliente(); 
        String leitura; 
        Scanner ler = new Scanner(System.in); 
        
        try{
            System.out.print("Digite o seu nome:");
            cliente.setNome(ler.nextLine());
            System.out.print("Digite seu cpf:");
            cliente.setCpf(ler.nextLine());
        }catch(NullPointerException e){
            System.out.println("ERRO - VALOR INVALIDO\n");
        }
        controleCliente.addCliente(cliente);
    }
    
    public void pesquisar_cliente(){
        String cpf; 
        Scanner ler = new Scanner (System.in); 
        try{
            System.out.print("Digite o cpf do cliente que gostaria de encontrar:");
            cpf = ler.nextLine(); 
            for(Cliente c: controleCliente.getCliente()){
                if(cpf.equals(c.getCpf())){
                    c.toString(); 
                }
            }
        }catch(NullPointerException e){
            System.out.println("ERRO - VALOR INVALIDO\n");
        }
    }
    
    public void excluir_cliente(){
        String cpf; 
        Scanner ler = new Scanner(System.in); 
        try{
            System.out.print("Digite o cpf do cliente que gostaria de excluir:");
            cpf = ler.nextLine(); 
            for(Cliente c: controleCliente.getCliente()){
                if(cpf.equals(c.getCpf()))
                    controleCliente.removeCliente(c); 
            }
        }catch(NullPointerException e){
            System.out.println("ERRO - VALOR INVALIDO\n");
        }
    }
    
    public void apresentarCliente(){
        for(Cliente c: controleCliente.getCliente()){
            c.toString(); 
        }
    }
}