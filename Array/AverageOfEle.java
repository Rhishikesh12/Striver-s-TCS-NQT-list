import java.util.Scanner;

public class AverageOfEle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Average is : "+Average(arr,n));
        sc.close();
    }

    static double Average(int arr[], int n){
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        double result = sum / n;
        return result;
    }
}