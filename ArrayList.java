import java.util.*;
 class Main{
    public static void main(String[] args) {
        ArrayList<String> wishlist = new ArrayList<String>();
        wishlist.add("Car");
        wishlist.add("Bike");
        wishlist.add("Jordans");
        System.out.println(wishlist.toString());
        System.out.println(wishlist.size());
        for (int i =0; i<wishlist.size();i++){
            System.out.println(wishlist.get(i));
        }
        wishlist.set(1, "SuperBike");
        System.out.println(wishlist.toString());
        System.out.println(wishlist.indexOf("SuperBike"));
        System.out.println(wishlist.contains("SuperBike"));
        wishlist.remove(1);
        System.out.println(wishlist.toString());
        System.out.println(wishlist.indexOf("SuperBike"));
        System.out.println(wishlist.contains("SuperBike"));
        System.out.println(wishlist.toString());


    }
}