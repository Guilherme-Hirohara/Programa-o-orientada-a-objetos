package Control;

import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ControleProduto {

    ArrayList<Produto> produto = new ArrayList<>();

    public void setProduto(Produto novoProduto) {
        novoProduto.Produto(novoProduto.getNome(), novoProduto.getMarca(), novoProduto.getCodigo(), novoProduto.getPrecoCompra());
        produto.add(novoProduto);
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public boolean validarCodigo(Integer codigo){
        for(Produto p: produto){
            if(Objects.equals(codigo, p.getCodigo()))
                return false; 
        }
        return true; 
    }
    public Produto acharProdutoPeloCodigo(Integer codigo) {
        for(Produto p: produto){
            if(Objects.equals(codigo, p.getCodigo()))
                return p;  
        }
      return null; 
    }

    public void alterarDadosProduto(Integer posicao, Produto novoProduto) {
        produto.add(posicao, novoProduto);
    }

    public void excluirProduto(Produto produtoProcurado) {
        produto.remove(produto.indexOf(produtoProcurado)); 
    }

    public boolean validarCompra(Integer codigo){
        for(Produto p: produto){
            if(Objects.equals(p.getCodigo(), codigo))
               return true; 
          }
        return false; 
    }
    
    public boolean acharMinimoMaximo(Double maximo, Double minimo, Produto produto){
         
             if(produto.getPrecoVenda()>=minimo&&produto.getPrecoVenda()<=maximo)
                 return true; 
             return false; 
    }
  
    public Double valorDeUmProduto(Produto produto){
        return produto.getPrecoVenda() * produto.getQuantidadeEstoque(); 
    }
        
    }

