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
    Describes a mailing address.
*/
public class Address {
    private String street, city, state, zip;
    private Scanner scanStreet = new Scanner(System.in);
    private Scanner scanCity = new Scanner(System.in);
    private Scanner scanState = new Scanner(System.in);
    private Scanner scanZip = new Scanner(System.in);
    /**
       Constructs a mailing address.
       @param scanStreet the street
       @param scanCity the city
       @param scanState the state
       @param scanZip the ZIP postal code
    */
    
    /**
       Sets the address according to user input.
    */
    public void setAddress() {
       System.out.println("Please enter the address for this contact.");
       System.out.println("Street number & name: ");
       street = scanStreet.nextLine();
       System.out.println("City: ");
       city = scanCity.next();
       System.out.println("State: ");
       state = scanState.next();
       System.out.println("Zip Code: ");
       zip = scanZip.next();
    }
    
    /**
       Formats the address.
       @return the address as a string with two lines
    */
    public String getAddress() {
       return street + "\n" + city + ", " + state + " " + zip;
    }
    
}
