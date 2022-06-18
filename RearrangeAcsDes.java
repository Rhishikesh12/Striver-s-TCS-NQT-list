import java.util.Arrays;
import java.util.Scanner;

public class RearrangeAcsDes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }

        Rearrange(a,n);

        sc.close();
    }

    static int[] Rearrange(int[] a, int n){

        Arrays.sort(a);

        for(int i = 0; i < n/2; i++){
            System.out.print(a[i]+" ");
        }

        for(int j = a.length-1; j >= n/2; j--){
            System.out.print(a[j]+" ");
        }

        return a;
    }
}