public class SearchInRotatedArray {
    public static void main(String[] args) {
        //           0 1 2 3 4
        int arr[] = {7,9,1,2,3};
        int n = arr.length;
        int key = 3;

        
        System.out.println(SearchRotated(arr, n, key));

    }

    static int pivot(int[] arr, int n){
        int s = 0;
        int e = n-1;

        while(s < e){
            int mid = s + (e-s)/2;

            if(arr[mid]>=arr[0]){
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }


    static int binarySeach(int[] arr,int start, int n, int key){
        int s = start;
        int e = n;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] == key){
                return mid;
            }else if(key > arr[mid]){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return -1;
    }
    

    static int SearchRotated(int[] arr, int n, int key){
        int pivot = pivot(arr,n);
        int s = 0;
        int e = n-1;

            if(arr[pivot] <= key && arr[e] >= key){
                return binarySeach(arr,pivot,n-1,key);
            }else{
                return binarySeach(arr,s,pivot-1,key);
            }
    }
}
