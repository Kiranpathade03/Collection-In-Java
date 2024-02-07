import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map Name = new HashMap<>();

        Name.put(101, "kiran");
        Name.put(102, "sanket");
        Name.put(103, "yogesh");
        Name.put(104, "Shubham");// add element

        // Name.clear(); //clear the map

        System.out.println(Name.containsKey(106)); // return true or false if the key available on the hashmap

        System.out.println(Name.containsValue("yogesh")); /// return true or false if the value available on the hashmap

        System.out.println(Name.get(103)); // get value with the help of key

        Name.remove(102); // remove a element of the key

        System.out.println(Name.size()); // get the size

        Name.replace(103, "abhi");

       

    }
}
