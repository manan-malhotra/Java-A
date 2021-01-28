import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[10];
        for (int i=0; i<myArray.length;i++){
            myArray[i]=sc.nextInt();
        }
        printArray(myArray);
        
        myArray=reverse(myArray);
        System.out.println();
        printArray(myArray);
        sc.close();
    }

    public static void printArray(int[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] reverse(int[] arr){
        int[] reversearr = new int[arr.length];
        for (int i=0; i<arr.length;i++){
            reversearr[arr.length-i-1]=arr[i];
        }
        return reversearr;
        
    }

}
