import java.util.*;

class ReverseArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before reverse : "+Arrays.toString(arr));

        int res[] = UsingTemp(arr);
        System.out.println("Array After reverse : "+Arrays.toString(res));

        // System.out.print("Array After reverse(using for loop) : ");
        // ReverseArr(arr);
        sc.close();
    }

    // static void ReverseArr(int[] a){
    //     for(int i = a.length - 1; i >= 0; i--){
    //          System.out.print(a[i]+" ");
    //     }
    // }

    static int[] UsingTemp(int[] a){
        int p = a.length - 1;
        int temp = 0;
        int middle = a.length/2;

        for(int i = 0; i < middle; i++){
             temp = a[i];
             a[i] = a[p];
             a[p] = temp;
             p--;
        }
        return a;
    }
}