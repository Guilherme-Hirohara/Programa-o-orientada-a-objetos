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

public class Visao {

     Cliente c2 = new Cliente("54009612827", "Guilherme Noboru Onishi Hirohara"); 
      Cliente c1 = new Cliente("65789054323", "Gabriel Pontel de Mori"); 
      Produto p1 = new Produto(1234, "Coca-Cola", 2.0); 
      Produto p2 = new Produto(23, "Guarana", 1.5); ;

    ControleCliente controleCliente = new ControleCliente();
    ControleProduto controleProduto = new ControleProduto();
    ControleVenda controleVenda = new ControleVenda();

    public void addTeste() {
       controleCliente.addCliente(c1); 
       controleCliente.addCliente(c2);
       controleProduto.addProduto(p1);
       controleProduto.addProduto(p2);
    }

    public void menu() {
        System.out.println("============CONVENIENCIA===========\n");
        System.out.println("""
                           0 - Sair
                           1 - Incluir cliente 
                           2 - Excluir cliente 
                           3 - Apresentar os clientes 
                           4 - Incluir produto
                           5 - Exluir produto 
                           6 - Apresentar os produtos 
                           7 - Incluir venda 
                           8 - Excluir venda
                           9 - Apresentar todas as vendas de um cliente 
                           10 - Apresentar todas as vendas gerais 
                           11 - Total de vendas de um determinado produto 
                           12 - Totalizar a venda
                           """);

    }

    public boolean validarCodigoBarra(int codigoBarra) {
        return codigoBarra > 0;
    }

    public boolean validarValor(Double valor) {
        return valor > 0;
    }

    public boolean validarNome(String nome) {
        return !nome.isEmpty();
    }

    public void incluirCliente() {
        Scanner ler = new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.print("Digite o nome do cliente:");
        cliente.setNome(ler.nextLine());
        System.out.print("Digite seu cpf:");
        cliente.setCpf(ler.nextLine());

        controleCliente.addCliente(cliente);

    }

