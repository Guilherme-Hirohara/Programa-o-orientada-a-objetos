/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;


/**
 *
 * @author Aluno
 */
public class Cliente {
    private String cpf;
    private String nome; 
    
    public Cliente(){}; 
    
    public Cliente(String cpf, String nome){
        this.nome = nome; 
        this.cpf = cpf; 
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf; 
    }
    
    public String getCpf(){
        return cpf; 
    }
    
    public String getNome(){
        return nome; 
    }
}
