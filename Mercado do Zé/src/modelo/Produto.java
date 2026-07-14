
package modelo;


public class Produto {
    private String nome; 
    private int quantidade; 
    private Double preco; 
    private int codigo; 

    public Produto() {
    }

    public Produto(String nome, int quantidade, Double preco, int codigo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Double getTotal(){
        return preco*quantidade; 
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
