import java.sql.*;

public class Query03 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/techproeducation",
                "postgres",
                "1203906");
        Statement st = con.createStatement();


        ResultSet veri = st.executeQuery("select eleman_id from elemanlar");

        while (veri.next()){
            System.out.println(veri.getInt("eleman_id") );
        }

        ResultSet veri01 = st.executeQuery("select eleman_id from elemanlar where eleman_id=100");
        while (veri01.next()){
            System.out.println(veri01.getInt(1));
        }



    }
}
