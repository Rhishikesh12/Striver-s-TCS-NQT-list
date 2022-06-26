public class Pivot {
    public static void main(String[] args) {

        //  Given Rotated Array
        // We have to find the pivot of an array
        // rewatch the tutorial, concept is not clear yet
        int arr[] = {7,9,1,2,3};
        int n = arr.length;

        System.out.println(pivot(arr, n));
    }

    static int pivot(int[] arr, int n){
        int s = 0;
        int e = n-1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid]>=arr[0]){
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }
}
