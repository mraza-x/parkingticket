
import java.util.*;

/**
  Mohammed Raza
  CSC 236 - Lab1 #1 (main)
*/

public class ParkingTicketSimulator
{
   public static void main(String[] args)
   {

	  double fine = 0.0;
	  int illminutes;

	  ParkedCar car = new ParkedCar();

	  ParkingMeter meter = new ParkingMeter();

	  PoliceOfficer poff = new PoliceOfficer();

	  System.out.println("Car Data:");

	  System.out.println("Make: " + car.getMake());
	  System.out.println("Model: " + car.getModel());
	  System.out.println("Color: " + car.getColor());
	  System.out.println("License Plate #: " + car.getLicenseNumber());
	  System.out.println("Minutes Parked: " + car.getMinutesParked());

	  System.out.println(" ");

	  System.out.println("Police Officer Data: ");

	  System.out.println("Name: " + poff.getName());
	  System.out.println("Name: " + poff.getBadgeNumber());

	  System.out.println(" ");

	  illminutes = car.getMinutesParked() - meter.getMinutesPurchased();

	  if (illminutes <= 0)
	  {
		  System.out.println("No crimes committed");
	  }


	  else if (illminutes > 0 && illminutes < 60)
	  {
		  System.out.println("Police Officer Issued a ticket");

		  fine = 25.0;
		  System.out.println("Fine: $" + fine);
	  }

	  else if (illminutes > 0 && illminutes > 60)
	  {
		  System.out.println("Police Officer Issued a ticket");

		  		  fine = 30.0;
		  System.out.println("Fine: $" + fine);
	  }

	  else
	  		System.out.println("No crimes committed");



   }
}
