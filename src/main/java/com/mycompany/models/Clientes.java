package com.mycompany.models;

import java.util.Date;

/**
 *
 * @author conta
 */
public class Clientes {
    public int idCliente;
    public String nomeCliente;
    public String cpfCliente;
    public String endCliente;
    public String telCliente;
    public String emailCliente;
    public String sexoCliente;
    public String estadoCliente;
    public Date dataCliente;
    public String cepCliente;

    public Clientes(String nome, String cpf, String end, String tel, String email, String sexo, String estado, Date data, String cep) {
        this.nomeCliente = nome;
        this.cpfCliente = cpf;
        this.endCliente = end;
        this.telCliente = tel;
        this.emailCliente = email;
        this.sexoCliente = sexo;
        this.estadoCliente = estado;
        this.dataCliente = data;
        this.cepCliente = cep;
    }
    
    public Clientes(int idCliente, String nome, String cpf, String end, String tel, String email, String sexo, String estado, Date data, String cep) {
        this.idCliente = idCliente;
        this.nomeCliente = nome;
        this.cpfCliente = cpf;
        this.endCliente = end;
        this.telCliente = tel;
        this.emailCliente = email;
        this.sexoCliente = sexo;
        this.estadoCliente = estado;
        this.dataCliente = data;
        this.cepCliente = cep;
    }
    
    public Clientes ()
    {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEndCliente() {
        return endCliente;
    }

    public void setEndCliente(String endCliente) {
        this.endCliente = endCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public Date getDataCliente() {
        return dataCliente;
    }

    public void setDataCliente(Date dataCliente) {
        this.dataCliente = dataCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }
    
    
    
    
}
