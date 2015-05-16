/* Module 1-4   Program by Sean Snyder written on 5/15/2015

   Jim develops 5 Java applications a year. Joe develops 10 Java applications
   a year. Jim gets paid $5000.00 per application, but Joe gets paid $10000.00
   per application.
   
   1.) What type of equation would you create to determine how much either
       Joe or Jim makes separately? What equation is needed in Java (ignoring
       the $ symbol)? What data type is needed need for this equation?
       
   2.) What type of equation would you create to determine the combined total
       of Joe and Jim's worth? What is the equation in Java? What would be an
       incorrect way of writing this equation (think parentheses)? 

   
   The program takes uses a Salary calculator class to call a class
   method to calculate the salary.
 */

import java.text.DecimalFormat;

public class ApplicationSalaryCalculator {
  // class method salary which takes a name, jobs completed, and job rate
  public void salary(String name, int jobsCompleted, double jobRate) {
    // multiply the amount of jobs completed by the job rate
    double totalSalary = jobsCompleted * jobRate;
    // print out to the console using concatenation
    System.out.println("~~~~~ " + name + "'s Salary ~~~~~");
    System.out.println("\n" + name + " completed " + jobsCompleted + " jobs");
    // print to console with printf which allows format specification
    // there are many different ways to do this with BigDecimal, DecimalFormat etc
    System.out.printf(name + " earned $%.2f\n\n", totalSalary );
  }

  public static void main(String []args) {
    // instantiate ApplicationSalaryCalculator object
    ApplicationSalaryCalculator salaryConverter = new ApplicationSalaryCalculator();
    // call salary method with Jim and Joe's data
    salaryConverter.salary("Jim", 5, 5000.00);
    salaryConverter.salary("Joe", 10, 10000.00);
  }
}
