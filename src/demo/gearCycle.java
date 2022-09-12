package demo;

public class gearCycle extends cycle {
	 public int gearUp()
		{
			super.total[2]++;
			return super.total[2];
		}
		public int gearDown()
		{
			super.total[2]--;
			return super.total[2];
		}
		@Override
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
					start+=total[2];
				}
				
				System.out.print(s);
				System.out.println();
				total[3]=s;
			
			}
			return total[3];
		}
		@Override
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
					start-=total[2];
				}
			        System.out.print(s + "  ");
			    
			}
			System.out.println();
			total[3]=s;
			return total[3];
		}
	    

}
