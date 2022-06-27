import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position till you want to print Fabonacci Series: ");
        int n = sc.nextInt();

        System.out.println(fact(n));
        sc.close();
    }

    static int fact(int n){

        //base condition
        if(n == 0){
            return 1;
        }

        return n * fact(n-1);

    }
}
