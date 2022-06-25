
/**
 * LastAndFirstOccurrence
 */
public class LastAndFirstOccurrence {

    public static void main(String[] args) {
        int arr[] = {2,3,3,3,3,5,4};
        int size = arr.length;
        int key = 3;

        System.out.print(firstPos(arr,size,key)+" ");
        System.out.print(lastPos(arr,size,key));
    }
        
        static int firstPos(int[] arr, int n, int k){
            int s = 0;
            int e = n-1;
            int mid = s+(e-s)/2;
            int ans = 0;
            
            while(s<=e){
                if(arr[mid] == k){
                    ans = mid;
                    e = mid-1;
                }else{
                    s = mid + 1;
                }
                 mid = s+(e-s)/2;
            }
            return ans;
        }
        
        static int lastPos(int[] arr, int n, int k){
            int s = 0;
            int e = n-1;
            int mid = s+(e-s)/2;
            int ans = 0;
            
            while(s<=e){
                if(arr[mid]== k){
                    ans = mid;
                    s = mid + 1;
                }else{
                    e = mid-1;
                }
                 mid = s+(e-s)/2;
            }
            return ans;
        }
    
}