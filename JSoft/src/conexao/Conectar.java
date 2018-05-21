
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/jsoft","root","");
=======
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/jsoft","root","bosta");
>>>>>>> Material Design
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
    
}
