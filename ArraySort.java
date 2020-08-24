import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class ArraySort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Array Sorter! ");
    System.out.println("Enter the length of your array to begin: ");
    int arrLen = sc.nextInt();

    System.out.println("Enter the elements of your array (each on a new line) or press 'G' "
        + "to generate a random array of length " + arrLen + " for you");
    String userIn = sc.next();
    System.out.println(userIn);
    int[] userArr = new int[arrLen];

    if (userIn.equals("G") || userIn.equals("g")) { // user wants to generate a random array
      userArr = randomArr(arrLen);
    } else {
      for (int i = 0; i < arrLen; i++) {
        userArr[i] = sc.nextInt();
      }
    }
    System.out.println("The unsorted array is: [" + printArr(userArr) + "] ");
  }

  /*
   * Returns a randomized array of length n. The array only contains positive numbers as specified
   * by the upper bound when invoking the nextInt() method of the Random class
   * 
   * @param n - length of array
   * 
   * @return int[] of length n containing random numbers
   */
  private static int[] randomArr(int n) {
    int[] retArr = new int[n];
    int upperBound = (int) (Math.pow(2, 31) - 1);
    Random rand = new Random();
    for (int i = 0; i < n; i++) {
      retArr[i] = rand.nextInt(upperBound); // positive numbers only
    }

    return retArr;
  }
  
  /*
   * Prints the given array using a for loop. Numbers are separated by commas.
   * 
   * @param userArr - array to be printed
   * 
   * @return String representation of numbers in an array
   */
  private static String printArr(int[] userArr) {
    String retStr = "";
    for (int i = 0; i < userArr.length; i++) {
      if (i != userArr.length - 1) {
        retStr += userArr[i] + ", ";
      } else {
        retStr += userArr[i];
      }
    }
    return retStr;
  }

}
