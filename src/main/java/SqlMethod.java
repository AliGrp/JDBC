import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlMethod {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        sql();
    }


   public static void sql() throws ClassNotFoundException, SQLException {
       Class.forName("org.postgresql.Driver");
       Connection con = DriverManager.getConnection(
               "jdbc:postgresql://localhost:5432/techproeducation",
               "postgres",
               "1203906");
       Statement st = con.createStatement();
   }
}
