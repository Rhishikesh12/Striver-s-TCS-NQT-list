import java.util.*;

class MinMax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i =0; i < n; i++){
            System.out.print(a[i] = sc.nextInt()); 
        }

        System.out.println("Maximum value in the array is:"+max(a));
        System.out.println("Minimum value in the array is:"+min(a));
        sc.close();
    }

    public static int max(int [] a) {
      int max = 0;

      for(int i=0; i<a.length; i++ ) {
         if(a[i]>max) {
            max = a[i];
         }
      }
      return max;
   }

   public static int min(int [] a) {
      int min = a[0];
   
      for(int i = 0; i<a.length; i++ ) {
         if(a[i]<min) {
            min = a[i];
         }
      }
      return min;
   }
}