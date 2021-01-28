import java.util.*;
public class MaxMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        int[] myArray = new int[10];
        for (int i=0; i<myArray.length;i++){
            myArray[i]=sc.nextInt();
            if (myArray[i]>max){
                max=myArray[i];
            }
            if(myArray[i]<min){
                min=myArray[i];
            }
            
        }
        System.out.println(max+" "+min);
        
        sc.close();
    }
}