package Modelo;

import java.util.Scanner;

public class Contacorrente {

    private String conta;
    private Double saldo;
    private String agencia;
    private Double valor;
    private String escrita; 
    Scanner ler = new Scanner(System.in);

    public void setSaldo(Double novoSaldo) {
        saldo = novoSaldo;
    }

    public void setConta(String novaConta) {
        conta = novaConta;
    }

    public void setAgencia(String novaAgencia) {
        agencia = novaAgencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public void depositarSaldo() {
        System.out.println("Digite quanto quer depositar:");
        valor = ler.nextDouble();
        if (valor > 0) {
            saldo += valor;
            setSaldo(saldo);
        }
        else
            System.out.println("Valor invalido");
    }

    public void sacarSaldo() {
        System.out.println("Digite quanto quer sacar:");
        valor = ler.nextDouble();
        if (valor < saldo && valor>0) {
            saldo -= valor;
            setSaldo(saldo);
        } else {
            System.out.println("Saldo invalido");
        }
    }

    public void iniciarSaldo() {
        setSaldo(0.0);
    }

   public void cadastrarConta()
   {
       System.out.println("Digite seu nome:");
       escrita=ler.nextLine();
       if(escrita != "")
       {
           setConta(escrita); 
           System.out.println("Digite sua agencia:");
           escrita=ler.nextLine(); 
           if(escrita!="")
           {
               setAgencia(escrita); 
           }
           else
           {
                System.out.println("AGENCIA VAZIA");
               conta = null;  
           }
              
       }
       else
           System.out.println("NOME VAZIO");
   }
}
