package com.mycompany.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {
    
    int qtdProduto;
    String nomeCliente;
    String tipoVenda;
    String nomeProduto;
    int precoProduto;
    int idVenda;
    int precoVenda;
    int idCliente;
    Date dataVenda =  new Date();
    int idProduto;
    SimpleDateFormat formatadorDatas = new SimpleDateFormat("yyyy/MM/dd");

    
    public Venda() { 
    }
    
    public Venda(int qtd, String nomeC, String tipoV, String nome, int precoPd, int idVenda, int precoTotal, int idCliente, int idProduto) {
        this.qtdProduto = qtd;
        this.nomeCliente = nomeC;
        this.tipoVenda = tipoV;
        this.nomeProduto = nome;
        this.precoProduto = precoPd;
        this.idVenda = idVenda;
        this.precoVenda = precoTotal;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }
    
    

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public int getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(int precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(int precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    
    

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
}
