import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String character = "Incredible";
    // Find the length of the string
    System.out.println(character.length());

    // Concatenate (add) two strings together and reassign the result
    String prefix = "Mr.";
    String Person = prefix + " " + character;
    System.out.println(Person);
    // Find the value of the character at index 3
    System.out.println(Person.charAt(3)); // Ironically the character is a space lol "Mr. Incredible"

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if (Person.contains("credible")) { // Case-sensitive
      System.out.println("True"); // I was wondering why it wasn't printing but it was false the whole time. 5 min mistake lol
    } else {
      System.out.println("false");
    }

    // Iterate over the characters of the string, printing each one on a separate line

    // It's actually pretty cool I'm realizing there's always patterns. I was stuck on printing this for a several min until 
    // I realized I already did the same thing above when finding a specific char.
    for (int i = 0; i < Person.length(); i++) {
      System.out.println(Person.charAt(i)); 
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> dictionary = new ArrayList<String>();

    // Add multiple strings to the  List (OK to do one-by-one)
    dictionary.add("I want");
    dictionary.add("to eat");
    dictionary.add("and then");
    dictionary.add("go sleep");

    System.out.println(dictionary);
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(", ",  dictionary);
    System.out.println(joined);

    // Check whether two strings are equal
    String string1 = "123";
    String string2 = "123";
    if (string1.equals(string2)) {
        System.out.println("true");
    } else {
      System.out.println("false");
    }

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
