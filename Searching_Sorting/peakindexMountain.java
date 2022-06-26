public class peakindexMountain {
    public static void main(String[] args) {
        //          0 1 2 3
        int arr[]= {0,1,0};
        int n = arr.length;


        System.out.println("Peak Element is present at the index : "+peakIndex(arr, n));

    }

    static int peakIndex(int arr[], int n){
        int s = 0;
        int e = n-1;

        while(s <= e){
            int mid = s+(e-s)/2;

            if(arr[mid] < arr[mid+1]){
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }
}
