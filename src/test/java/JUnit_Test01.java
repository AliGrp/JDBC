import org.junit.Assert;
import org.junit.Test;

import static utilities.DatabaseUtilty.*;

public class JUnit_Test01 {
@Test
    public void test01(){

    createConnection();
    String sql01="select * from urunler";
    Assert.assertTrue("DB'DE BULUNAMADI",getColumnData(sql01,"isim").contains("Laptop"));


    closeConnection();
}
}
