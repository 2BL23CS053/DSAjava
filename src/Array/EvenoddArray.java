package Array;
import java.util.Scanner;
public class EvenoddArray {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size of the array:");
         int n=sc.nextInt();
         System.out.println("Enter the elements of the array:");
         int[] arr=new int[n];
        int evenCount = 0;
        int oddCount = 0;

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}