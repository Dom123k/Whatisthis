import java.util.Hashtable;
import java.util.Map;

public class AddressBook {
	private Map<String, BuddyInfo> buddyTable;
	
	public AddressBook() {
		buddyTable = new Hashtable();
	}
	
	public void addBuddy(BuddyInfo b) {
		buddyTable.put(b.getName(), b);
	}
	
	public void removeBuddy(String name) {
		buddyTable.remove(name);
	}
	
}
