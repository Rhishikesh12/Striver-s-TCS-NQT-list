import java.util.Scanner;

public class MazximumProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        System.out.println("Enter Array elements");
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        BruteForce(arr);
        OptimalBruteForce(arr);
        // Optimal(arr);

        sc.close();
    }

    private static int BruteForce(int arr[]){
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            for(int j = i+1; j < arr.length; j++){
                int prod = 1;
                for(int k =i; k<=j;k++){
                    prod = prod * arr[k];
                }
                result = Math.max(result,prod);
            }
        }
        // System.out.println(result);
        return result;
    }

    static int OptimalBruteForce(int arr[]){

        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int p = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                result = Math.max(result, p);
                p = p * arr[j];
            }
            result = Math.max(result, p);
        }
        // System.out.println(result);
        return result;
    }

    // static int Optimal(int arr[]){

        
    // }

}

/*
 *      [1 2 -3 0 -4 -5]
 *        2 -3      20
 *         -6   
 *    
 *      0 1  2 3  4  5
 * arr  1 2 -3 0 -4 -5
 *        i
 *        k    j
 * 
 *        2  
 * 
 * // second approach
 *      1 2 -3 0 -4 -5
 *      i j
 *    res 1
 *      p 2
 * 
 *    res: 2
 * 
 * 
 */
