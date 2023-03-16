import org.junit.Test;
import utilities.JdbcUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise_Test {
    @Test
    public void deneme() throws SQLException {
        JdbcUtils.connectToDataBase("medunna.com","medunna_db","medunna_user","medunna_pass_987");
        Statement st = JdbcUtils.createStatement();
        ResultSet rs = st.executeQuery("select * from room");
    }
}
