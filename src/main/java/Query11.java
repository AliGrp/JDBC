import utilities.DatabaseUtilty;

import java.sql.*;

public class Query11 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "1203906");
        Statement st = con.createStatement();
        //SORU: Öğrenciler tablosuna yen bir kayıt ekleyin (560, ‘Kemal Can’, 12, ‘K’)

//        String [] veri= {"insert into ogrenciler values (770,'Kemal Can',12,'K')",
//                "insert into ogrenciler values (761,'Kemal Can',12,'K')",
//                "insert into ogrenciler values (762,'Kemal Can',12,'K')"};
//
//        int count=0;
//        for (String each:veri) {
//            st.executeUpdate(each);
//            count++;
//        }
//        System.out.println(count+" satir eklendi");


        //2nci Yol

//        String [] veri= {"insert into ogrenciler values (778,'Kemal Can',12,'K')",
//                "insert into ogrenciler values (779,'Kemal Can',12,'K')",
//                "insert into ogrenciler values (780,'Kemal Can',12,'K')"};

//        int count=0;
//        for (String each:veri) {
//
//            st.addBatch(each);//datalari birlestirir
//
//            count++;
//        }
//        st.executeBatch();//datalari tek seferde gonderir
//
//        System.out.println(count+ "satir eklendi");
//

        con.close();
        st.close();

        }


    }


