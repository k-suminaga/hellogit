package blog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	/* JDBCドライバのクラス名 */
	final static String DRIVER = "com.mysql.jdbc.Driver";

	/* DBのURL */
	final static String URL = "jdbc:mysql://localhost/mydb";

	/* DBのユーザー */
	final static String USER = "root";

	/* DBのPass */
	final static String PASS = "oopp1991";

	/* Connection取得 */
	public static Connection getConnection()
			throws SQLException {

		try {
			Class.forName(DRIVER);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new IllegalStateException(
					"fail to class load : "
					+ e.getMessage());
		}

		Connection con = DriverManager.getConnection(URL,
				USER, PASS);
		return con;
	}
}
