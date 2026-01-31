package Array;
import java.util.*;
public class LeftRoationByOne {
    public static void solution(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solution(arr);
        System.out.println("\nArray after left rotation by one:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
