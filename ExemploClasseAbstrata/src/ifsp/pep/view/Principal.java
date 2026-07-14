package ifsp.pep.view;


import ifsp.pep.model.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Principal {
    
    public static void main(String args[]){
       
        PessoaJuridica pes2 = 
                new PessoaJuridica("111", "123", "Padaria", 10);
     ///   System.out.println(pes2);
        
        PessoaFisica pes3 = 
                new PessoaFisica("cpf111", "rg111", "Maria", 23);
    //    System.out.println(pes3);
        
    /*    ArrayList <Pessoa> array =
            new ArrayList <Pessoa>();
        array.add(pes2);
        array.add(pes3);
        
///        Pessoa p = pes2;
        
        System.out.println("Fora do for: " + 
                            pes2 + "\n");
        for(Pessoa p : array){
            if(p instanceof PessoaJuridica){
                PessoaJuridica pesJus = 
                        (PessoaJuridica) p;
                pesJus.setInscricao("Alterado");
            }       
            p.exibir();
            System.out.println(p);
            System.out.println("Pagamento: " + 
                            p.calcularPagamento());
            System.out.println("\n");
        }
     */
        ArrayList <Pagamento> array2 =
                new ArrayList <Pagamento> ();
        array2.add(new 
            PessoaFisica("cpf1", "rg1", "Nome 1", 10));
        array2.add(new
            PessoaJuridica("CNPJ1", "Inscr1", "Nome2", 20));
        array2.add(new FaturaCartao());
        array2.add(new 
            PessoaFisica("CPF2", "RG2", "Nome3", 30));
        array2.add(new FaturaCartao());
        
        for(Pagamento p2 : array2){
            System.out.println(p2);
            System.out.println("Pagamento: " +
                    p2.calcularPagamento());
            System.out.println("\n");
        }
        
    }
    
}
