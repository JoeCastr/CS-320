package main;

public class Contact {
	private String ID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public boolean valuesSafe(String ID, String firstName, String lastName, String phone, String address) {
		boolean result = true;
		
		if (ID.length() > 10 || ID == null)
			result = false;
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
	
	Contact(String ID, String firstName, String lastName, String phone, String address) throws Exception {
		if (valuesSafe(ID, firstName, lastName, phone, address)) {
			this.ID = ID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = phone;
			this.address = address;
		} else {
			throw new Exception("Invalid parameters");
		}
	}
	
	public String getContactID() {
		return this.ID;
	}

	public String getContactFirstName() {
		return this.firstName;
	}
	
	public String getContactLastName() {
		return this.lastName;
	}
	
	public String getContactPhone() {
		return this.phone;
	}
	
	public String getContactAddress() {
		return this.address;
	}
	
	public String setContactFirstName(String firstName) {
		this.firstName = firstName;
		return this.firstName;
	}
	
	public String setContactLastName(String lastName) {
		this.lastName = lastName;
		return this.lastName;
	}
	
	public String setContactPhone(String phone) {
		this.phone = phone;
		return this.phone;
	}
	
	public String setContactAddress(String address) {
		this.address = address;
		return this.address;
	}
	
}
