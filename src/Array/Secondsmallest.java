package Array;

public class Secondsmallest {
    public static int secondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num != firstSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("There is no second smallest element.");
        }

        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        try {
            int result = secondSmallest(arr);
            System.out.println("The second smallest element is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
