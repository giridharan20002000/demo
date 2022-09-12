package demo;
public class cycle implements veh
{
     private int maxspeed=20;
     private int speed=0;
     private int gear=1;
     private int status=0;
     public int total[]= {maxspeed,status,gear,speed};
     public int[] Status() 
     {
		return total;
	 }
	   public void brake()
	{
		System.out.print("Brakeing          ");
		for(int i=total[3];i>=0;i--)
		{
			System.out.print(i + "  ");
		}
		System.out.println();
		total[3]=0;
	}
	public int incrSpeed(int s) 
	{
		if(s<total[3])
		{
			System.out.println("current speed is greater than the given speed");
		}
		else 
		{
			int start=total[3];
			System.out.print("Speeding up         ");
			while(start<=s) 
			{
				System.out.print(start + "  ");
				start+=1;
			}
			
			System.out.print(s);
			System.out.println();
			total[3]=s;
		
		}
		return total[3];
	}
	public int decSpeed(int s) 
	{
		if(s>=total[3])
		{
			System.out.println("current speed is lesser than or equal to the given speed");
		}
		else 
		{
			int start=total[3];
			System.out.print("Slowing down        ");
			while(start>s) 
			{
				System.out.print(start + "  ");
				start-=1;
			}
		        System.out.print(s + "  ");
		    
		}
		System.out.println();
		total[3]=s;
		return total[3];
	}
    
     
}

