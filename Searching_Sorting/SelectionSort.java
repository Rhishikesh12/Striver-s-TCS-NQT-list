public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {19,28,3,47,57,1};

        selectionSort(arr);
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1;i++){
            int minValue = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minValue] > arr[j]){
                    minValue = j;
                }
            }
                int temp = arr[minValue];
                arr[minValue] = arr[i];
                arr[i] = temp;
        }
    }
}
