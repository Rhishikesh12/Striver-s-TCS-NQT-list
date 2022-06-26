public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {19,28,3,47,57,1};

        insertionsort(arr);
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void insertionsort(int arr[]){

        for(int i = 1; i < arr.length ; i++){
            int temp = arr[i];
            int j = 0;
            for(j = i - 1; j >= 0; j--){

                if(arr[j]>temp){
                    arr[j+1] = arr[j];  // shifting j to right by 1 postion   1 7 [8](after) 10 ==> 8(before)
                }else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
}
/*
 * we dont swap in insertion Sort, we shift elements and insert the element in blank position.
 *   for example:
 * 
 *  you have arr[] = {10 1 7 4 8 2 11}
 * 
 *  round 1:          1 < 10 
 *                    shift 10 to right --> and place 1 to the blank position.
 *                    1 | 10 7 4 8 2 11
 *              sorted  | unsorted
 * 
 *  round 2:          7 < 10
 *                    7 > 1
 *                    shift 10 to right --> and place 7 to the blank position.
 *                    1 7 | 10 4 8 2 11
 *                 sorted | unsorted
 * 
 *  round 3:          4 < 10 
 *                    4 <  7
 *                    1 >  4
 *                    shift 10 to right --> and place 7 to the blank position.
 *                    1 7 4 | 10 8 2 11
 *                   sorted | unsorted
 * 
 *                   So on .......
 * 
*/