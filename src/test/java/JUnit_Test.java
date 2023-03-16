import org.junit.Assert;
import org.junit.Test;

import static utilities.DatabaseUtilty.*;

public class JUnit_Test {

    @Test
    public void Test01(){
        //Nil Naz Ve ALi can isimli ogrencilerin database de kayitli oldugunu dogrula
        createConnection();
        String sql = "select * from ogrenciler";
        System.out.println(getColumnData(sql, "ogrenci_ismi"));
        Assert.assertTrue("DATABASE'DE KAYIT BULUNAMADI",getColumnData(sql, "ogrenci_ismi").contains("Nil Naz"));
        Assert.assertTrue("DATABASE'DE KAYIT BULUNAMADI",getColumnData(sql, "ogrenci_ismi").contains("Ali Can"));



        closeConnection();
    }
    @Test
    public void Test02(){
        //120 numarali kayit varmi
        createConnection();
        Assert.assertTrue("DB'de kayit bulunamadi",
                getColumnData("select * from ogrenciler","okul_no").contains(120));

        closeConnection();



    }
}
