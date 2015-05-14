import java.util.Scanner; // import the Scanner class from util library

public class MyFirstJavaProgram {
   public static void main(String []args) {
      // Say hello to the word
      System.out.println("Hello World");
      
      // initialize a scanner for System input
      Scanner userInputScanner = new Scanner(System.in);
      System.out.println("Fizzbuzz: Enter the number of iterations to check...");
      int numberUpTo = userInputScanner.nextInt();
      
      // declare and set integer variables to store sum of each divisible category
      int sumOfFifteen = 0;
      int sumOfFive = 0;
      int sumOfThree = 0;
      
      // for loop to from 1 to 100 to check for divisibility at each number
      for(int i = 1; i <= numberUpTo; i++) {
         // check if int i is evenly divided into 3 and 5, print fizzbuzz, and add i to sum of divis 3+5
         if(i % 15 == 0) {
            System.out.println("FizzBuzz");
            sumOfFifteen += i;
         // check if int i is evenly divided into 5, print buzz, and add i to sum of divis by 5
         }
         else if(i % 5 == 0) {
            System.out.println("Buzz");
            sumOfFive += i;
         // check if int i is evenly divided into 3 and 5, print fizzbuzz, and add i to sum of divis by 3
         }
         else if(i % 3 == 0) {
            System.out.println("Fizz");
            sumOfThree += i;
         // print the number if not divisible by 3 + 5, 5, or 3
         }
         else {
            System.out.println(i);
         }
      }
      // print out the total sums of each category of divisible
      System.out.println("Sum of divisble by 3 and 5: " + sumOfFifteen);
      System.out.println("Sum of divisble by 5: " + sumOfFive);
      System.out.println("Sum of divisble by 3: " + sumOfThree);
   }
}
