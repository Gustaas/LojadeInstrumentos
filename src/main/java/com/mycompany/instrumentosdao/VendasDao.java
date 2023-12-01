package com.mycompany.instrumentosdao;

import com.mycompany.models.Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendasDao {
    static String url = "jdbc:mysql://localhost:3306/lojainstrumentos";
    static String login = "root";
    static String senha = "P@$$w0rd";
    
     public static boolean SalvarVenda (Venda novaVenda, boolean mesmaVenda) {
        // setando os parametros
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        // tentativa de conexao
        try {
            int linhasAfetadas = 0;
            if (mesmaVenda) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // tentando conexao novamente
                conexao = DriverManager.getConnection(url, login, senha);
                // fornecendo os dados para inserção no banco de dados
                comandoSQL = conexao.prepareStatement("INSERT INTO Vendas (id_Cliente, nomeCliente, tipoVenda, Valor, DataVenda) VALUES (?,?,?,?,?)",
                                            PreparedStatement.RETURN_GENERATED_KEYS);
                comandoSQL.setInt(1, novaVenda.getIdCliente());
                comandoSQL.setString(2,novaVenda.getNomeCliente());
                comandoSQL.setString(3,novaVenda.getTipoVenda());
                comandoSQL.setDouble(4,novaVenda.getPrecoVenda());
                comandoSQL.setDate(5,new java.sql.Date(novaVenda.getDataVenda().getTime()));
                linhasAfetadas = comandoSQL.executeUpdate();
            }
            Class.forName("com.mysql.cj.jdbc.Driver");
            // tentando conexao novamente
            conexao = DriverManager.getConnection(url, login, senha);
            // fornecendo os dados para inserção no banco de dados
            comandoSQL = conexao.prepareStatement("INSERT INTO itemVenda (id_venda, nomeProduto, id_produtos, qtdProduto, valorUni) VALUES (?,?,?,?,?)",
                                        PreparedStatement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1,novaVenda.getIdVenda());
            comandoSQL.setString(2,novaVenda.getNomeProduto());
            comandoSQL.setInt(3,novaVenda.getIdProduto());
            comandoSQL.setInt(4,novaVenda.getQtdProduto());
            comandoSQL.setInt(5,novaVenda.getPrecoProduto());
            
            linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas == 1) {
                // retorno caso funcione
                retorno = true;
                
                rs = comandoSQL.getGeneratedKeys();
                
                if (rs !=null) {
                    while(rs.next()) {
                        int idGerado = rs.getInt(1);
                    }
                }
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }
     
     public static int ultimaVenda() {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        int ultimaVenda = 0;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Vendas ORDER BY id_venda DESC LIMIT 1");
            rs = comandoSQL.executeQuery();
            System.out.print(rs);
            
            if(rs!= null) {
                while (rs.next()) {
                ultimaVenda = rs.getInt("id_venda");
                return ultimaVenda + 1;
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
        
        return ultimaVenda;
        
    }
}
