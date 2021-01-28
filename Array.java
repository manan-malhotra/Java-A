import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[10];
        for (int i=0; i<myArray.length;i++){
            myArray[i]=sc.nextInt();
        }
        printArray(myArray);
        sc.close();
    }

    public static void printArray(int[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}