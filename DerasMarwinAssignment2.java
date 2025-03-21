/*
 * Name: Marwin Deras
 * Class CS1150 M/W
 * Due: Sept 11, 2024
 * Description: Assignment2
 * This program creates a water intake calculator that approximates the amount of water required for two people to exercise. This program 
 * also computes the differences in values for these people.
 */

import java.util.Scanner;

public class DerasMarwinAssignment2 {

	public static void main(String[] args) {
		
	
	Scanner input = new Scanner (System.in);
	
	//constants
	
	final double DAILY_WATER_RATIO = 0.67;
	final double OUNCES_PER_CUP = 8.0;
	
	System.out.printf("Person #1 Information:\n--------------------------------------\n\n");
	 
	//Ask for Person 1 Name, Weight and Exercise
	
	System.out.print("Enter 1st person's name(first name only): ");
	String namePerson1 = input.next();
	System.out.print("Enter 1st person's weight(pounds): ");
	double weightPerson1 = input.nextDouble();
	System.out.print("Enter 1's person's excercise minutes: ");
	double exercisePerson1 = input.nextDouble();
	
	System.out.printf("\nPerson #2 Information:\n--------------------------------------\n");
	
	//Ask for Person 2 Name, Weight and Exercise 
	
	System.out.print("Enter 2nd person's name(first name only): ");
	String namePerson2 = input.next();
	System.out.print("Enter 2nd person's weight(pounds): ");
	double weightPerson2 = input.nextDouble();
	System.out.print("Enter 2nd person's excercise minutes: ");
	double exercisePerson2 = input.nextDouble();
	
	//Daily water in ounces then convert to cups (person 1)
	double cupDailyWaterPerson1 = (weightPerson1 * DAILY_WATER_RATIO / OUNCES_PER_CUP);
	//Daily water required in exercise to cups (person 1)
	double exerciseWaterPerson1 = (exercisePerson1 / 30 * 12) / 8 ;
	//Total cups (person 1)
	double totalCupsPerson1 = (cupDailyWaterPerson1 + exerciseWaterPerson1);
	
	//Daily water in ounces then convert to cups (person 2)
	double cupDailyWaterPerson2 = (weightPerson2 * DAILY_WATER_RATIO / OUNCES_PER_CUP);
	//Daily water required in exercise to cups (person 2)
	double exerciseWaterPerson2 = (exercisePerson2 / 30 * 12) / 8 ;
	//Total cups (person 2)
	double totalCupsPerson2 = (cupDailyWaterPerson2 + exerciseWaterPerson2);
	
	//Calculate differences of weight, exercise, water, and total. 
	double weightDifference = (Math.abs(weightPerson1 - weightPerson2));
	double exerciseDifference = (Math.abs(exercisePerson1 - exercisePerson2));
	double dailyWaterDifference = (Math.abs(cupDailyWaterPerson1 - cupDailyWaterPerson2));
	double exerciseWaterDifference = (Math.abs(exerciseWaterPerson1 - exerciseWaterPerson2));
	double totalWaterDifference = (Math.abs(totalCupsPerson1 - totalCupsPerson2));
	
	//table for differences and values for water intake
	System.out.println("*******************************************************************************************");
	System.out.printf("\t\t\t\tWater Intake Calculator\n");
	System.out.println("*******************************************************************************************");
	System.out.printf("\n Person \t Weight \t Exercise \t Daily Water \t Exercise Water \t Total Water");
	System.out.printf("\n (lbs) \t\t (min) \t\t (cups) \t (cups) \t (cups)");
	System.out.println("\n-------------------------------------------------------------------------------------------");
	System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f\n", namePerson1, weightPerson1, exercisePerson1, cupDailyWaterPerson1, exerciseWaterPerson1, totalCupsPerson1); //person 1 values
	System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f\n", namePerson2, weightPerson2, exercisePerson2, cupDailyWaterPerson2, exerciseWaterPerson2, totalCupsPerson2); //person 2 values
	System.out.println("\n-------------------------------------------------------------------------------------------");
	System.out.printf("%s\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f\n", "Differences", weightDifference, exerciseDifference, dailyWaterDifference, exerciseWaterDifference, totalWaterDifference); //differences
	
	input.close(); //close scanner object
	}

}
