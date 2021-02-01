import java.util.*;
class auto{
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for (int i =0; i<10;i++){
            intArr.add(i*(4*88));
        }
        for (int i =0; i<10;i++){
            System.out.print(intArr.get(i)+" ");
        }
        System.out.println();
        System.out.println(intArr.toString());

    }
}