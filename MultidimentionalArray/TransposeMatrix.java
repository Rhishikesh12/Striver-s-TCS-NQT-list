package MultidimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter Number of Colums: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Transpose(arr,m,n);
        System.out.println(Arrays.toString(Transpose(arr,m,n)));
        sc.close();
    }

    static int[][] Transpose(int arr[][], int m, int n){
        
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = arr[i][j];
            }
        }
        return res;
    }

    static void display(int[][] arr, int m, int n){
        System.out.println("Genterated Matrix:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
