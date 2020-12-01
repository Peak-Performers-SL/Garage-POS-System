
package DatabaseConnnectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Vimantha_Dilshan
 */
public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //set DB name,username & password
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rustrepairpos", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }

}
