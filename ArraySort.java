import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class ArraySort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the Array Sorter! ");
    System.out.println("Enter the length of your array to begin: ");
    int arrLen = sc.nextInt();

    System.out
        .println("Enter the elements of your array (separated by commas, no spaces) or press 'g' "
            + "to generate a random array of length " + arrLen + " for you: ");

    // System.out.println(userIn);
    int[] userArr = new int[arrLen];
    String userIn = sc.next();

    if (userIn.equals("G") || userIn.equals("g")) { // user wants to generate a random array
      userArr = randomArr(arrLen);
    } 
    else {
      String[] strUserArr = userIn.split(",");
      for (int i = 0; i < arrLen; i++) {
        userArr[i] = Integer.valueOf(strUserArr[i]);
      }
    }
    System.out.println("The unsorted array is: " + printArr(userArr));
    System.out.println("---------------------------------------------------------");
    System.out.println("Choose a sorting(sorts in ascending order) algorithm from the given options "
        + "below: ");
    System.out.println("1. Bubble Sort: 'b'");
    System.out.println("2. Selection Sort: 's'");
    System.out.println("3. Insertion Sort: 'i'");
    System.out.println("4. Merge Sort: 'm'");
    System.out.println("5. Quick Sort: 'q'");
    System.out.println("---------------------------------------------------------");

    userIn = sc.next();

    switch (userIn) { 
      case "B":
      case "b":
        bubbleSort(userArr);
        break;
      case "S":
      case "s":
        selectionSort(userArr);
        break;
      case "I":
      case "i":
        insertionSort(userArr);
        break;
      case "M":
      case "m":
        mergeSort(userArr);
        break;
      case "Q":
      case "q":
        quickSort(userArr);
        break;
      default:
        quickSort(userArr);
        break;

    }

  }

  /**
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
  
  /**
   * Prints the given array using a for loop. Numbers are separated by commas.
   * 
   * @param userArr - array to be printed
   * 
   * @return String representation of numbers in an array
   */
  private static String printArr(int[] userArr) {
    String retStr = "[";
    for (int i = 0; i < userArr.length; i++) {
      if (i != userArr.length - 1) {
        retStr += userArr[i] + ", ";
      } else {
        retStr += userArr[i];
      }
    }
    retStr += "]";
    return retStr;
  } 
  
  /**
   * This method implements the bubble sort algorithm. Its time complexity is O(N^2).
   * 
   * @param userArr - array to be sorted
   */
  private static void bubbleSort(int[] userArr) {
    int count = 1;
    for (int i = 0; i < userArr.length; i++) {
      for (int j = i + 1; j < userArr.length; j++) {
        if (userArr[i] > userArr[j]) {
          int temp = userArr[j];
          userArr[j] = userArr[i];
          userArr[i] = temp;
        }
      }

      if (i != userArr.length - 1) {
        System.out.println("Step " + count);
        System.out.println(printArr(userArr));
      } else {
        System.out.println();
        System.out.println("The sorted array is: " + printArr(userArr));
      }
      count++;
    }

  }

  private static void selectionSort(int[] userArr) {
    System.out.println("S");
  }

  private static void insertionSort(int[] userArr) {
    System.out.println("I");
  }

  private static void mergeSort(int[] userArr) {
    System.out.println("M");
  }

  private static void quickSort(int[] userArr) {
    System.out.println("Q");
  }
  
  


}
