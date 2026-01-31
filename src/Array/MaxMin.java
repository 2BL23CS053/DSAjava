package Array;

public class MaxMin {
     public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4, 5};
         int max = arr[0];
        int min = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > max) {
                max = arr[i];
             }
             if (arr[i] < min) {
                min = arr[i];
             }
        }
         System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
     }

//  public static int burtforce(int)

//     int burtforce(int[]arr){
//     Arrays.sort(arr);
//    ArraysIO.print(arr);
//    return arr[arr.length-1];
//  }
//  public static int better(int[]arr){
//  return largest;

//  }
//  public static 


//  }























}