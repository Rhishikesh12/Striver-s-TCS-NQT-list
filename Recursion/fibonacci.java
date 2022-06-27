import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position till you want to print Fabonacci Series: ");
        int n = sc.nextInt();

        System.out.println(fabo(n));
        sc.close();
    }

    static int fabo(int x){

        //base condition
        if(x == 0) return 0;           //fibonacci series starts from 0.....
        if(x == 1) return 1;

        return fabo(x-1)+fabo(x-2);
    }
}
