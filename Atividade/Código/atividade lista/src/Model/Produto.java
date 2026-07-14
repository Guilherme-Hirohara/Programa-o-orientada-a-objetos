
package Model;


public class Produto {
 
    private String nome; 
    private Double precoCompra; 
    private Integer codigo; 
    private Integer quantidadeEstoque; 
    private String marca; 
    private Double precoVenda; 
   public void Produto(){}
   
   public void Produto(String novoNome, String novaMarca, Integer novoCodigo, Double novoPrecoCompra){
       nome = novoNome; 
       precoCompra = novoPrecoCompra; 
       codigo = novoCodigo; 
       marca = novaMarca; 
       precoVenda = novoPrecoCompra+novoPrecoCompra*0.3; 
       quantidadeEstoque = 0; 
   } 
    
   public void setNome(String novoNome){
       nome = novoNome; 
   }
   
   public void setCodigo(Integer novoCodigo){
       codigo = novoCodigo; 
   }
   
   public void setPrecoCompra(Double novoPrecoCompra){
       precoCompra = novoPrecoCompra; 
   }
   
   public void setQuantidadeEstoque(Integer novoQuantidadeEstoque){
       quantidadeEstoque = novoQuantidadeEstoque; 
   }
   
   public void setMarca(String novaMarca){
       marca = novaMarca; 
   }
   public void setPrecoVenda(Double novoPrecoVenda){
       precoVenda = novoPrecoVenda; 
   }
   
   
    public String getNome() {
        return nome;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Double getPrecoVenda(Double valorPorcentual) {
        return precoCompra + precoCompra * valorPorcentual;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getMarca() {
        return marca;
    }
   
    public Double getPrecoVenda(){
        return precoVenda; 
    }
    
    public boolean isEstoque(Integer estoqueVazio){
        return estoqueVazio == 0; 
    }
    
    
}
