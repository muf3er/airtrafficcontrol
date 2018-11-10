/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atcapplication;

import java.util.*;

public class ATCapplication {

   static Scanner in = new Scanner(System.in);
   
    public static void main(String[] args) {
        do {
        try {
            System.out.println("Enter new aircraft = e");
            System.out.println("Display all aircraft = d");
            System.out.println("Show specific flight = s");
            System.out.println("Remove specific flight = r");
            System.out.println("Please enter command to proceed: ");
            String command = in.next();
            in.next(command);

            if ( null == (in.next(command)) ) {
            } else switch (in.next(command)) {
                case "e":
                    ATcontrol.addToList();  // need to somehow "start" this class 
                    break;
                case "d":
                    ATcontrol.displayAll();
                    break;
                case "s":
                    ATcontrol.showFlight();
                    break;
                case "r":
                    ATcontrol.removeFlight();
                    break;
                default:
                    break;
            }
        } catch (InputMismatchException exc) {
            System.out.println("Wrong entry, please try again:");
        }
    } while (true);

        // TODO code application logic here
    }
    
}
