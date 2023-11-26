package com.mycompany.models;

/**
 *
 * @author conta
 */
public class Produtos {
    public int id;
    public String nomeProduto;
    public String corProduto;
    public int qtdProduto;
    public int valorProduto;
    
    public Produtos() {
        
    }
    
    public Produtos (String nome, String cor, int qtd, int valor) {
        this.nomeProduto = nome;
        this.corProduto = cor;
        this.qtdProduto = qtd;
        this.valorProduto = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCorProduto() {
        return corProduto;
    }

    public void setCorProduto(String corProduto) {
        this.corProduto = corProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public int getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(int valorProduto) {
        this.valorProduto = valorProduto;
    }

   
    
    
}
