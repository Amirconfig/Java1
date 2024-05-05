//package assignment;
import java.util.Scanner;

/*
 * Assignment 1 (Jogger problem)
 * instructor: Muhammad Shafique
 * Author: Amir Hosein Khanmohammadi
 * student number: 991646689
 * Date: septamber 19, 2022
 * This application that can be used by the jogger to compute
 * speed in meters per second, and speed in kilometres per hour.
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		System.out.print("Please enter distance jogged in meters: ");  
		
		int distance= sc.nextInt();  
		
		System.out.print("Please enter time as hours, minutes, and seconds, separate values with a space: ");  
		
		int hour= sc.nextInt();
		int min= sc.nextInt();
		int second= sc.nextInt();
		int timeInSecond=(hour*3600)+(min*60)+second;
		double speedMeterPerSecond = (double)distance/(double)timeInSecond;
		//every hour is 60*60=3600 second
		double speedKilometerPerHour = ((double)distance/1000)/((double)timeInSecond/3600);
		
		System.out.println("Distance in meters: "+distance);
		System.out.println("Time in seconds: "+timeInSecond);

		System.out.println("Speed as meters per second: "+speedMeterPerSecond);
		System.out.println("Speed as kilometers per hour: "+speedKilometerPerHour);
		System.out.println("Thank you for using the application.");

		
	}

}
