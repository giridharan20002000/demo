package demo;
import java.io.*;
import java.util.*;

public class main {
	static void display(int a[]) {
		System.out.println("maximum speed       " +  a[0]);
        String s=(a[1]==0) ? "Not Running":"Running";
        System.out.println("status              " +  s);
        System.out.println("current gear        " + a[2]);
        System.out.println("current speed       " + a[3]);
        

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cycle c=new cycle();
		gearCycle c1=new gearCycle(); 
        System.out.println("enter the following code to perform corresponding operation");
        int cin=0;
        int cin1;
        Scanner sc=new Scanner(System.in);  
        while(cin!=9) {
           
        	System.out.println("1.Cycle");
        	System.out.println("2.Gear");
        	System.out.println("9.Exit");
        	cin1= sc.nextInt();
        	if(cin1==1) 
        	{
        		System.out.println("1.Get Status");
        		System.out.println("2.increment the speed");
                System.out.println("3.decrement the speed");
                System.out.println("4.brake");
                System.out.println("5.exit");
                System.out.print("enter the option:");  
            	cin= sc.nextInt();
            	int cout;
            	System.out.println("---------------------------------------------" );	
            	switch(cin) 
            	{
	            	case 1:
	            		int a[]=c.Status();
	                    display(a);
	                    break;
	            	case 2:
	            		System.out.print("enter the speed:");
	            		cout= sc.nextInt();
	            		c.incrSpeed(cout);
	            		break;
	            	case 3:
	            		System.out.print("enter the speed:");
	            		cout= sc.nextInt();
	            		c.decSpeed(cout);
	            		break;
	            	case 4:
	            		c.brake();
	            		break;
	            	case 5:
		        		cin=9;
		        		break;
            	}
            	System.out.println("---------------------------------------------" );	
            }
        	
        	else if(cin1==2) 
        	{
        		System.out.println("1.Get Status");
	            System.out.println("2.Increment Gear");
	            System.out.println("3.decrement Gear");
	            System.out.println("4.increment the speed");
	            System.out.println("5.decrement the speed");
	            System.out.println("6.brake");
	            System.out.println("9.exit");
	            System.out.print("enter the option:");  
	        	cin= sc.nextInt();
	        	int cout;
	        	System.out.println("---------------------------------------------" );	
	        	switch(cin) 
	        	{
	        	case 1:
	        		int a[]=c.Status();
	                display(a);
	                break;
	        	case 2:
	        		System.out.println("geared up to        " + c1.gearUp());
	        		break;
	        	case 3:
	        		System.out.println("geared down to:" + c1.gearDown());
	        		break;
	        	case 4:
	        		System.out.print("enter the speed:");
	        		cout= sc.nextInt();
	        		c.incrSpeed(cout);
	        		break;
	        	case 5:
	        		System.out.print("enter the speed:");
	        		cout= sc.nextInt();
	        		c.decSpeed(cout);
	        		break;
	        	case 6:
	        		c.brake();
	        		break;
	        	case 9:
	        		cin=9;
	        		break;
	        	}
	        	
	        	System.out.println("---------------------------------------------" );	
	        }
	        
        	else {
        		cin=9;
        	}
        
      
        
	}

}
}
