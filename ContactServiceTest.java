package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	ContactService testContactService = new ContactService();

	@Test
	@DisplayName("add a contact and it shows up in the list")
	void addContactTest() throws Exception {
		testContactService.addContact("1234567890", "Joseph", "Castrigno", "9876543210", "address");
		// add it to list
		assertNotNull(testContactService.searchContactList("1234567890"));
		// check if it exists in the list
	}
	
	@Test
	@DisplayName("delete a contact and it won't show up in the list")
	void deleteContactTest() throws Exception {
		assertNull(testContactService.deleteContact("1234567890"));
		// check if it exists in the list
	}
	
	@Test
	@DisplayName("update a contact and it shows up in the list")
	void updateContactTest() throws Exception {
		testContactService.addContact("1234567890", "Joseph", "Castrigno", "9876543210", "address");
		// add it to list
		testContactService.updateContact("1234567890", "Emily", "Castrigno", "9876543210", "address");
		// update it
		assertNotNull(testContactService.searchContactList("1234567890"));
		// check if it exists in the list
	}

}