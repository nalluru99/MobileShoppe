package DaoLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.Mobile.Mobile;

public class DaoServicesImpl implements DaoServices {
	DatabaseConnec db = new DatabaseConnecImpl();

	public Set<Mobile> readAllItemsFromDb() throws SQLException {

		Set<Mobile> set = new HashSet<Mobile>();
		Connection con = db.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from mobile_shoppe");
		while (rs.next()) {
			Mobile m = new Mobile(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getInt(7));

			set.add(m);
		}
		System.out.println(set);

		return set;
	}

}
