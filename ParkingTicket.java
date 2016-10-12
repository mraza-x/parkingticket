/**
  Mohammed Raza
  CSC 236 - Lab1 #1 (class3)
*/

public class ParkingTicket
{

   public double fine;
   public double parkvio;



   public ParkingTicket()
   {
   }

    public ParkingTicket(int f)
    {

         fine = f;
    }

	public double calculateFine()
	{
		if ((ptik.getMinutesParked() - 60) >  pmet.getMinutesPurchased())

				fine = 25.0;

		else if (ptik.getMinutesParked() > pmet.getMinutesPurchased() * 2)

				fine = 25.0 + 10.0;

		else
				return fine = 0.0;


		return fine;


	}


	public double calculateIllMinutes()
	{
		parkvio = (ptik.getMinutesParked() - pmet.getMinutesPurchased());

		return parkvio;
    }



}