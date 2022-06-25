import java.util.Scanner;

public class frequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        BruteForce(arr ,n);
        Optimal(arr, n);

        sc.close();
    }
    static void BruteForce(int[] arr, int n){

        boolean visited[] = new boolean[n];  // [f,f,f,f,f,f] 

        for(int i = 0; i < n; i++){
            if(visited[i] == true){          // if pointer is pointing a[0] set it as true in visited array
                continue;
            }

            int count = 1;
            for(int j = i + 1; j < n;j++){   // then search for next similar element 
                if(arr[i] == arr[j]){        
                    visited[j] = true;
                    count++;
                }                            /* 
                                                compare other elements with selected element if both are same then set it as 
                                                true and increase counter
                                             */
            }
            System.out.println("Count of "+arr[i]+" is: " + count);
        }
    }

    static void Optimal(int[] arr, int n){

    }
}
