package Array;
import java.util.Scanner;
public class SumOfArray {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     int maxSize = 3;
      int [] arr1= new int[maxSize];
       int [] arr2= new int [maxSize];
       int results[] = new int[maxSize];
        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < maxSize; i++) {
           System.out.println("Enter the element at index:" + i );
            arr1[i]= sc.nextInt();
         }
          System.out.println("Enter the elements of second array:");
           for (int i = 0; i < maxSize; i++) {
               System.out.println("Enter the element at index:" + i );
                 arr2[i]= sc.nextInt();
           }
           for(int i=0;i<maxSize;i++){
              results[i]= arr1[i]+ arr2[i];
           }
           System.out.println("The sum of two arrays is:");
          for(int i=0;i<maxSize;i++){
                 System.out.println(results[i]+" ");

    }}}

    

