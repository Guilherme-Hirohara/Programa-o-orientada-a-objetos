/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class ConexaoSql {
    
     private static String urlBanco = "jdbc:mysql://localhost:3306/mercado?useTimezone=true&serverTimezone=UTC";
     
      public static Connection getConexao()
    {
        Connection conexao = null;
        try {
          
            conexao = DriverManager.getConnection(urlBanco, "root", "guilherme123");
            conexao.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Não foi possível fazer conexão com o banco");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return conexao;
    }
}
