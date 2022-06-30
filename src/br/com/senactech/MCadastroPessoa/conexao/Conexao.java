
package br.com.senactech.MCadastroPessoa.conexao;

import java.sql.Connection;

import java.sql.SQLException;

import java.sql.DriverManager;


public class Conexao {

  //cria uma constante com endereço do BD e schema

  private static String url = "jdbc:mysql://localhost:3306/devm211";

  //cria uma constante com o user de conexão do banco

  private static String user = "root";

  //cria uma constante com a senha de acesso ao BD

  private static String pass = "";

   

  public static Connection getConexao() throws SQLException{

     
//Iniciar conexão nula, ainda não estabelecida 
Connection c = null; 
//tenta estabelecer conaxao 
try { 
c = DriverManager.getConnection (url, user, pass); 
//caso haja falha na conexão gera uma exceção 
} catch (SQLException e) {
throw new SQLException ("Erro ao conectar! /n" + e.getMessage());
} 
return c; 
  

}

}
        