# airtrafficcontrol
A concurrent program to automate the task of Air Traffic Controller (ATC) designed and implemented in Java with appropriate concurrent program design methods as part of University module.The three java class files are the source code for the program. ATCapplication.java is the main class.
The main purpose of ATC is to prevent collisions, organize and expedite the flow of air traffic. To demonstrate the different scenarios that occur in an ATC, in the system there are six aircraft in the airspace having different conditions and 4 runways, one for emergency landing and three runways for incoming normal aircraft in the system. 

There are three sets of the ATC named ATC1, ATC2, ATC3 having different functionalities in the system. One set of ATC assigns flight paths to incoming aircraft without emergencies and assign gates to them, another guides those aircraft to landing approaches such as disembarking passengers, refill supplies and yet another guides plane to a safe landing in case of emergency. There are three emergencies set by the developer, 
-	Mechanical Malfunction which is dealt by landing the aircraft and then assigning them to Mechanical Workshops.
-	Medical Crisis by assigning medical team to the flight after landing.
-	Fuel Shortages where flight once landed, is assigned to fuel station for refill.
-	Weather conditions are taken in consideration, i.e., if it is snowy or rainy flight permission to land denied.
-	Flights with emergency must be given more focus than other incoming aircrafts.


To run the program, download .rar file and run it on netbeans. 
