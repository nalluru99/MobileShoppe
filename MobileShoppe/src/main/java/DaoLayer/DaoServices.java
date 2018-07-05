package DaoLayer;


import java.sql.SQLException;
import java.util.Set;

import com.Mobile.Mobile;

public interface DaoServices {
	 public Set<Mobile> readAllItemsFromDb() throws SQLException;

}
