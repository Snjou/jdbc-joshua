import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {


//    static final String DB_URL = "jdbc:mysql://localhost/";
//    static final String USER = "root";
//    static final String PASS = "";

    public static void main (String[] args){

        // Open a connection
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://freedb.tech/freedbtech_basiclogreg", "freedbtech_renzothenoob", "258789");
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate("INSERT INTO `user`(`email`, `password`) VALUES ('JUoshua','pogi123')");
            System.out.println(" inserted successfully...");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
