import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query06 {

        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jdbc",
                    "postgres",
                    "1203906");
            Statement st = con.createStatement();

            //SORU: Öğrenciler tablosuna yen bir kayıt ekleyin (300, ‘Sena Can’, 12, ‘K’)

//            String sql01="insert into ogrenciler values(300,'Sena Can',12,'K')";
//            st.executeUpdate(sql01);

            //SORU: Öğrenciler tablosuna birden fazla veri ekleyin

//            String [] veri ={"insert into ogrenciler values(305,'Sena Can',12,'K')",
//                    "insert into ogrenciler values(401,'Sena Can',12,'K')",
//                    "insert into ogrenciler values(350,'Sena Can',12,'K')"};
//
//            int count=0;
//            for (String each:veri){
//                st.executeUpdate(each);
//                count++;
//            }
//            System.out.println(count +" satir eklendi");

            //2'nci Yol

//            String [] veri = {"insert into ogrenciler values(306,'Sena Can',12,'K')",
//                  "insert into ogrenciler values(402,'Sena Can',12,'K')",
//                   "insert into ogrenciler values(351,'Sena Can',12,'K')"};
//            for (String each:veri) {
//                st.addBatch(each); //yukaridaki datalarin hesini birlestirir
//            }
//            st.executeBatch();  //Datalari tek seferde gonderir

            con.close();
            st.close();
    }
}
