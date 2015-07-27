/*
 * Copyright (C) 2015 Michael Bybee
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Michael Bybee (mbybee1@wgu.edu)
 */

import java.util.*;

/**
    Describes a generic contact.
      Abstract superclass to BusinessContact and PersonalContact
 */
public abstract class Contact implements ExtraDetails {
    /**
        Initialize common variables shared by the subclasses BusinessContact and PersonalContact
    */
    protected String firstName, lastName, contactAddress, phoneNumber, emailAddress, contactType, details;
    protected HashMap<String, String> contactDetails = new HashMap<String, String>();
    public String listItem() {
        return firstName + " " + lastName ;
    }
    private Scanner scanFirstName = new Scanner(System.in);
    private Scanner scanLastName = new Scanner(System.in);
    private Scanner scanPhone = new Scanner(System.in);
    private Scanner scanEmail = new Scanner(System.in);
    private Address addr = new Address();
    
    public abstract String getDetails();
    
    /**
        Sets up common contact fields shared by subclasses
    */
    public void setDefaultDetails() {
        System.out.println("\nPlease enter the details for this contact.");
        System.out.println("First name: ");
        firstName = scanFirstName.next();
        System.out.println("Last name: ");
        lastName = scanLastName.next();
        addr.setAddress();
        contactAddress = addr.getAddress();
        System.out.println("Phone number: ");
        phoneNumber = scanPhone.next();
        System.out.println("Email Address: ");
        emailAddress = scanEmail.next();
        
        contactDetails.put("First", firstName);
        contactDetails.put("Last", lastName);
        contactDetails.put("Address", contactAddress);
        contactDetails.put("Phone", phoneNumber);
        contactDetails.put("Email", emailAddress);
        
    };
    @Override
    public abstract void setExtraDetails();
    public void setDetails() {
        setDefaultDetails();
        setExtraDetails();
    };
    
}
