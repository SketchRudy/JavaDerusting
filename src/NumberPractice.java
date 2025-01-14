public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negativeNumber = -10;
    System.out.println(negativeNumber);
    // Create an int with a positive value and assign it to a variable
    int positiveNumber = 10;
    System.out.println(positiveNumber);
    // Use the modulo % operator to find the remainder when the int is divided by 3
    double negativeRemainder = negativeNumber % 3;
    double positiveRemainder = positiveNumber % 3;

    System.out.println(negativeRemainder); // -10 % 3 = -1
    System.out.println(positiveRemainder); // 10 % 3 = 1
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    if (positiveNumber % 2 == 0) {
      System.out.println(positiveNumber + " has no remainder when divided by 2");
    }
    if (negativeNumber % 2 == 0) {
      System.out.println(negativeNumber + " has no remainder when divided by 2");
    }
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    int num = 10; // Were we supposed to use the variables above? 
    if (num % 2 == 0) {
      System.out.println(num + " is an even number");
    } else {
      System.out.println(num + " is an odd number");
    }

    // Divide the number by another number using integer division
    double outcome = (double) num / 3;
    System.out.println(outcome);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
