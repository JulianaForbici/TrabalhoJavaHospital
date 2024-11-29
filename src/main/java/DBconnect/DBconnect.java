package DBconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {

    private static final String URL = "jdbc:mysql://localhost:3306/hospital?serverTimezone=America/Sao_Paulo"; 
    private static final String USER = "root"; 
    private static final String PASS = "root";  
    private static Connection conn; 

 
    public DBconnect() {
    }

  
    public static Connection connectToDatabase() throws ClassNotFoundException, SQLException {
        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            
     
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexão com o banco de dados bem-sucedida!");  
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());  
            throw e; 
        }
        
        return conn; 
    }


    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();  
                System.out.println("Conexão fechada.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());  
            }
        }
    }
}
