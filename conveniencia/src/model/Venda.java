/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Venda {
    private Date date; 
    private Double total=0.0; 
    private String formaPagto; 
    private Cliente cliente; 
    
    static ArrayList<ItemVenda> itemVenda = new ArrayList<>(); 

    public Venda(){}; 
    
    public Venda(Date date, Double total, String formaPagto){
        this.date = date; 
        this.total = total; 
        this.formaPagto = formaPagto; 
    }
    
    public Date getDate() {
        return date;
    }

    public Double getTotal() {
        return total;
    }

    public String getFormaPagto() {
        return formaPagto;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTotal(Double valor) {
        total += valor; 
    }

    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente; 
    }
    
    public Cliente getCliente(){
        return cliente; 
    }
    
    public ArrayList<ItemVenda> getItemVenda(){
        return itemVenda; 
    }
    
    public void setItemVenda(ItemVenda item){
        itemVenda.add(item); 
    }
    
    @Override
    public String toString(){
        return "Data:" + date + "\nNome:" + cliente.getNome() + "\nCPF:" + cliente.getCpf()+ "\nTotal:" + total + "\nForma de pagamento:" + formaPagto; 
    }
    
}
