/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instrumentosdao;

import static com.mycompany.instrumentosdao.ClientesDao.login;
import static com.mycompany.instrumentosdao.ClientesDao.senha;
import static com.mycompany.instrumentosdao.ClientesDao.url;
import com.mycompany.models.Produtos;
import com.mycompany.models.Relatorios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulo
 */
public class RelatoriosDAO {
    
    static String url = "jdbc:mysql://localhost:3306/lojainstrumentos";
    static String login = "root";
    static String senha = "P@$$w0rd";
    
    
    public static ArrayList<Relatorios> ListarRelatorio() {
        ArrayList<Relatorios> listaProdutos = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT DataVenda,Valor,id_venda,Cliente FROM Vendas");
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Relatorios Relatorio = new Relatorios();
                    Relatorio.setValorVenda(rs.getInt("Valor"));
                    Relatorio.setClienteVenda(rs.getString("Cliente"));
                    Relatorio.setDataVenda(new java.util.Date(rs.getDate("DataVenda").getTime()));
                    Relatorio.setIdVenda(rs.getInt("id_venda"));
                    
                    
                    listaProdutos.add(Relatorio);
                }
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return listaProdutos;
        
    }
    public static ArrayList<Relatorios> ListarRelatorio(Relatorios relatorio) {
        ArrayList<Relatorios> listaProdutos = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Vendas WHERE DataVenda > ? AND DataVenda < ? ");
            
            comandoSQL.setDate(1, new java.sql.Date(relatorio.getDataInicial().getTime()));
            comandoSQL.setDate(2, new java.sql.Date(relatorio.getDataFinal().getTime()));
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Relatorios Relatorio = new Relatorios();
                    Relatorio.setValorVenda(rs.getInt("Valor"));
                    Relatorio.setClienteVenda(rs.getString("nomeCliente"));
                    Relatorio.setDataVenda(new java.util.Date(rs.getDate("DataVenda").getTime()));
                    Relatorio.setIdVenda(rs.getInt("id_venda"));
                    
                    listaProdutos.add(Relatorio);
                }
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return listaProdutos;
        
    }
    
    
    public static ArrayList<Relatorios> ListarRelatorioDetalhado(int id) {
        ArrayList<Relatorios> listaProdutos = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT nomeProduto,qtdProduto,valorUni FROM itemVenda WHERE id_venda = ?");
            
            comandoSQL.setInt(1, id);
            
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Relatorios Relatorio = new Relatorios();
                    Relatorio.setValorUni(rs.getInt("valorUni"));
                    Relatorio.setProdutoVenda(rs.getString("nomeProduto"));
                    Relatorio.setQtd(rs.getInt("qtdProduto"));
                    
                    
                    listaProdutos.add(Relatorio);
                }
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return listaProdutos;
        
    }
    
   
    
    
}
