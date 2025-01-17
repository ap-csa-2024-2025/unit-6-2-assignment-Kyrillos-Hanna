import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length:");
    int len = sc.nextInt();

    double[] arr = new double[len];
    System.out.println("Enter values:");
    for (int i = 0; i < len; i++)
    {
      arr[i] = sc.nextDouble();
    }
    System.out.println("Contains negative: " + containsNeg(arr) + "\n");

    //Problem 2
    System.out.println("Enter array length:");
    int len2 = sc.nextInt();
    int arr2[] = new int[len2];
    System.out.println("Enter values:");
    for (int i = 0; i < len2; i++) {
      arr2[i] = sc.nextInt();
    }
    System.out.println("Number divisible by three: " + numDivisibleBy3(arr2) + "\n");

    //Problem 3
    System.out.println("Enter a value for num:");
    int num = sc.nextInt();
    System.out.println("Enter array length:");
    int len3 = sc.nextInt();
    System.out.println("Enter values:");
    int arr3[] = new int[len3];
    for (int i = 0; i < len3; i++) {
      arr3[i] = sc.nextInt();
    }
    System.out.println("Num divisible by " + num + ": " + numDivisible(arr3, num));

  }

  public static boolean containsNeg(double[] array)
  {
    for(int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        return true;
      }
    }
    return false;
  }

  public static int numDivisibleBy3(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 3 == 0) {
        count++;
      }
    }
    return count;
  }

  public static int numDivisible(int[] array, int num) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % num == 0) {
        count++;
      }
    }
    return count;
  }
}
