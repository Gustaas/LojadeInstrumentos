package com.mycompany.instrumentosdao;

import static com.mycompany.instrumentosdao.ClientesDao.login;
import static com.mycompany.instrumentosdao.ClientesDao.senha;
import static com.mycompany.instrumentosdao.ClientesDao.url;
import com.mycompany.models.Produtos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutosDao {
    
     public static boolean SalvarProdutos (Produtos novoProduto) {
    // setando os parametros
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // tentativa de conexao
            Class.forName("com.mysql.cj.jdbc.Driver");
            // tentando conexao novamente
            conexao = DriverManager.getConnection(url, login, senha);
            
            comandoSQL = conexao.prepareStatement("INSERT INTO Produtos (Nome, Cor, QtdEstoque, Preco) VALUES (?,?,?,?)",
                                                    PreparedStatement.RETURN_GENERATED_KEYS);
            comandoSQL.setString(1,novoProduto.getNomeProduto());
            comandoSQL.setString(2,novoProduto.getCorProduto());
            comandoSQL.setInt(3,novoProduto.getQtdProduto());
            comandoSQL.setInt(4,novoProduto.getValorProduto());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
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
    
    public static ArrayList<Produtos> ListarProdutos() {
        ArrayList<Produtos> listaProdutos = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produtos");
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Produtos produtos = new Produtos();
                    produtos.setId(rs.getInt("id_Produtos"));
                    produtos.setNomeProduto(rs.getString("Nome"));
                    produtos.setCorProduto(rs.getString("Cor"));
                    produtos.setQtdProduto(rs.getInt("QtdEstoque"));
                    produtos.setValorProduto(rs.getInt("Preco"));
                    
                    listaProdutos.add(produtos);
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
    
    public static ArrayList<Produtos> ListarProdutos(String nome) {
        ArrayList<Produtos> listaProdutos = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produtos WHERE Nome = ?");
            comandoSQL.setString(1, nome);
           
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Produtos produtos = new Produtos();
                    produtos.setId(rs.getInt("id_Produtos"));
                    produtos.setNomeProduto(rs.getString("Nome"));
                    produtos.setCorProduto(rs.getString("Cor"));
                    produtos.setQtdProduto(rs.getInt("QtdEstoque"));
                    produtos.setValorProduto(rs.getInt("Preco"));
                    
                    listaProdutos.add(produtos);
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
    
    public static ArrayList<Produtos> ListarProdutosVenda (int id) {
        ArrayList<Produtos> listaProdutos = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produtos WHERE id_Produtos = ?");
            comandoSQL.setInt(1, id);
           
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Produtos produtos = new Produtos();
                    produtos.setId(rs.getInt("id_Produtos"));
                    produtos.setNomeProduto(rs.getString("Nome"));
                    produtos.setCorProduto(rs.getString("Cor"));
                    produtos.setQtdProduto(rs.getInt("QtdEstoque"));
                    produtos.setValorProduto(rs.getInt("Preco"));
                    
                    listaProdutos.add(produtos);
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
    
    public static boolean ChecarProduto(int id) {
        boolean voltou = false;
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produtos WHERE id_Produtos = ?");
            comandoSQL.setInt(1, id);
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                voltou = true;
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
        
        return voltou;
        
    }
}
