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

public class ApplicationSalaryCalculator {
  // class method salary which takes a name, jobs completed, and job rate
  public double calculateSalary(Employee employee) {
    return (employee.getJobsCompleted() * employee.getJobRate());
  }
  public double salary(Employee employee) {
    // multiply the amount of jobs completed by the job rate
    double totalSalary = calculateSalary(employee);
    // print out to the console using concatenation
    System.out.println("~~~~~ " + employee.getName() + "'s Salary ~~~~~");
    System.out.printf("\n" + employee.getName() + " completed " + employee.getJobsCompleted() +
                      " jobs @ $%.2f\n", employee.getJobRate());
    // print to console with printf which allows format specification
    // there are many different ways to do this with BigDecimal, DecimalFormat etc
    System.out.printf(employee.getName() + " earned $%.2f\n\n", totalSalary );
    return totalSalary;
  }

  public void combinedSalary(Employee employeeOne, Employee employeeTwo) {
   // class method to take an array of both people, rates, and jobs completed
   // Calculate combined salaries
   System.out.printf(employeeOne.getName() + "'s and " + employeeTwo.getName() +
                     "'s combined salaries: $%.2f\n\n" , calculateSalary(employeeOne)
                      + calculateSalary(employeeTwo));
}

  public static void main(String[] args) {
    // instantiate ApplicationSalaryCalculator object
    ApplicationSalaryCalculator salaryConverter = new ApplicationSalaryCalculator();
    // instantiate two employees
    Employee joe = new Employee("Joe", 5, 5000.00);
    Employee jim = new Employee("Jim", 10, 10000.00);
    // call salary method on each employee to get their salary information
    salaryConverter.salary(joe);
    salaryConverter.salary(jim);
    // call combinedSalary method to add two employees salaries together
    salaryConverter.combinedSalary(joe, jim);
  }
}
