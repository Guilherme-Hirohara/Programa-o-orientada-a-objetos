/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class Produto {
    private Integer codigoBarra; 
    private String nome; 
    private Double preco; 
    
    public Produto(){}; 
    
    public Produto(Integer codigoBarra, String nome, Double preco){
        this.preco = preco; 
        this.nome = nome; 
        this.codigoBarra = codigoBarra; 
    }
    
    public void setCodigoBarra(Integer codigoBarra){
        this.codigoBarra = codigoBarra; 
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    
    public void setPreco(Double preco){
        this.preco = preco; 
    }
    
    public Integer getCodigoBarra(){
        return codigoBarra; 
    }
    
    public String getNome(){
        return nome; 
    }
    
    public Double getPreco(){
        return preco; 
    }
}
