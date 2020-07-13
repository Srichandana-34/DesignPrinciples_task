package com.maven.task3;

import java.util.Scanner;


public class Calci {
	
	public static void main(String args[])
	{   float num1 = 0;
	    float num2 = 0;
		SimpleCalculator calc = new SimpleCalculator();
		System.out.println("******************");
		System.out.println("Simple Calculator");
		System.out.println("******************");
	    System.out.println("1.Addition");
	    System.out.println("2.Subtraction");
	    System.out.println("3.Multiplication");
	    System.out.println("4.Division");
	    System.out.println("5.Modulous");
	    System.out.println("6.Exit");
	  
         while(true) {
	    	  try {
	    	     System.out.println("Select any option from 1 to 6 : ");
	    	     Scanner sc= new Scanner(System.in);
	        
	    	     switch(sc.nextInt())
	    	     {
	    	       case 1:
	    		         System.out.println("Enter the first number:");
	    		         num1=sc.nextFloat();
	    		         System.out.println("Enter the second number:");
	    		         num2=sc.nextFloat(); 
	    		         System.out.println("Addition of "+(int)num1+" + "+(int)num2+" = "+(calc.add(num1,num2)));
	    		         break;
	    	       case 2:
	    		         System.out.println("Enter the first number:");
	    		         num1=sc.nextFloat();
	    		         System.out.println("Enter the second number:");
	    		         num2=sc.nextFloat(); 
	    		         System.out.println("Subtraction of "+(int)num1+" - "+(int)num2+" = "+(calc.sub(num1,num2)));
	    	             break;
	    	       case 3:
	    	
	    		         System.out.println("Enter the first number:");
	    		         num1=sc.nextFloat();
	    		         System.out.println("Enter the second number:");
	    		         num2=sc.nextFloat(); 
	    		         System.out.println("Multiplication  of "+(int)num1+" * "+(int)num2+" = "+(calc.multiplication(num1,num2)));
	    		         break;
	    	       case 4:
	    		         System.out.println("Enter the first number:");
	    		         num1=sc.nextFloat();
	    		         System.out.println("Enter the second number:");
	    		         num2=sc.nextFloat();
	    		         if(num2==0)
	    		           {
	    			         System.out.println("Second Number cannot be 0");
	    			         break;
	    		           }
	    		         System.out.println("Division of "+(int)num1+" / "+(int)num2+" = "+(calc.division(num1,num2)));
	    		         break;
	    	       case 5:
	    		         System.out.println("Enter the first number:");
	    		         num1=sc.nextFloat();
	    		         System.out.println("Enter the second number:");
	    		         num2=sc.nextFloat(); 
	    		         System.out.println("Modulous of "+(int)num1+" % "+(int)num2+" = "+(calc.modulous(num1,num2)));
	    		         break;
	    	       
	    	       case 6:
	    		   System.exit(1);
	    		  
	    		  
	    	       default:
	    		          System.out.println("Enter options only from 1 to 6");
	    		          break;
	    	     }
	        }
	    	catch(Exception e){
	    		
	    		System.out.println("Enter a valid number ");
	    		
	    	}
	}
	

}

}
