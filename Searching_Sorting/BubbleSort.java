public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {19,28,3,47,57,1};

        bubbleSort(arr);
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    static void bubbleSort(int arr[]){
        for(int i = 1; i < arr.length; i++){

            for(int j = 0; j < arr.length-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
