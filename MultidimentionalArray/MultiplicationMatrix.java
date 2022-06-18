package MultidimentionalArray;

import java.util.Scanner;

/*
 * This code has multiple subPrograms kindly read all the given comments.
 * comment down unnessesary code before running the program.
 * 
 *                                              : Notes :
 * 
 * Multiplication of two diffrent dimension matrix cant be done.
 * for eg. 
 *     --> if first matrix is of dimension 3x3 and other one is of 2x3. multiplication cant be done on this matrix.
 *         cause here colums of first matrix is 3 and row of second matrix is 2.
 * 
 *     --> if column of first matrix is 3 and row of second matrix is 3 then multiplication can be done.
 * 
 *   Representation of matrix:
 * 
 *   First Case:
 *      | 1 5 6 |                       | 1 2 3 |
 *      | 2 2 5 |                       | 0 1 5 | (2)x3 --> row        in this case multiplication cant be done.
 *      | 1 7 5 | 3x(3)--> column  
 * 
 *   Second Case:
 * 
 *      | 1 5 6 |                       | 1 2 |
 *      | 2 2 5 |                       | 0 1 | (3)x2 --> row        in this case multiplication can be done.
 *      | 1 7 5 | 3x(3)--> column       | 2 1 |
 * 
 *      colums of first matrix must be equal to rows of second matrix.
 * 
 *      A(m x n) x B(p x q)     // if(n==p)  resultant matrix(m x q)
 *      
*/

public class MultiplicationMatrix {
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
        System.out.println("Enter Number of rows: ");
        int x = sc.nextInt();
        System.out.println("Enter Number of Colums: ");
        int y = sc.nextInt();
        int[][] arr2 = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        
        MultiplicationOfMatrices(arr,arr2,m,n,x,y);

        sc.close();
    }

    static int[][] MultiplicationOfMatrices(int arr[][], int arr2[][], int m,int n,int x, int y){

        if(n!=x){
            return new int[0][0];
        }

        int[][] res = new int[m][y];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < y;j++){
                int sum = 0;
                for(int k = 0; k < m;k++){
                    sum = sum + arr[i][k]* arr2[k][j];
                    
                }
                res[i][j] = sum;
            }
        }
        Display(res);

        return res;
    }

    static void Display(int[][] res){
        int m = res.length;
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
