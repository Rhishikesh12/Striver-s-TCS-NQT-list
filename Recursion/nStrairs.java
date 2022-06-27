import java.util.Scanner;

public class nStrairs {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the position of stair you want to go : ");
            int n = sc.nextInt();
    
            System.out.println(stairs(n));
            sc.close();
        }
    
        static int stairs(int x){
    
            //base condition
            if(x == 0) return 0;           //fibonacci series starts from 0.....
            if(x == 1) return 1;
    
            return stairs(x-1)+stairs(x-2);
        
        }
}
