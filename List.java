import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        java.util.List<Integer> Name = new ArrayList<>();

        Name.add(1);
        Name.add(4);
        Name.add(5);
        Name.add(57);
        Name.add(59);

        System.out.println(Name);

        java.util.List<Integer> Name1 = new LinkedList<>();

        Name1.add(3);
        Name1.add(34);
        Name1.add(342);
        Name1.add(34222);
        Name1.add(102);

        System.out.println(Name1);

        java.util.List Name2 = new ArrayList<>();

        Name2.add(23);
        Name2.add("kiran");
        Name2.add(23);

        System.out.println(Name2);

        //for each loop

        for (int i : Name) {
            System.out.println(i);
        }

        
    }
}
