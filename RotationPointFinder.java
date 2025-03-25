import java.util.Scanner;

public class RotationPointFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //find the index of the rotation point
        int rotationIndex = findRotationPoint(arr);

        System.out.println("The rotation point (smallest element) is at index: " + rotationIndex);

    }


    // Function to find the rotation point (smallest element) in a rotated sorted array
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;


            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }


            else {
                right = mid;
            }
        }

        return left;
    }
}

/*
I/P-
Enter the number of elements: 8
Enter 8 elements of the rotated sorted array:
9
1
3
6
88
8
4
6
O/P-
The rotation point (smallest element) is at index: 1
 */