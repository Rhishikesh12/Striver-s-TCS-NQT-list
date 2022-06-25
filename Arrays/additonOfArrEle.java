import java.util.*;

class additonOfArrEle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }

        int ans = count(a);
        System.out.print(ans);
        sc.close();
    }

    static int count(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}