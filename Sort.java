import java.util.*;
public class Sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[10];
        for (int i=0; i<myArray.length;i++){
            myArray[i]=sc.nextInt();
        }
        printArray(myArray);
        
        sort(myArray);
        System.out.println();
        printArray(myArray);
        sc.close();
    }

    public static void printArray(int[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if (arr[j]<=arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
    }
}