
import java.util.Scanner;
class Persubject {
    public static void main(String[] args){
        System.out.println("Take Input from the user ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of 5 Subjects ");
        System.out.println("Enter Marks in Mathematics ");
        float a = sc.nextFloat();
        System.out.println("Enter Marks in Physics ");
        float b = sc.nextFloat();
        System.out.println("Enter Marks in Chemistry ");
        float c = sc.nextFloat();
        System.out.println("Enter Marks in English ");
        float d = sc.nextFloat();
        System.out.println("Enter Marks in Sanskrit ");
        float e = sc.nextFloat();
        float total = a + b + c + d + e;
        float average = (total / 5);
        float percentage = (total / 500) * 100;
        System.out.println("The total of All Subjects is: ");
        System.out.println(total);
        System.out.println("The Average of All Subjects is: ");
        System.out.println(average);
        System.out.println("The Percentage of All Subjects is: ");
        System.out.println(percentage);
    
	if(percentage>=40)
		System.out.println(" congratulations you pass");

else 
	System.out.println("you fail exam ..");

	}
}