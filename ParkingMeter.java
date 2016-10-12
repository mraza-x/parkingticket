/**
  Mohammed Raza
  CSC 236 - Lab1 #1 (class2)
*/

public class ParkingMeter
{
   public int minpurchased;

      public ParkingMeter()
      {
         	  minpurchased = 60;
   	  }


   public ParkingMeter(int mp)
   {
   		 minpurchased = mp;

   }

   public void setMinutesPurchased(int mp)
   {
         minpurchased = mp;
   }



   public int getMinutesPurchased()
   {
	   return minpurchased;
   }

      public String toString()
      {
   	   String str = " ";
   	   return str;
      }

}