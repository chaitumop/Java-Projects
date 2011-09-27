//Ben Sherman, 9.08.11, Velocity Calculator (with input). Added to Git on 9-26-11 for a test. 
//To use, run the program. Type the values when prompted, and remember to change the unit of measurement to fit your question. 
import java.util.Scanner; //imports the scanner utility
class VCI {
	
	public static void main (String[] args) {
			System.out.println ("Make sure distance and time are in the correct format- m/s, fps, mph, etc.\n");
			
			Scanner scan = new Scanner (System.in); //initializes the scanner command
			
		String Unit; //declares the variable UNIT
		Unit = "m/s"; //Sets the value of UNIT to the unit of measurement
			System.out.println ("The unit is: " + Unit + "\n");	
			
			System.out.print("Type the first distance "); //prompts the user to type the first distance
		
		double D1; //declares the variable D1 as a double
		D1 = scan.nextDouble(); //sets the value of variable D1
			System.out.println ("Distance 1 is: " + D1); //prints the text "Distance 1 is: " along with the value of D1
			
			System.out.print("Type the second distance ");
		double D2;
		D2 = scan.nextDouble();
			System.out.println ("Distance 2 is: " + D2);
		
		double AVGD;
		AVGD = D2 - D1;
			System.out.println ("The change in distance is: " + AVGD + "\n");
			
			System.out.print ("Type the first time ");
		double T1;
		T1 = scan.nextDouble();
			System.out.println ("Time 1 is: " + T1);
			
			System.out.print("Type the second time ");
		double T2;
		T2 = scan.nextDouble();
			System.out.println ("Time 2 is: " + T2);
		
		double AVGT;
		AVGT = T2 - T1;
			System.out.println ("The change in speed is:" + AVGT + "\n");
	
		System.out.println ("The equation used to formulate the velocity is " + AVGD + "/" + AVGT + "\n");
		
		System.out.println ("The velocity is:" + (D2-(D1)) / (T2-(T1)) + Unit); //Calculates velocity by measuring the change in distance and diving by the change in time, then prints the value and adds the unit of measurement
	
	}
}