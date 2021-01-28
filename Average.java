import java.util.*;
public class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] myArray = new int[10];
        for (int i=0; i<myArray.length;i++){
            myArray[i]=sc.nextInt();
            sum+=myArray[i];
        }
        System.out.println((double)sum/myArray.length);
        sc.close();
    }
}