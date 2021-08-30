package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=desafio;user=sa;password=123");  
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}