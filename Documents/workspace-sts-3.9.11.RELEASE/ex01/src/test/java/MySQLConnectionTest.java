
import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/book_ex?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\r\n";
	private static final String USER = "root";
	private static final String PW = "1234";

	@Test
	public void testConnection() throws Exception {

		try {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER, PW);

			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		} // try_
	}// testConnection_
}// MySQLConnectionTest_