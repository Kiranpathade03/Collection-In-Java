import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet <String> Name=new HashSet<>();


        Name.add("shhubham");
        Name.add("kiran");
        Name.add("yogesh");
        Name.add("kiran"); //can not get this value 

        // in set can not show duplicate element

        // Name.add("");
        Name.add("Dinesh");


        System.out.println(Name);
    }
}
