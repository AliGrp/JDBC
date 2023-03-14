import pojos.Urun;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query08 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "1203906");
        Statement st = con.createStatement();

        //SORU: Urunler adında bir tablo olusturalım (id int, isim varchar(10), fiyat int)

//        String sql01 = "create table urunler (id int, isim varchar(10), fiyat int)";
//        st.execute(sql01);

        List<Urun> kayitlar = new ArrayList<>();
        kayitlar.add(new Urun(100,"Laptop",3500));
        kayitlar.add(new Urun(101,"Ipad",3200));
        kayitlar.add(new Urun(102,"MacBook",5500));
        kayitlar.add(new Urun(103,"Anakart",1500));
        kayitlar.add(new Urun(104,"Imac",1500));
        kayitlar.add(new Urun(105,"Iphone",4500));

        //cok miktarda data eklemek icin PS kullanmaliyiz
        PreparedStatement tablo = con.prepareStatement("insert into urunler values (?, ?, ?)");

        for (Urun each:kayitlar) {
            tablo.setInt(1,each.getId());
            tablo.setString(2, each.getIsim());
            tablo.setDouble(3,each.getFiyat());
            tablo.addBatch();
        }
        tablo.executeBatch();


    }
}
