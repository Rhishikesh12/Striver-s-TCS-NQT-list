import java.util.*;

class MinMax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements : ");
        int a[] = new int[n];
        for(int i =0; i < n; i++){
            System.out.print(a[i] = sc.nextInt()); 
        }

        System.out.println("Maximum value in the array is:"+max(a));
        System.out.println("Minimum value in the array is:"+min(a));
        sc.close();
    }

      static int max(int a[]) {
      int max = a[0];
      
      for(int i=0; i<a.length; i++ ) {
         if(a[i]>max) {                      // 2     3    5    6     2 ...1000
            max = a[i];                      // a[1]
         }                                   // max
      }
      return max;                            // Arrays.sort(a); Tc (n.logn)
                                             // TC o(n) SC: o(1);
   }

    static int min(int [] a) {
      int min = a[0];
   
      for(int i = 0; i<a.length; i++ ) {
         if(a[i]<min) {
            min = a[i];
         }
      }
      return min;
   }
}


// 2     1    5    6     2
// 