import java.util.Arrays;
import java.util.Scanner;

public class MedianOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Median : "+MedianHelper(arr, n));
        sc.close();
    }

    static double MedianHelper(int[] arr, int n){
        Arrays.sort(arr);
        double median;
        
        if(n%2==0){
            int sum = (arr[(n/2)]+arr[(n/2)+1]/2);
            median = sum /2;
        }else{
            median = arr[(n/2)];
        }
        return median;
    }
}
