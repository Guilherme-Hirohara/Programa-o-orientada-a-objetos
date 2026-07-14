package model;


public class ItemVenda {
    private int quantidade;
    private Double valorUnitario; 
    private Produto produto; 
    
    public ItemVenda(){}; 
    
    public ItemVenda(int quantidade, Double valorUnitario, Produto produto){
        this.quantidade = quantidade; 
        this.valorUnitario = valorUnitario;
        this.produto = produto; 
    }
    public void setQuantidade(int quant){
        this.quantidade = quant; 
    }
    
    public void setValorUnitario(Double valorUnitario){
        this.valorUnitario = valorUnitario; 
    }
    
    public void setProduto(Produto produto){
       this.produto = produto;  
    }
    
    public Produto getProduto(){
        return produto; 
    }
    
    public int getQuantidade(){
        return quantidade; 
    }
    
    public Double getValorUnitario(){
        return valorUnitario; 
    }
    
    public Double getValorTotal(){
        return quantidade*valorUnitario; 
    }
    
    public boolean validarQuantidade(int quantidade){
        return quantidade>this.quantidade; 
    }
    
    @Override
    public String toString(){
        return "Nome do produto:" + produto.getNome() + "\nPreco do produto: R$" + valorUnitario + "\nQuantidade:" + quantidade + "\n"; 
    }
}
