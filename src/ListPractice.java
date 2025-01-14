import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> groceries = new ArrayList<String>();
  
    // Add 3 elements to the list (OK to do one-by-one)
    groceries.add ("Milk");
    groceries.add("Eggs");
    groceries.add("Bacon");

    // Print the element at index 1
    System.out.println(groceries.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    groceries.set(1, "Better Eggs");
    System.out.println(groceries);
    // Insert a new element at index 0 (the length of the list will changes
    groceries.add(0, "Bananas");
    System.out.println(groceries);

    // Check whether the list contains a certain string
      System.out.println(groceries.contains("Bananas"));

    // Iterate over the list using a traditional for-loop.
    for (int i = 0; i < groceries.size(); i++) {
        System.out.println(groceries.get(i));
    }
    // Print each index and value on a separate line
    for (int i = 0; i < groceries.size(); i++) {
      System.out.println(groceries.get(i) + " is at index " + i);
    }

    // Sort the list using the Collections library
    Collections.sort(groceries); 
    System.out.println(groceries);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    System.out.println("---------------------"); 
    for (String i : groceries) {
        System.out.println(i); 
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}