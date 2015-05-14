import java.util.Scanner;

public class MillisecondsInAYear {
  public void getYear() {
    // ask for how many years to get milliseconds for
    System.out.println("~~Years to Milliseconds Converter~~\n\nPlease enter a number of years to convert:\n");
    Scanner userInput = new Scanner(System.in);
    int numberOfYears = userInput.nextInt();
    int daysInYear = 365;
    int hoursInDay = 24;
    int minutesInHour = 60;
    int secondsInMinute = 60;
    int millisecondsInSecond = 1000;
    int sumInMilliseconds = numberOfYears * daysInYear * hoursInDay * minutesInHour * secondsInMinute * millisecondsInSecond;
    System.out.println("\n\n" + numberOfYears + " years = " + sumInMilliseconds + " milliseconds");
  }
  public static void main(String []args) {
    MillisecondsInAYear converter = new MillisecondsInAYear();
    converter.getYear();
  }

}
