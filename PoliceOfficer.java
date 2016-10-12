/**
  Mohammed Raza
  CSC 236 - Lab1 #1 (class4)
*/

public class PoliceOfficer
{
   public String name;
   public int badge;


      public PoliceOfficer()
      {
         	  name = "Joe Friday";
         	  badge = 4788;
   	  }


   public PoliceOfficer(String n, int b)
   {
   		 name = n;
   		 badge = b;

   }

   public void setName(String n)
   {
         name = n;
   }


   public void setBadgeNumber(int b)
   {
         badge = b;
   }




   public String getName()
   {
	   return name;
   }

   public int getBadgeNumber()
   {
   	   return badge;
   }

      public String toString()
      {
   	   String str = " ";
   	   return str;
      }




}

