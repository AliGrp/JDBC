import pojos.Doctor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query09 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "1203906");
        Statement st = con.createStatement();

        //Doktors tablosunu olusturun

//        String sql01 = "Create table doktors (id int, isim varchar(30), bolum varchar(20), ucret int)";
//        st.execute(sql01);

        List<Doctor> kayitlar = new ArrayList<>();
        kayitlar.add(new Doctor(20,"Ali Can","Dahiliye",500));
        kayitlar.add(new Doctor(21,"Veli Can","Dahiliye",500));
        kayitlar.add(new Doctor(22,"Ahmet Can","Beyin",500));
        kayitlar.add(new Doctor(23,"Ali Kaan","Dahiliye",500));
        kayitlar.add(new Doctor(24,"Mehmet Can","Kbb",500));
        kayitlar.add(new Doctor(25,"Ali Can","Dahiliye",500));
        kayitlar.add(new Doctor(26,"Ali Can","Psikiyatri",500));
        kayitlar.add(new Doctor(27,"Ali Can","ic Hastalilar",500));
        kayitlar.add(new Doctor(28,"Ali Can","Dahiliye",500));
        kayitlar.add(new Doctor(29,"Ali Can","Cildiye",500));

        PreparedStatement data = con.prepareStatement("insert into doktors values(?,?,?,?)");
        for (Doctor each:kayitlar) {
            data.setInt(1,each.getId());
            data.setString(2,each.getIsim());
            data.setString(3,each.getBolum());
            data.setDouble(4,each.getUcret());
            data.addBatch();
        }
        data.executeBatch();
        con.close();
        data.close();




    }
}
