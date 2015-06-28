/*  Module 1.4 Practice problem by Sean Snyder 5/16/2015

    This class is an used in the main application for calculating
    the salary of an employee.

 */

public class Employee {
   // private class variables
   private String employeeName;
   private int jobsCompleted;
   private double jobRate;

   public Employee(String name, int jobsCompleted, double jobRate){
      // This constructor has three paramaeters
      this.employeeName = name;
      this.jobsCompleted = jobsCompleted;
      this.jobRate = jobRate;
   }
   // setter method for jobs completed
   public void setJobsCompleted( int jobsCompleted ){
       this.jobsCompleted = jobsCompleted;
   }

   // getter methods for employee
   public String getName() {
     return employeeName;
   }
   public int getJobsCompleted() {
      return jobsCompleted;
   }
   public double getJobRate() {
      return jobRate;
   }
   public static void main(String []args) {
     /* Nothing to run here since it is
        just to instantiate employees  */
   }
}
