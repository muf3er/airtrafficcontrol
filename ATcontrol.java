/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atcapplication;

import java.util.*; 

public class ATcontrol {
    // implement Aircraft class (node) - empty argument list?? 
Aircraft aircraft = new Aircraft ();

static Scanner in = new Scanner (System.in);

// list of planes 
static String [] planeList = {"Wide-body Airliner = w", "Regional Airliner = r", "Private Plane = p", 
        "Military = m", "Cargo only: c", "Unknown = u"};

//add plane and details
public static void addToList () {
    System.out.println("Enter flight number: ");
    String flight = in.nextLine();
    Aircraft.add(flight);

    //type of plane
    System.out.printf("Enter type of plane, ", "Choose from: " + Arrays.toString(planeList));
    String type = in.nextLine();
    try {
    if (null == type) type = null;else switch (type) {
            case "w":
                System.out.println("Wide-body Airliner");
                break;
            case "r":
                System.out.println("Regional Airliner");
                break;
            case "p":
                System.out.println("Private Plane");
                break;
            case "m":
                System.out.println("Military");
                break;
            case "c":
                System.out.println("Cargo only");
                break;
            case "u":
                System.out.println("Unknown");
                break;
            default:
                type = null;
                break;
        }
        }
    catch (InputMismatchException i) {
        System.out.println("You must enter valid command: " + Arrays.toString(planeList));
    }
    Aircraft.add(type);

    //plane speed
    System.out.println("Enter current speed: ");
    String speed = in.nextLine();
    Aircraft.add(speed);
    //add Altitude 
    System.out.println("Enter current altitude: ");
    String alt = in.nextLine();
    Aircraft.add(alt);
}

//show flight
public static void showFlight () {
    System.out.println("Enter flight number for details: ");
    in.nextLine();
    Aircraft.get(Aircraft.list);
}

// display all flights
public static void displayAll () {
    System.out.println("All flights: "  );
    in.nextLine();
    Aircraft.get(Aircraft.list);
}

//remove flight
public static void removeFlight () {
    System.out.println("Enter flight number to be removed: ");
    in.nextLine();
    Aircraft.remove();
}   

}
