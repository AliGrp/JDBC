import org.junit.Assert;
import org.junit.Test;

public class FirstTest {
@Test
    public void firstTest01(){
    Assert.assertTrue(6<9);

}

@Test
    public void firstTest02(){

    Assert.assertTrue("Test Fail",17<9);
}

@Test
    public void firstTes03(){
    Assert.assertEquals("Sayilar esit degil","3","3");

}

}
