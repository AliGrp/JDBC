import org.junit.Assert;
import org.testng.annotations.Test;
import utilities.JdbcUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MedunnaRoomTest {
    public MedunnaRoomTest() throws SQLException {
    }

    @Test
    public void roomTest() throws SQLException {
        //John Doe isimli kullanici tarafindan oda olusturldumu

        JdbcUtils.connectToDataBase("medunna.com",
                "medunna_db",
                "medunna_user",
                "medunna_pass_987");
        Statement statement = JdbcUtils.createStatement();
        String sql01 = "select created_by from room ";
        ResultSet resultSet = statement.executeQuery(sql01);//SQL Sorgu sonucu gelen datalar buradadir. --Buraya kadar jdbc ilk dort madde

        List<String> created_byList = new ArrayList<>();
        while (resultSet.next()) {//tek tek butun datalari aliyoruz
            created_byList.add(resultSet.getString(1));//1 sutun sayisi
        }
        System.out.println("Oda olusturanlar " + created_byList);

        Assert.assertTrue("DATABASE'DE BULUNAMADI", created_byList.contains("john_doe"));

        JdbcUtils.closeConnectionAndStatement();
    }

    @Test
    public void roomTest01() throws SQLException {
        // Rosetta Luettgen  isimli doktor varmi
        JdbcUtils.connectToDataBase("medunna.com","medunna_db","medunna_user","medunna_pass_987");
        Statement st = JdbcUtils.createStatement();
        ResultSet rs = st.executeQuery("select first_name from physician");

        List<String> created_myList = new ArrayList<>();

        while (rs.next()){
            created_myList.add(rs.getString(1));
        }
        System.out.println("DOKTORLAR LISTESI "+created_myList);

        Assert.assertTrue("DATABASE'DE BULUNAMADI", created_myList.contains("Rosetta Luettgen"));

        JdbcUtils.closeConnectionAndStatement();

    }



}