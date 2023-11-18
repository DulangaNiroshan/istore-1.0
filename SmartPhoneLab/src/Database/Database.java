package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Samsung
 */
public class Database {

    String url = "jdbc:mysql://localhost:3306/smart_phone_lab";

    public Connection con() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, "root", "");
        return con;
    }

    public void putData(String sql) throws Exception {
        Statement st = (Statement) con().createStatement();
        st.executeUpdate(sql);
    }

    public java.sql.ResultSet getData(String sql) throws Exception {
        Statement st = (Statement) con().createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }

}
