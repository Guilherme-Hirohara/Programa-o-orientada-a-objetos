
import View.VisaoProduto;

public class Principal {

    public static void main(String[] args) {
        VisaoProduto tela = new VisaoProduto();
        Integer opcao;
        do {
            tela.menu();
            opcao = tela.opcao();
            switch (opcao) {
                case 1:
                    tela.adicionarProduto();
                    break;
                case 2:
                    tela.alterarProduto();
                    break;
                case 3:
                    tela.validacaoExcluir(tela.excluirProdutoPelaPosicao());
                    break;
                case 4:
                    tela.apresentarUmProduto();
                    break;
                case 5: 
                    tela.realizarCompra();
                    break; 
                case 6: 
                    tela.realizarVenda();
                    break; 
                case 7: 
                    tela.atualizarPercentual();
                    break; 
                case 8: 
                    tela.apresentarProdutoSemCompra();
                    break; 
                case 9: 
                    tela.apresentarProdutoSemEstoque();
                    break; 
                case 10: 
                    tela.apresentarProdutosComEstoque();
                    break; 
                case 11: 
                    tela.listarProdutosMarca();
                    break; 
                case 12: 
                    tela.apresentarProdutosMinimoMaximo();
                    break; 
                case 13: 
                    tela.excluirProdutoSemEstoque();
                    break; 
                case 14: 
                    tela.valorTotalEstoque();
                    break; 
                case 15: 
                    tela.apresentarTotalDeProdutos();
                    break; 
            }

        } while (opcao != 0);
    }
}
