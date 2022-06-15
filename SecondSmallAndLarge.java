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
        Optiomal(arr,n);

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
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0;i < n;i++)
        {
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }
        for (i = 0;i < n;i++)
        {
            if (arr[i] < second_small && arr[i] != small)
            {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        System.out.println("Second smallest is "+second_small);
        System.out.println("Second largest is "+second_large);
    }

    static void Optiomal(int[] arr, int n){
        



    }
}