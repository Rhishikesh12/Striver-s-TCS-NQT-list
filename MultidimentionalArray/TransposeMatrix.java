package MultidimentionalArray;

import java.util.Scanner;

/*

Watch Jennys lecture C-56,57,58,59,60,61

*/ 

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
        sc.close();
    }

    static int[][] Transpose(int arr[][], int m, int n){
        
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = arr[j][i];
            }
        }
        display(res);
        return res;
    }

    static void display(int[][] res){
        int m =res.length;
        int n = res[0].length;
        System.out.println("Genterated Matrix:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(res[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
