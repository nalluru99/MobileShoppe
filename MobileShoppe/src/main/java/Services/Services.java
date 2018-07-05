package Services;

import java.util.Set;

import com.Mobile.Mobile;

public interface Services {
	 public Set<Mobile> readAllItemsFromDb();
	 public Set<Mobile> registerMobile(Mobile m);
}
