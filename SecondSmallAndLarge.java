import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallAndLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        Bruteforce(arr,n);

        NotOptimal(arr,n);

        sc.close();
    }

    static void Bruteforce(int[] arr, int n){
        Arrays.sort(arr);
        int b = arr[1];
        int a = arr[n-2];

        System.out.println("Second Smallest Number is:" + b);
        System.out.println("Second Largest Number is:" + a);
    }

    static void NotOptimal(int[] arr, int n){
        
    }
}