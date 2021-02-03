import java.util.*;

public class LinkedLists{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> krsna = new ArrayList<String>();
        ArrayList<String> karma = new ArrayList<String>();
        ArrayList<String> raftaar = new ArrayList<String>();
        LinkedList<ArrayList<String>> album = new LinkedList<ArrayList<String>>();
        krsna.add("Mukabla");
        krsna.add("Dekh kon aaya");
        krsna.add("Living Legend");
        karma.add("Sucess");
        karma.add("Best nai");
        karma.add("Take Diss");
        raftaar.add("Drama");
        raftaar.add("Popular");
        raftaar.add("Swag mera desi");
        album.add(krsna);
        album.add(karma);
        album.add(raftaar);
        ListIterator<ArrayList<String>> i = album.listIterator();
        while (i.hasNext()){
            // System.out.println(i.next());
            ArrayList<String> x = i.next();
            for (int j=0; j<3;j++){
                System.out.println(x.get(j));
            }
        }
        sc.close();
    }
}