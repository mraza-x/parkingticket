/**
  Mohammed Raza
  CSC 236 - Lab1 #1 (class1)
*/

public class ParkedCar
{
   public String make;
   public String model;
   public String color;
   public String licno;
   public int parked;


      public ParkedCar()
      {
         	  make = "Volkswagon";
         	  model = "1972";
         	  color = "Red";
         	  licno = "147RHZM";
         	  parked = 60;
   	  }


   public ParkedCar(String ma, String mo, String c, String l, int p)
   {
   		 make = ma;
   		 model = mo;
   		 color = c;
   		 licno = l;
   		 parked = p;

   }

   public void setMake(String ma)
   {
         make = ma;
   }


   public void setModel(String mo)
   {
         model = mo;
   }

   public void setColor(String c)
   {
         color = c;
   }

   public void setLicenseNumber(String l)
   {
         licno = l;
   }

   public void setMinutesParked(int p)
   {
         parked = p;
   }




   public String getMake()
   {
	   return make;
   }

   public String getModel()
   {
   	   return model;
   }

   public String getColor()
   {
	   return color;
   }

   public String getLicenseNumber()
   {
   	   return licno;
   }

   public int getMinutesParked()
   {
   	   return parked;
   }

      public String toString()
      {
   	   String str = " ";
   	   return str;
      }


}

