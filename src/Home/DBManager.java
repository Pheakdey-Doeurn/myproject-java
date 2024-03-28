package Home;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBManager {
//Data
    public static Connection con=null;
    //Method
    public static Connection getConnection(){
        try{
            if(con!=null) return con;
            Class.forName("com.mysql.cj.jdbc.Driver");                   
            con = DriverManager.getConnection("jdbc:mysql://localhost/myschool", "root", "");
            System.out.println("Connected");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return con;
    }
}
