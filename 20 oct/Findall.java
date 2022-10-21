/* 
Q3)WAP to find the 1.square
2. cube 
3. check number is even or odd using switch case."
@author: Ankit patel
@Date: 20 oct 2022 


*/



//import packages 

import java.util.Scanner;
//declaring a class
class Findall 
{
	// method to square // 
	static void square(float n1);
{
 float result = n1*n1;
System.out.println("the result is :"+result);
}

// cube 
static void cube(float n1);
{
 float result = n1*n1*n1;
System.out.println("the result is :"+result);
}

// even and odd 
static void evenodd(float n1);


{

if(n1 %2 == 0);
System.out.println("the result is even :"+result);
else 
System.out.println("the result is odd : "+result);
}

// decler the vareble//
float n1
int choice
//
System.out.println(" enter the number :");
n1 = sc.nextFloat();

// menu //

System.out.println("1. square");
System.out.println("2. cube");
System.out.println("3. even and odd ");

choice = sc.nextFloat();
	{	
	
	   //switch case
	   switch(choice)
	   {
		   case 1:square(n1);
		          break;
		   case 2:cube(n1);
		          break;
		   case 3:evenodd(n1);
		          break;
		
		  default: System.out.println("Wrong input");
				  
	   }
	// end of switchcase
	
	  
	}
	//end of method printDay
	
	//main started
	public static void main(String args[])
	{
	
	   //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int choice;
		System.out.println("Enter the  number:");
		n1= sc.nextInt();
		
		//calling method to print day
		printn1(n1);
		
	
		
		    
	}
		
	// end of main
}
// end of class 