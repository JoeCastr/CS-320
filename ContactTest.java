package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	@DisplayName("contact ID string cannot be longer than 10 characters")
	void contactIDLength() {
		try {
			Contact testContact = new Contact("12345678910", "J", "C", "6", "a");
			fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertNotNull(e);
		}
	}
	
	@Test
	@DisplayName("contact firstName string cannot be longer than 10 characters")
	void contactFirstNameLength() {
		try {
			Contact testContact = new Contact("1", "JosephFrancis", "C", "6", "a");
			fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertNotNull(e);
		}
	}
	
	@Test
	@DisplayName("contact lastName string cannot be longer than 10 characters")
	void contactLastNameLength() {
		try {
			Contact testContact = new Contact("1", "J", "FrancisCastrigno", "6", "a");
			fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertNotNull(e);
		}
	}
	
	@Test
	@DisplayName("contact phone string must be 10 characters")
	void contactPhoneLength() {
		try {
			Contact testContact = new Contact("1", "J", "C", "12345678910", "a");
			fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertNotNull(e);
		}
	}
	
	@Test
	@DisplayName("contact address string length cannot be longer than 30 characters")
	void contactAddressLength() {
		try {
			Contact testContact = new Contact("1", "J", "C", "6", "addresslengthofoverthirtycharacters");
			fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertNotNull(e);
		}
	}

}
