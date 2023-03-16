import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DatabaseUtilty;

public class TestNG_Test {

    @Test
    public void test01(){
        //Derya Soylu DB'ye kayitlimi
        DatabaseUtilty.createConnection();
        String sql = "select * from ogrenciler";
        Assert.assertTrue(DatabaseUtilty.getColumnData(sql,"ogrenci_ismi").contains("Derya Soylu"),"DB'de kayit bulunamadi");


        DatabaseUtilty.closeConnection();
    }
    @Test
    public void test02(){
        //111 nu'lu kayit varmi
        DatabaseUtilty.createConnection();
        Assert.assertTrue(DatabaseUtilty.getColumnData("select * from ogrenciler","okul_no").contains(111),"DB'de kayit yok");


    DatabaseUtilty.closeConnection();



    }

    }

