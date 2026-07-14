
import Modelo.Contacorrente;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int op ; 
        Contacorrente p1; 
        p1 = new Contacorrente(); 
        Scanner ler = new Scanner(System.in); 
        p1.iniciarSaldo(); 
        do{
            System.out.println("Digite uma das opcoes:");
           
            System.out.println("0 - sair");
            System.out.println("1 - saldo");
            System.out.println("2 - depositar");
            System.out.println("3 - sacar"); 
            System.out.println("4 - cadastrar");
            op= ler.nextInt(); 
            if(op == 1)
            {
                if(p1.getConta()!=null)
                {
                 System.out.println("CONTA:" +p1.getConta());
                System.out.println("AGENCIA:"+p1.getAgencia());
                System.out.println("SALDO:"+p1.getSaldo());
                }
                else
                    System.out.println("ERRO - NENHUM CADASTRO");
                
                
            }
            if(op==2)
            {
                if(p1.getConta()!=null)
                p1.depositarSaldo(); 
                else
                    System.out.println("ERRO - CONTA NAO CADASTRADA");
            }
            if(op==3)
            {
                if(p1.getConta()!=null)
                p1.sacarSaldo();
                else
                    System.out.println("ERRO - CONTA NAO CADASTRADA");
            }
            if(op==4)
            {
                p1.cadastrarConta();   
            }                
            System.out.print("\n\n");
        }while(op!=0); 
    }
    
}
