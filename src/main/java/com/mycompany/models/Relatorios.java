/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

import java.util.Date;

/**
 *
 * @author paulo
 */
public class Relatorios {
    public Date dataInicial;
    public Date dataFinal;
    public Date dataVenda;
    public int valorVenda;
    public String clienteVenda;
    public String produtoVenda;
    public int idVenda;
    public int valorUni;
    public int qtd;
    
    public Relatorios () {
    }
    
    public Relatorios (Date data1, Date data2) {
        this.dataInicial = data1;
        this.dataFinal = data2;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(int valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(String clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }


    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getProdutoVenda() {
        return produtoVenda;
    }

    public void setProdutoVenda(String produtoVenda) {
        this.produtoVenda = produtoVenda;
    }

    public int getValorUni() {
        return valorUni;
    }

    public void setValorUni(int valorUni) {
        this.valorUni = valorUni;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    

    

    
    
}
