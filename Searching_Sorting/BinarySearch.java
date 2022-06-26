public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {34,2,6,43,2};
        int key = 43;

        System.out.println(binarySeach(arr, key));
    }

    static int binarySeach(int[] arr, int key){
        int s = 0;
        int e = arr.length-1;

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
}
