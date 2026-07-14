package View;

import Control.ControleProduto;
import Model.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class VisaoProduto {

    private ControleProduto controle = new ControleProduto();
    Scanner ler = new Scanner(System.in);

    public void adicionarProduto() {
        Produto produtoNovo = new Produto();
        Double precoVenda; 
        
        ler.nextLine();
        System.out.print("Digite o nome do produto:");
        produtoNovo.setNome(ler.nextLine());
        System.out.print("Digite a marca:");
        produtoNovo.setMarca(ler.nextLine());
        System.out.print("Digite o codigo do produto:");
        produtoNovo.setCodigo(ler.nextInt());
        if(controle.validarCodigo(produtoNovo.getCodigo())){
            System.out.print("Digite o valor da compra:");
        produtoNovo.setPrecoCompra(ler.nextDouble()); 
        controle.setProduto(produtoNovo);
        }
    }

    public void alterarProduto() {
        Integer codigoProduto;
        Produto produto;

        System.out.print("Digite o codigo do produto:");
        codigoProduto = ler.nextInt();
        produto = controle.acharProdutoPeloCodigo(codigoProduto);
        if (produto != null) {
            ler.nextLine();
            System.out.print("Digite o nome do produto:");
            produto.setNome(ler.nextLine());
            System.out.print("Digite o nome da marca do produto:");
            produto.setMarca(ler.nextLine());
        }
    }

    public boolean excluirProdutoPelaPosicao() {
        Integer codigo;

        System.out.println("Digite o codigo do produto:");
        codigo = ler.nextInt();
        for (Produto p : controle.getProduto()) {
            if (p.getCodigo() == codigo) {
                controle.excluirProduto(p);
                return true;
            }
        }
        return false;
    }

    public void apresentarProduto(Produto produto) {
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Marca:" + produto.getMarca());
        System.out.println("Codigo:" + produto.getCodigo());
        System.out.println("Estoque:" + produto.getQuantidadeEstoque());
        System.out.println("Preco compra:" + produto.getPrecoCompra());
        System.out.println("Preco venda:" + produto.getPrecoVenda());
        System.out.println("\n\n\n\n");
    }

    public void apresentarProdutos() {
        for (Produto p : controle.getProduto()) {
            apresentarProduto(p);
        }
    }

    public Integer opcao() {
        return ler.nextInt();
    }

    public void menu() {
        System.out.print("""
                           Digite uma das opcoes:
                           0 - Sair
                           1 - Adicionar produto
                           2 - Alterar produto
                           3 - Excluir Produto
                           4 - Apresentar produtos
                           5 - Realizar compra de produto
                           6 - Realizar venda de produto
                           7 - Alterar percentual de venda de um produto 
                           8 - Apresentar todos os produtos sem preco de compra
                           9 - Apresentar produtos sem estoque
                          10 - Apresentar produto com estoque
                          11 - Apresentar produtos de uma determinada marca
                          12 - Listar produtos de minimo para maximo
                          13 - Excluir produtos sem estoque
                          14 - Apresentar valor total em estoque
                          15 - Apresentar quantidade de produtos no estoque
                           Digite:""");

    }

    public void validacaoExcluir(boolean validar) {
        if (validar) {
            System.out.println("EXCLUIDO COM SUCESSO");
        } else {
            System.out.println("ERRO - ERRO NO CODIGO OU INEXISTENTE");
        }
    }

    public void realizarCompra() {
        Integer quantidade;
        Double valor;
        Integer codigo;
        Produto produto;
        System.out.print("Digite o codigo do produto:");
        codigo = ler.nextInt();
        if (controle.validarCompra(codigo)) {
            produto = controle.acharProdutoPeloCodigo(codigo);
            System.out.print("Digite a quantidade comprada:");
            quantidade = ler.nextInt();
            if (quantidade < 0) {
                System.out.println("Quantidade invalida...");
            } else {
                System.out.print("Digite o valor da compra:");
                valor = ler.nextDouble();
                if (valor < 0) {
                    System.out.println("Valor invalido...");
                } else {
                    produto.setQuantidadeEstoque(quantidade);
                    produto.setPrecoCompra(valor);
                }
            }
        } else {
            System.out.println("Produto inexistente...");
        }

    }

    public void realizarVenda() {
        Produto produto;
        Integer novaQuantidade;
        System.out.print("Digite o codigo do produto que deseja vender:");
        produto = controle.acharProdutoPeloCodigo(ler.nextInt());
        if (produto != null) {
            System.out.print("Digite a quantidade desejada do produto:");
            novaQuantidade = ler.nextInt();
            if (novaQuantidade > 0 && novaQuantidade <= produto.getQuantidadeEstoque()) {
                produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - novaQuantidade);
                System.out.println("O valor da venda sera:R$" + novaQuantidade * produto.getPrecoVenda());
            } else {
                System.out.println("Quantidade invalida...");
            }
        } else {
            System.out.println("Produto inexistente...");
        }
    }

    public void atualizarPercentual() {
        Produto produto;
        Double novoPercentual;
        System.out.print("Digite o codigo do produto que deseja alterar:");
        produto = controle.acharProdutoPeloCodigo(ler.nextInt());
        if (produto != null) {
            System.out.print("Digite o valor percentual de venda:");
            novoPercentual = ler.nextDouble();
            produto.setPrecoVenda((novoPercentual*produto.getPrecoCompra()) + produto.getPrecoCompra());
        } else {
            System.out.println("Produto inexistente...");
        }
    }

    public void apresentarUmProduto() {
        Produto produto;
        System.out.println("Digite o codigo do produto:");
        produto = controle.acharProdutoPeloCodigo(ler.nextInt());
        if (produto != null) {
            apresentarProduto(produto);
        } else {
            System.out.println("Produto inexistente...");
        }
    }

    public void apresentarUmProdutoSemCompra(Produto produto) {
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Marca:" + produto.getMarca());
        System.out.println("Codigo:" + produto.getCodigo());
        System.out.println("Estoque:" + produto.getQuantidadeEstoque());
        System.out.println("Preco venda:" + produto.getPrecoVenda());
        System.out.println("\n\n\n\n");
    }

    public void apresentarProdutoSemCompra() {
        for (Produto p : controle.getProduto()) {
            apresentarUmProdutoSemCompra(p);
        }
    }

    public void apresentarProdutoSemEstoque() {
        System.out.println("----------PRODUTO(S) SEM ESTOQUE------------");
        for (Produto p : controle.getProduto()) {
            if (p.getQuantidadeEstoque() == 0) {
                apresentarProduto(p);
            }
        }
    }

    public void apresentarProdutosComEstoque(){
        System.out.println("----------PRODUTO(S) COM ESTOQUE------------");
        for (Produto p : controle.getProduto()) {
            if (p.getQuantidadeEstoque() > 0) {
                apresentarProduto(p);
            }
        }
    }
    
    public void listarProdutosMarca(){
        String marca; 
        System.out.println("Digite o nome da marca:");
        ler.nextLine(); 
        marca = ler.nextLine(); 
        System.out.println("----------PRODUTOS DA MARCA: " + marca + "------------------");
        for(Produto p: controle.getProduto()){
            if(p.getMarca().toUpperCase().equals(marca.toUpperCase())){
                apresentarProduto(p); 
            }
        }
    }
    
    public void apresentarProdutosMinimoMaximo(){
        Double maximo; 
        Double minimo; 
        System.out.println("Digite um maximo:");
        maximo = ler.nextDouble(); 
        if(maximo>0){
            System.out.println("Digite um minimo:");
            minimo = ler.nextDouble(); 
            if(minimo>0){
                for(Produto p: controle.getProduto()){
                    if(controle.acharMinimoMaximo(maximo, minimo, p))
                        apresentarProduto(p); 
                }
            }
        }
       
    }
    
    public void excluirProdutoSemEstoque(){
        for(Produto p: controle.getProduto()){
            if(p.getQuantidadeEstoque()==0){
                controle.excluirProduto(p);
            }
        }
    }
    
    public void valorTotalEstoque(){
        Double valor = 0.0; 
        for(Produto p: controle.getProduto()){
              valor+=controle.valorDeUmProduto(p); 
        }
        System.out.println("O valor total em estoque:R$" + valor);
    }
    
    public void apresentarTotalDeProdutos(){
        Integer quantidade = 0; 
        for(Produto p: controle.getProduto()){
            quantidade += p.getQuantidadeEstoque(); 
        }
        System.out.println("A quantidade total em estoque:" + quantidade);
    }
}
