import java.util.*;
public class Vectors{
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        for(int i=0;i<10;i++){
            v.add(i);
        }
        for(int i=0;i<10;i++){
            System.out.print(v.get(i)+"  ");
        }
    }
}