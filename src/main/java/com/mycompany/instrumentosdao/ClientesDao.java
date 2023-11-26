package com.mycompany.instrumentosdao;

import com.mycompany.models.Clientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author conta
 */
public class ClientesDao {
    
    static String url = "jdbc:mysql://localhost:3306/lojainstrumentos";
    static String login = "root";
    static String senha = "P@$$w0rd";
    
    public static boolean SalvarCliente (Clientes novoCliente) {
        // setando os parametros
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        // tentativa de conexao
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // tentando conexao novamente
            conexao = DriverManager.getConnection(url, login, senha);
            // fornecendo os dados para inserção no banco de dados
            comandoSQL = conexao.prepareStatement("INSERT INTO Clientes (Nome, CPF, Endereco, Telefone, Email, Sexo, EstadoCivil, DataNascimento, CepCliente) VALUES (?,?,?,?,?,?,?,?,?)",
                                                        PreparedStatement.RETURN_GENERATED_KEYS);
            comandoSQL.setString(1,novoCliente.getNomeCliente());
            comandoSQL.setString(2,novoCliente.getCpfCliente());
            comandoSQL.setString(3,novoCliente.getEndCliente());
            comandoSQL.setString(4,novoCliente.getTelCliente());
            comandoSQL.setString(5,novoCliente.getEmailCliente());
            comandoSQL.setString(6,novoCliente.getSexoCliente());
            comandoSQL.setString(7,novoCliente.getEstadoCliente());
            comandoSQL.setDate(8,new java.sql.Date(novoCliente.getDataCliente().getTime()));
            comandoSQL.setString(9, novoCliente.getCepCliente());
            
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
    
    public static ArrayList<Clientes> ListarClientes() {
        ArrayList<Clientes> lista = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Clientes");
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Clientes cliente = new Clientes();
                    cliente.setIdCliente(rs.getInt("id"));
                    cliente.setNomeCliente(rs.getString("Nome"));
                    cliente.setCpfCliente(rs.getString("CPF"));
                    cliente.setEndCliente(rs.getString("Endereco"));
                    cliente.setTelCliente(rs.getString("Telefone"));
                    cliente.setEmailCliente(rs.getString("Email"));
                    cliente.setSexoCliente(rs.getString("Sexo"));
                    cliente.setEstadoCliente(rs.getString("EstadoCivil"));
                    cliente.setDataCliente(new java.util.Date(rs.getDate("DataNascimento").getTime()));
                    cliente.setCepCliente(rs.getString("CepCliente"));
                    
                    lista.add(cliente);
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
        
        return lista;
        
    }
    
    public static ArrayList<Clientes> ListarClientes(String cpf) {
        ArrayList<Clientes> lista = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Clientes WHERE CPF = ?");
            comandoSQL.setString(1, cpf);
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Clientes cliente = new Clientes();
                    cliente.setIdCliente(rs.getInt("id"));
                    cliente.setNomeCliente(rs.getString("Nome"));
                    cliente.setCpfCliente(rs.getString("CPF"));
                    cliente.setEndCliente(rs.getString("Endereco"));
                    cliente.setTelCliente(rs.getString("Telefone"));
                    cliente.setEmailCliente(rs.getString("Email"));
                    cliente.setSexoCliente(rs.getString("Sexo"));
                    cliente.setEstadoCliente(rs.getString("EstadoCivil"));
                    cliente.setDataCliente(new java.util.Date(rs.getDate("DataNascimento").getTime()));
                    cliente.setCepCliente(rs.getString("CepCliente"));
                    
                    lista.add(cliente);
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
        
        return lista;
        
    }
    
    public static boolean ChecarCliente(int id) {
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
            comandoSQL = conexao.prepareStatement("SELECT * FROM Clientes WHERE id = ?");
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
    
    public static ArrayList<Clientes> ListarClientes(String nome, boolean nome1) {
        ArrayList<Clientes> lista = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Clientes WHERE Nome = ?");
            comandoSQL.setString(1, nome);
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Clientes cliente = new Clientes();
                    cliente.setIdCliente(rs.getInt("id"));
                    cliente.setNomeCliente(rs.getString("Nome"));
                    cliente.setCpfCliente(rs.getString("CPF"));
                    cliente.setEndCliente(rs.getString("Endereco"));
                    cliente.setTelCliente(rs.getString("Telefone"));
                    cliente.setEmailCliente(rs.getString("Email"));
                    cliente.setSexoCliente(rs.getString("Sexo"));
                    cliente.setEstadoCliente(rs.getString("EstadoCivil"));
                    cliente.setDataCliente(new java.util.Date(rs.getDate("DataNascimento").getTime()));
                    cliente.setCepCliente(rs.getString("CepCliente"));
                    
                    lista.add(cliente);
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
        
        return lista;
        
    }
   
    public static boolean AlterarCliente (Clientes clienteAlterar) {
        // setando os parametros
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        // tentativa de conexao
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // tentando conexao novamente
            conexao = DriverManager.getConnection(url, login, senha);
            // fornecendo os dados para inserção no banco de dados
            comandoSQL = conexao.prepareStatement("UPDATE Clientes set Nome = ?, CPF = ?, Endereco = ?, Telefone = ?, Email = ?, Sexo = ?, EstadoCivil = ?, DataNascimento = ?, CepCliente = ? WHERE id = ?");
            comandoSQL.setString(1,clienteAlterar.getNomeCliente());
            comandoSQL.setString(2,clienteAlterar.getCpfCliente());
            comandoSQL.setString(3,clienteAlterar.getEndCliente());
            comandoSQL.setString(4,clienteAlterar.getTelCliente());
            comandoSQL.setString(5,clienteAlterar.getEmailCliente());
            comandoSQL.setString(6,clienteAlterar.getSexoCliente());
            comandoSQL.setString(7,clienteAlterar.getEstadoCliente());
            comandoSQL.setDate(8,new java.sql.Date(clienteAlterar.getDataCliente().getTime()));
            comandoSQL.setString(9, clienteAlterar.getCepCliente());
            comandoSQL.setInt(10, clienteAlterar.getIdCliente());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            System.out.println(linhasAfetadas);
            if(linhasAfetadas == 1) {
                retorno = true;
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

    public static boolean ExcluirCliente (int idExcluir) {
        // setando os parametros
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        // tentativa de conexao
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // tentando conexao novamente
            conexao = DriverManager.getConnection(url, login, senha);
            // fornecendo os dados para inserção no banco de dados
            comandoSQL = conexao.prepareStatement("DELETE FROM Clientes WHERE id = ?");
            comandoSQL.setInt(1,idExcluir);
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            System.out.println(linhasAfetadas);
            if(linhasAfetadas == 1) {
                retorno = true;
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
    
    public static ArrayList<Clientes> ListarClientesVenda(int Id) {
        ArrayList<Clientes> lista = new ArrayList<>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            // carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexao
            conexao = DriverManager.getConnection(url, login, senha);
            // executar codigo
            comandoSQL = conexao.prepareStatement("SELECT * FROM Clientes WHERE id = ?");
            comandoSQL.setInt(1, Id);
            rs = comandoSQL.executeQuery();
            
            if(rs!= null) {
                while (rs.next()) {
                    Clientes cliente = new Clientes();
                    cliente.setIdCliente(rs.getInt("id"));
                    cliente.setNomeCliente(rs.getString("Nome"));
                    cliente.setCpfCliente(rs.getString("CPF"));
                    cliente.setEndCliente(rs.getString("Endereco"));
                    cliente.setTelCliente(rs.getString("Telefone"));
                    cliente.setEmailCliente(rs.getString("Email"));
                    cliente.setSexoCliente(rs.getString("Sexo"));
                    cliente.setEstadoCliente(rs.getString("EstadoCivil"));
                    cliente.setDataCliente(new java.util.Date(rs.getDate("DataNascimento").getTime()));
                    cliente.setCepCliente(rs.getString("CepCliente"));
                    
                    lista.add(cliente);
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
        
        return lista;
        
    }
}
    
