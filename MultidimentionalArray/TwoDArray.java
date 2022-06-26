import java.util.Scanner;

public class TwoDArray {
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

        // printing
        int sum = 0;
        System.out.println("Genterated Matrix:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+ " ");
                sum += arr[i][j];
            }
            System.out.println("");
        }
        System.out.println("Sum of Matrix is : "+sum);
        sc.close();
    }
}
