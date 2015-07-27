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
    Describes the console menus.
*/
public class MenuChooser {
    private Scanner getChoice = new Scanner(System.in);
    private Scanner getContact = new Scanner(System.in);
    private int choice, contactChoice, i, j;
    private ArrayList<HashMap<String, String>> contactArray = new ArrayList<HashMap<String, String>>();
    private BusinessContact bc = new BusinessContact();
    private PersonalContact pc = new PersonalContact();
    public void getMenu() {
        System.out.println("\nPlease choose an option:\n"
                + "1. Create Business Contact\n"
                + "2. Create Personal Contact\n"
                + "3. List Contacts\n"
                + "4. Quit\n");
    }
    public void setMenu() {
        String menuChoice = getChoice.next();
        while (!menuChoice.matches("^[1-4]{1}$")) {
            System.out.println("\nNot a valid choice. Please enter a number between 1-4");
            getMenu();
            setMenu();
        }
        
        choice = Integer.parseInt(menuChoice);
        switch(choice) {
            case 1:
                bc.setDetails();
                contactArray.add(bc.contactDetails);
                getMenu();
                setMenu();
                break;
            case 2:
                pc.setDetails();
                contactArray.add(pc.contactDetails);
                getMenu();
                setMenu();
                break;
            case 3:
                try {
                    if (contactArray.get(0).containsKey("First"));
                    System.out.println("");
                    for (i = 0; i < contactArray.size(); i++) {
                        System.out.println((i + 1) + ". " + contactArray.get(i).get("First") + " " + contactArray.get(i).get("Last"));
                    };
                    if (contactArray.size() == 0) getMenu();
                    System.out.println("\nEnter a contact number for details\n");
                    String chooseContact = getContact.next();
                    while (!chooseContact.matches("^[1-9]{1,}$") || Integer.parseInt(chooseContact) < 1 || Integer.parseInt(chooseContact) > contactArray.size()) {
                        System.out.println("\nNot a valid choice. Please enter a number between 1-" + (contactArray.size() + 1) + "\n");
                        chooseContact = getContact.next();
                    }
                    contactChoice = Integer.parseInt(chooseContact);
                    j = contactChoice - 1;
                    System.out.println("\nName: " + contactArray.get(j).get("First") + " " + contactArray.get(j).get("Last") + "\n"
                            + "Contact Type: " + contactArray.get(j).get("Type") + "\n"
                            + "Address: " + contactArray.get(j).get("Address") + "\n"
                            + "Phone: " + contactArray.get(j).get("Phone") + "\n"
                            + "Email: " + contactArray.get(j).get("Email" + "\n")
                    );
                    if (contactArray.get(j).containsKey("JobTitle")) {
                        System.out.println("Job Title: " + contactArray.get(j).get("JobTitle"));
                    }
                    if (contactArray.get(j).containsKey("Organization")) {
                        System.out.println("Organization: " + contactArray.get(j).get("Organization"));
                    }
                    if (contactArray.get(j).containsKey("DOB")) {
                        System.out.println("Date of Birth: " + contactArray.get(j).get("DOB"));
                    }
                } catch (IndexOutOfBoundsException ioob) {
                    System.out.println("\nNo contacts have been added. Select 1 or 2 from the main menu to add them.\n");
                    getMenu();
                    setMenu();    
                }
                getMenu();
                setMenu();
                break;
            case 4:
                break;
            default:
                System.out.println("\nNot a valid choice. Please enter a number between 1-4\n");
                getMenu();
                setMenu();
                break;
        }
        
    }
}
