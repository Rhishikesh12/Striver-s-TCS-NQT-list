package MultidimentionalArray;

import java.util.Scanner;

/* 
* This code has multiple subPrograms kindly read all the given comments.
* comment down unnessesary code before running the program.
*/ 

public class MatrixOp {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("First Matric:");
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

        System.out.println("Second Matric:");
        int[][] arr2 = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        //Addition if two Matrics
        AdditionOfMatrices(arr,arr2,m,n);


        //Sum of indivisual row and column
        for(int i = 0; i < m; i++){
            int sumRow = 0 , sumCol = 0;
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+ " ");
                sumRow += arr[i][j];
                sumCol += arr[j][i];
            }
            System.out.print("Row Sum: "+sumRow+" ");
            System.out.println("Col Sum: "+sumCol);
        }

        sc.close();
    }

    static int[][] AdditionOfMatrices(int arr[][], int arr2[][], int m,int n){

        int[][] res = new int[m][n];
        System.out.println("Result Matrics: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n;j++){
                res[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        return res;
    }

}
