package com.loqate.justincano.phonebook;

public class ContactNode {
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	
	ContactNode next;
	
	ContactNode() {
		this.firstName = new String();
		this.lastName = new String();
		this.address = new String();
		this.phone = new String();
		this.next = null;
	}
	
	ContactNode(String fname, String lname, String address, String phone) {
		this.firstName = fname;
		this.lastName = lname;
		this.address = address;
		this.phone = phone;
		this.next = null;
	}
	
	public ContactNode getNext() {
		return next;
	}
	
	public void setNext(ContactNode nextNode) {
		next = nextNode;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void print() {
		System.out.println(firstName + " " + lastName);
		System.out.println(address);
		System.out.println(phone);
	}
}
