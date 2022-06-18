package MultidimentionalArray;

import java.util.Scanner;

public class ReverseRows {
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

        ReverseMatrixRows(arr,m,n);
        sc.close();
    }
    static int[][] ReverseMatrixRows(int[][] arr, int m, int n){

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }
        Display(arr);
        return arr;
    }

    static void Display(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        System.out.println("Genterated Matrix:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
