import java.sql.*;

public class Query05 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "1203906");
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select *  from ogrenciler");

        ResultSetMetaData rmsd = rs.getMetaData();
        System.out.println(" 1.Sutunun Ismi"+rmsd.getColumnName(1));
        System.out.println(" 2.Sutunun Ismi"+rmsd.getColumnName(2));
        System.out.println(" 3.Sutunun Ismi"+rmsd.getColumnName(3));
        System.out.println(" 4.Sutunun Ismi"+rmsd.getColumnName(4));

        System.out.println("Tablo Ismi"+rmsd.getTableName(4));

        System.out.println(rmsd.getColumnTypeName(1));
    }
}
