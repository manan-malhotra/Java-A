import java.util.*;
class auto{
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for (int i =0; i<10;i++){
            intArr.add(i); //Autoboxing intArr.add(Integer.valueOf(i))
        //    intArr.add(Integer.valueOf(i));
        }
        for (int i =0; i<10;i++){
            System.out.print(intArr.get(i)+" "); // intArr.get(i).intValue();
            // System.out.println(intArr.get(i).intValue());
        }
        System.out.println();
        System.out.println(intArr.toString());

    }
}