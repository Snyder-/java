import java.util.Scanner;

public class MillisecondsInAYear {
  public void getYear() {
    // ask for how many years to get milliseconds for
    System.out.println("~~Years to Milliseconds Converter~~\n\nPlease enter a number of years to convert:\n");
    Scanner userInput = new Scanner(System.in);
    long numberOfYears = userInput.nextInt();
    long daysInYear = 365;
    long hoursInDay = 24;
    long minutesInHour = 60;
    long secondsInMinute = 60;
    long millisecondsInSecond = 1000;
    // Use long to avoid overflow from the int data type OR using casting on the ints before multiplication
    long sumInMilliseconds = numberOfYears * daysInYear * hoursInDay * minutesInHour * secondsInMinute * millisecondsInSecond;
    System.out.println("\n\n" + numberOfYears + " years = " + sumInMilliseconds + " milliseconds");
  }
  public static void main(String []args) {
    // instantiate an object of the MillisecondsInAYear class
    MillisecondsInAYear converter = new MillisecondsInAYear();
    // call getYear method
    converter.getYear();
  }

}
