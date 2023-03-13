import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //“workers” adında bir table oluşturup “worker_id, worker_name, worker_salary” sütunlarını ekleyin.
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "1203906");
        Statement st = con.createStatement();

//        String sql01 = "Create Table workers (worker_id int, worker_name varchar(20), worker_salary int)";
//        st.execute(sql01);


        //workers tablosunu silelim
//        String sql03 = ("drop table workers");
//        st.execute(sql03);

        con.close();
        st.close();



    }
}
