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

        // Transpose(arr,m,n);
        inplaceTranspose(arr);
        sc.close();
    }


    // Done Using Extra Space or We have used here extra 2D array to Store Result/ Transposed matrix.
    // static int[][] Transpose(int arr[][], int m, int n){
        
    //     int[][] res = new int[n][m];
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             res[i][j] = arr[j][i];
    //         }
    //     }
    //     display(res);
    //     return res;
    // }

    static int[][] inplaceTranspose(int arr[][]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
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

    // static void display(int[][] res){
    //     int m =res.length;
    //     int n = res[0].length;
    //     System.out.println("Genterated Matrix:");
    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             System.out.print(res[i][j]+ " ");
    //         }
    //         System.out.println("");
    //     }
    // }
}
