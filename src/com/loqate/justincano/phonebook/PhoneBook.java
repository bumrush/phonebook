package com.loqate.justincano.phonebook;

public class PhoneBook {
	private ContactNode head;
	private int size;
	
	//private void empty() { // empties PhoneBook in order to load a new one.
	
	public PhoneBook() {
		this.head = null;
		this.size = 0;

	}
	
	public void insert(String fname, String lname, String address, String phone) {
		ContactNode newContact = new ContactNode(fname, lname, address, phone);
		
		// case 1: empty list
		if (head == null) {
			head = newContact;
			return;
		}
		
		ContactNode previous = head;
		// non-empty list
		for (ContactNode i = head; i != null; i = i.getNext()) {
			
			// edge case: insert newContact before other contact
			if (newContact.getLastName().compareTo(i.getLastName()) < 0) {
				// case 2: insert newContact at top of list
				if (i == head) {
					newContact.setNext(i);
					head = newContact;
					return;
				}
				// case 3: insert newContact in between other contacts
				else {
					newContact.setNext(i);
					previous.setNext(newContact);
					return;
				}
			}
			
			// case 4: PhoneBook has at least one contact, append newContact
			if (i.getNext() == null && newContact.getLastName().compareTo(i.getLastName()) > 0) {
				i.setNext(newContact);
				i = newContact;
				return;
			}
			
			// set previous
			if (newContact.getLastName().compareTo(i.getLastName()) > 0) {
				previous = i;
			}
		}
	}
	
	public void print() {
		for (ContactNode i = head; i != null; i = i.getNext()) {
			i.print();
		}
	}
}
