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
 * Contact Manager
 * Allows user to create business and/or personal contact(s),
 * list contacts by name, and view details for a given contact.
 * @author Michael Bybee (mbybee1@wgu.edu)
 */

public class ContactManager {

    /**
     * @param args the command line arguments (none in this case)
     */
    
    
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Contact Manager.\n");
        
        /**
            Initializes the main menu
        */
        MenuChooser chooseMenu = new MenuChooser();
        chooseMenu.getMenu();
        chooseMenu.setMenu();
    }
    
    
}



