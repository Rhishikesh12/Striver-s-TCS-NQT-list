import java.util.*;

class Add_Element{

    static int[] AddatEnd(int[] a,int n,int ele){

        int newArr[] = new int[n+1];   // 0 0 0 0 0 0

        for(int i = 0; i < n; i++){
            newArr[i] = a[i];        // 1 2 3 4 5=>n    
        }

        newArr[n] = ele;             // 1 2 3 4 5 0 
        return newArr;

    }

    static int[] AddatPos(int[] a,int n,int ele, int pos){

        int newArr[] = new int[n+1];

        // 1 2 3 4 5 original  
        // 1 2 3 6 4 5 new arr
        // 0 1 2 3 4
        for(int i = 0; i < newArr.length; i++){
        
            if(i < pos - 1){        //insert all elements till the given POSITION  
                newArr[i] = a[i];
            }else if(i == pos - 1){    //insert your "ele" at POSITION
                newArr[i] = ele;
            }else{              // Insert rest of the array        
                newArr[i] = a[i-1];
            }
        }
        return newArr;
    }

    static int[] AddatFront(int[] a,int n,int ele){

        int newArr[] = new int[n+1];
        newArr[0] = ele;

        for(int i = 0; i < n; i++){
            newArr[i+1] = a[i];            // 6 0 0 0 0 0
        }
        return newArr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        System.out.println("Enter Array elements");
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be added:");
        int ele = sc.nextInt();

        System.out.println("Enter Position:");
        int pos = sc.nextInt();

        int ans[] = AddatFront(arr,n,ele);
        int Abc[] = AddatPos(arr,n,ele,pos);
        int Res[] = AddatEnd(arr,n,ele);

        System.out.println("At the End : "+Arrays.toString(Res));
        System.out.println("At the given Position : "+Arrays.toString(Abc));
        System.out.println("At the Front : "+Arrays.toString(ans));
        sc.close();
    }
}