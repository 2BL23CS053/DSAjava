package Array;
import java.util.Scanner;
public class LeftRotationByK {
    public static void bruteforce(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int [] temp=new int[k];
        //storing the k values
         for(int i=0;i<k;i++){
            temp[i]=arr[i];
         }
         //movinig elements toleft
         for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
            
         }
         //putting back
         int j=0;

         for(int i=n-k;i<n;i++){
            arr[i]=temp[j];
            j++;

         }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        bruteforce(arr,k);
        System.out.println("The rotated array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