    public void excluirCliente() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o cpf do cliente:");
        controleCliente.removeCliente(controleCliente.pesquisarCliente(ler.nextLine()));
    }

    public void apresentarClientes() {
        System.out.println("============CLIENTE===========");
        for (Cliente c : controleCliente.getCliente()) {
            System.out.println("NOME:" + c.getNome());
            System.out.println("CPF:" + c.getCpf());
            System.out.println("\n");
        }
    }

    public void incluirProduto() {
        Scanner ler = new Scanner(System.in);
        int codigoBarra; 
        String nome; 
        Double preco; 
        Produto produto = new Produto();
        System.out.print("Digite o codigo de barra do produto:");
        codigoBarra = ler.nextInt(); 
        if (validarCodigoBarra(codigoBarra)) {
            produto.setCodigoBarra(codigoBarra);
            System.out.print("Digite o nome do produto:");
            ler.nextLine(); 
            nome = ler.nextLine(); 
            if (validarNome(nome)) {
                produto.setNome(nome);
                System.out.print("Digite o preco do produto:");
                preco = ler.nextDouble(); 
                if (validarValor(preco)) {
                    produto.setPreco(preco);
                    controleProduto.addProduto(produto);
                }
            }

        }
    }

    public Produto comprarProduto() {
        Scanner ler = new Scanner(System.in);
        String leitura;
        Double preco;
        Produto produto = new Produto();
        System.out.print("Digite o codigo de barra do produto:");
        if (validarCodigoBarra(ler.nextInt())) {
            System.out.print("Digite o nome do produto:");
            leitura = ler.nextLine();
            if (validarNome(leitura)) {
                produto.setNome(leitura);
                System.out.println("Digite o preco do produto:");
                preco = ler.nextDouble();
                if (validarValor(preco)) {
                    produto.setPreco(preco);
                    return produto;
                }
            }

        }
        return null;
    }

    public void excluirProduto() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o codigo de barra do produto:");
        if (controleProduto.removeProduto(ler.nextInt())) {
            System.out.println("Produto removido...");
        }
    }

    public void apresentarProduto() {
        System.out.println("============PRODUTO============");
        for (Produto p : controleProduto.getProduto()) {
            System.out.println("NOME:" + p.getNome());
            System.out.println("CODIGO DE BARRA:" + p.getCodigoBarra());
            System.out.println("PRECO: R$" + p.getPreco());
            System.out.println("\n");
        }
    }

    public void incluirVenda() {
        Scanner ler = new Scanner(System.in);
        int codigoBarra;
        int valor;
        String leitura;
        Date agora = new Date();
        Venda venda = new Venda();
        ItemVenda itemVenda = new ItemVenda();

        System.out.print("Digite o seu cpf:");
        leitura = ler.nextLine();
        if (controleCliente.validarCliente(leitura)) {
            venda.setCliente(controleCliente.pesquisarCliente(leitura));
            System.out.print("Digite o codigo de barra do produto que gostario de comprar:");
            codigoBarra = ler.nextInt();
            if(controleProduto.validarProduto(codigoBarra)){
            itemVenda.setProduto(controleProduto.pesquisarProduto(codigoBarra));
            System.out.print("Digite a quantidade que gostaria de comprar do produto:");
            valor = ler.nextInt();
            if (itemVenda.getQuantidade() > valor) {
                venda.setTotal(itemVenda.getValorUnitario() * valor);
                itemVenda.setQuantidade(itemVenda.getQuantidade() - valor);
                itemVenda.setValorUnitario(controleProduto.pesquisarProduto(codigoBarra).getPreco());
                venda.setItemVenda(itemVenda);
                venda.setDate(agora);
                controleVenda.addVenda(venda);
            }
            }
           

        }
    }

    public void excluirVenda() {
        Scanner ler = new Scanner(System.in);
        String cpf;
        int codigoBarra;
        Venda venda;
        System.out.print("Digite o cpf do cliente:");
        cpf = ler.nextLine();
        if (controleCliente.validarCliente(cpf)) {
            venda = controleVenda.pesquisarClienteProduto(cpf);
            System.out.print("Digite o codigo de barra do produto do cliente:");
            codigoBarra = ler.nextInt();
            for (ItemVenda i : venda.getItemVenda()) {
                if (i.getProduto().getCodigoBarra() == codigoBarra) {
                    controleVenda.deletarVenda(controleVenda.pesquisarClienteProduto(cpf));
                } else {
                    System.out.println("ERRO NO SISTEMA\n");
                }
            }
        } else {
            System.out.println("ERRO NO SISTEMA\n");
        }

    }

    public void apresentarVendaCliente() {
        Scanner ler = new Scanner(System.in);
        String leitura;
        System.out.print("Digite o cpf do cliente:");
        leitura = ler.nextLine();
        if (controleCliente.validarCliente(leitura)) {
            for(Venda v: controleVenda.getVenda()){
                if(v.getCliente().equals(controleCliente.pesquisarCliente(leitura))){
                    v.toString(); 
                }
            }
        }
    }

    public void apresentarTodasVendas() {
        System.out.println("============VENDA TOTAL============\n");
        for (Venda v : controleVenda.getVenda()) {
            System.out.println("\n");
            v.toString();
        }
    }

    public void totalVendaUmProduto() {
        Scanner ler = new Scanner(System.in);
        int codigoBarra;
        System.out.print("Digite o codigo de barra do produto:");
        codigoBarra = ler.nextInt();
        if (controleProduto.validarProduto(codigoBarra)) {
            System.out.println("Total de venda:R$" + controleVenda.valorTotalVendaUmProduto(codigoBarra));
        }
    }

    public void totalVendaGeral() {
        System.out.println("O total geral de venda:R$" + controleVenda.getTotal());
    }
}
