package jdbc_id.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_pj2", "postgres", "mirlan001m.");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
