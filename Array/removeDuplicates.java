import java.util.HashSet;
// import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        // also do the Leetcode Problem "Contains Duplicates"
        int arr [] = {2,2,1,4,5};

        RemoveDup(arr);
    }

    static void RemoveDup(int arr[]){

        HashSet<Integer> set = new HashSet<>();   //o(1)

        for(int no: arr){
            if(set.add(no)==false){
                System.out.println(no+"");
            }
        }

        // for(int i = 0; i < arr.length; i++){
        //     set.add(arr[i]);
            
        // }
        // System.out.println(set);

        // int k = set.size();
        // int j = 0;
        // for( int x: set){
        //     arr[j++] = x;
        // }

        // return k;
    }
}
