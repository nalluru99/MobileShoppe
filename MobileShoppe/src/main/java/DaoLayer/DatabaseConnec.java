package DaoLayer;

import java.sql.Connection;

public interface DatabaseConnec {
	public Connection getConnection();
	public void closeConnection();

}
