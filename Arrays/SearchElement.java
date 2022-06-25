import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Key to search:");
        int k = sc.nextInt();

        // SearchElementHelper(a,n,k);

        Search(a,n,k);
        sc.close();
    }

    // static void SearchElementHelper(int[] a, int n, int k){
    //     int low = 0, high = n - 1;
    //     int ans = -1;
    //     while (low <= high) {
    //         int mid = (low + high) / 2;
    //             if (a[mid] > k) {
    //                 high = mid - 1;
    //             } else if (a[mid] < k) {
    //                 low = mid + 1;
    //             } else {
    //                 ans = mid;
    //                 break;
    //             }
    //     }
    // }

    static void Search(int[] a, int n, int k){

        for(int i = 0; i < n; i++){
            if(a[i] == k){
                System.out.println("Key index is : "+ i);
            }
        }
    }
}
