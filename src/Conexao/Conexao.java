package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class Conexao {
    private static final String BANCO = "jdbc:mysql://localhost:3306/pratica_1";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    private static Connection con = null;

    public static Connection getConnection() throws SQLException{
        if (con == null) {
            try {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(BANCO, USUARIO, SENHA);
            } catch (ClassNotFoundException e) {
                System.out.println("Driver não encontrado");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return con;
    }
    
    public static PreparedStatement getPreparedStatement(String sql) throws SQLException{
        if (con == null) {
            con = getConnection();
        }
        
        try {
            return con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return null;
    }
}