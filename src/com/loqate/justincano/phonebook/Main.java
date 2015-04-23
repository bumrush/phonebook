package com.loqate.justincano.phonebook;

import java.io.*;
import java.util.*;
import java.net.*;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook pb = new PhoneBook();
		
	    Scanner scanner = new Scanner( System.in );

	    System.out.println( "Insert Phone Book entry" );

	    System.out.print( "First Name: " );
	    String fname = scanner.nextLine();
	    
	    System.out.print( "Last Name: " );
	    String lname = scanner.nextLine();
	    
	    System.out.print( "Address: " );
	    String address = scanner.nextLine();
	    
	    System.out.print( "Phone Number: " );
	    String phone = scanner.nextLine();
		
		pb.insert(fname, lname, address, phone);		
		
		pb.print();
	}
}
