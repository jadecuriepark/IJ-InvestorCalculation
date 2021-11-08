// This program will provide an Investor Calculation using input from you! (Jade Park - 5/22/2021)

import java.util.Scanner;

public class InvestorCalculation {
   public static void main(String[] args) {
   // Creating a scanner
   Scanner input = new Scanner(System.in);
   
   // Lets the user input the amount invested
   System.out.print("Enter the amount invested: ");
   double amountInvested = input.nextDouble();
   
    // Lets the user input the current company valuation
   System.out.print("Enter the current company valuation in millions: ");
   double currentCompanyValuation = input.nextDouble();

   // Lets the user input the estimated rate of growth
   System.out.print("Enter the estimated rate of growth as a percentage: ");
   double estimatedRateOfGrowth = input.nextDouble();

   // Lets the user input percentage of company given for investment
   System.out.print("Enter the percentage of company given for investment: ");
   double percentageOfCompanyGiven = input.nextDouble();
   
   // Lets the user input the number of investment years
   System.out.print("Enter the number of investment years: ");
   double investmentYears = input.nextDouble();
   
   // Using the given formulas to declare and assign new variables
   double totalFutureValue = (currentCompanyValuation * 1000000) * (Math.pow((1 + (estimatedRateOfGrowth / 100)), investmentYears));
   double futureValueOfInvestorsPercentage = amountInvested * totalFutureValue;
   double ownerFutureValue = totalFutureValue - (amountInvested + futureValueOfInvestorsPercentage);
   
   // Printing out the previous inputs
   System.out.println("You wrote the amount invested is " + amountInvested + ", \nthe current company valuation is " + currentCompanyValuation + ", \nthe estimated rate of Growth is " + estimatedRateOfGrowth + ", \nthe percentage of company given for investment is " + percentageOfCompanyGiven + ", \nand the number of investment years is " + investmentYears + ".");
   
   // Printing the owner future value
   System.out.println("The owner future value is " + ownerFutureValue);
}  
}
