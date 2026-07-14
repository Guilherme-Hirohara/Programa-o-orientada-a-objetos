
import java.util.Scanner;
import view.Visao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Principal {
    public static void main(String[] args) {
        int opcao; 
        Scanner ler = new Scanner(System.in); 
        Visao visao = new Visao(); 
        
        visao.addTeste();
        do{
            visao.menu();
            System.out.print("Digite:");
            opcao = ler.nextInt(); 
            
            switch(opcao){
                case 1 -> visao.incluirCliente();
                case 2 -> visao.excluirCliente();
                case 3 -> visao.apresentarClientes();
                case 4 -> visao.incluirProduto();
                case 5 -> visao.excluirProduto();
                case 6 -> visao.apresentarProduto();
                case 7 -> visao.incluirVenda();
                case 8 -> visao.excluirVenda();
                case 9 -> visao.apresentarVendaCliente();
                case 10 -> visao.apresentarTodasVendas();
                case 11 -> visao.totalVendaUmProduto();
                case 12 -> visao.totalVendaGeral();
            }
            
        }while(opcao!=0); 
    }
}
