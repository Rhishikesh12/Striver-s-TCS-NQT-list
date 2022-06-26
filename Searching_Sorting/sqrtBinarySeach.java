import java.util.Scanner;

public class sqrtBinarySeach {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        
        long i = sqrt(n);
        System.out.println(decimalNumbers(n, 3, i));
        sc.close();
    }

    static long sqrt(int x){
        long  s = 0;
        long  e = x;
        long  ans = -1;

        while(s < e){                    //traversing search space s is start and e is end.
            long  mid = s+(e-s)/2;

            long  sq = mid * mid;

            if(sq == x){
                return mid;
            }

            if( sq < x){
                ans = mid;
                s = mid+1;
            }else if(sq > x){
                e = mid - 1;
            }   
        }
        return ans;
    }
     // not workiing properly
    static double decimalNumbers(int x, int precision, long sol){
        int factor = 1;
        long ans = sol;

        for(int i = 0; i < precision;i++){
            factor= factor / 10;
            for(long j = ans; j*j < x; j+=factor){
                ans = j;
            }
        }
        return ans;
    }
}
