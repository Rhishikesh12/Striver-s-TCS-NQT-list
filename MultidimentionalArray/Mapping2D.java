package MultidimentionalArray;

import java.util.Scanner;


/*
    int arr[][] = {{1,3,4},{4,5,3},{5,6,7}};
    System.out.println(arr[1][2]);
*/ 

public class Mapping2D {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter Number of Colums: ");
        int n = sc.nextInt();

        System.out.println("Enter Array Elements Row and Column wise: ");
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        AcceseElement(arr,m,n);
        sc.close();
    }

    static void AcceseElement(int[][] arr, int m, int n){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row value: ");
        int x  = sc.nextInt();
        System.out.println("Enter column value: ");
        int y  = sc.nextInt();

        System.out.println("your element is "+ arr[x][y]);

        sc.close();
    }
}
