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


import java.util.Scanner;

/**
    Describes a business contact.
*/
public class BusinessContact extends Contact {
    /**
        Initializes variables specific to this type of contact
     */
    private Scanner scanJobTitle = new Scanner(System.in);
    private Scanner scanOrganization = new Scanner(System.in);
    private String jobTitle;
    private String organization;
    
    @Override
    public String getDetails() {
        details = "Contact Type: " + contactDetails.get("Type") + "\n"
                + "Name: "  + contactDetails.get("First") + " " + contactDetails.get("Last") + "\n"
                + "Address: " + contactDetails.get("Address") + "\n"
                + "Phone: " + contactDetails.get("Phone") + "\n"
                + "Email: " + contactDetails.get("Email");
        return details;
    };
    
    /**
        Sets Details specific to this type of contact.
        Overrides the abstract method from superclass Contact
     */
    @Override
    public void setExtraDetails() {
        contactType = "Business";
        System.out.println("Job Title: ");
        jobTitle = scanJobTitle.nextLine();
        System.out.println("Organization: ");
        organization = scanOrganization.nextLine();
        
        contactDetails.put("Type", contactType);
        contactDetails.put("JobTitle", jobTitle);
        contactDetails.put("Organization", organization);
        
    }

}
