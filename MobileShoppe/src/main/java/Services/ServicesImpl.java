package Services;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.Mobile.Mobile;

import DaoLayer.DaoServices;
import DaoLayer.DaoServicesImpl;

public class ServicesImpl implements Services {
	static DaoServices dao = new DaoServicesImpl();

	public Set<Mobile> readAllItemsFromDb() {
		Set<Mobile> finset = new HashSet<Mobile>();
		try {
			finset = dao.readAllItemsFromDb();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return finset;

	}

	public Set<Mobile> registerMobile(Mobile m) {
		Set<Mobile> mobiles = new HashSet<Mobile>();
		
		mobiles.add(m);
		return mobiles;
		}
	

}
