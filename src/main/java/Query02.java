import java.sql.*;

public class Query02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "1203906");
        Statement st =con.createStatement();



        //SORU==> Region id'si 1 olan "country name" cagiriniz
        String sql01 = "select country_name from countries where region_id=1";

        ResultSet veri = st.executeQuery(sql01);

        while (veri.next()){
            System.out.println(veri.getString(1));
        }


        System.out.println("-------------");
        //Soru 2 :Region id'nin 2 den buyuk oldugu "country id" ve "country name" degerlerini cagirin

        String sql02 = "select country_id,country_name from countries where region_id>2";

        ResultSet veri1 = st.executeQuery(sql02);

        while (veri1.next()){
            System.out.println(veri1.getString(1) +
                                veri1.getString(2));
        }

        con.close();
        st.close();
        veri.close();

    }
}
