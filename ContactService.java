package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ContactService {
	private List<Contact> contactList;
	
	public boolean doesContactExist(String ID) {
		boolean result = false;
		for (Contact contact : contactList) {
			if (contact.getContactID().equals(ID)) {
				result = true;
			}
		}
		return result;
	}
	
	public Contact searchContactList(String ID) {
		Contact result = null;
		if (doesContactExist(ID)) {
			for (Contact contact : contactList) {
				if (contact.getContactID().equals(ID)) {
					result = contact;
				}
			}
		}
		return result;
	}

//	public int randomGen() {
//		Random r = new Random(System.currentTimeMillis());
//		return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
//	}
	
	public ContactService() {
		contactList = new ArrayList<Contact>();
	}
	
	public boolean valuesSafe(String firstName, String lastName, String phone, String address) {
		boolean result = true;
		
		if ((firstName.length() > 10) || firstName == null)
			result = false;
		if ((lastName.length() > 10) || lastName == null)
			result = false;
		if (!(phone.length() == 10) || phone == null)
			result = false;
		if ((address.length() > 30) || address == null)
			result = false;
	
		return result;
	}
	
	public String addContact(String ID, String firstName, String lastName, String phone, String address) throws Exception {
		if (valuesSafe(firstName, lastName, phone, address)) {
//			String randomID = String.valueOf(randomGen());
			Contact contact = new Contact(ID, firstName, lastName, phone, address);
			contactList.add(contact);
			return contact.getContactID() + " was added";
		} else {
			return "Values violate the rules";
		}	
	}
	
	public String deleteContact(String ID) {
		String result = "Contact " + ID + " deleted";
		boolean found = false;
		
		for (Contact contact : contactList) {
			if (contact.getContactID().equals(ID)) {
				contactList.remove(contact);
				found = true;
			}
		}
		
		if (found == false) {
			result = null;
		}
		
		return result;
	}
	
	public String updateContact(String ID, String firstName, String lastName, String phone, String address) {
		String result = "Contact " + ID + " updated";
		boolean found = false;
		
		if (valuesSafe(firstName, lastName, phone, address)) {
			for (Contact contact : contactList) {
				if (contact.getContactID().equals(ID)) {
					contact.setContactFirstName(firstName);
					contact.setContactLastName(lastName);
					contact.setContactPhone(phone);
					contact.setContactAddress(address);
					found = true;
				}
			}
		} else {
			result = null;
		}
		
		
		if (found == false) {
			result = null;
		}
		
		return result;
	}
}
