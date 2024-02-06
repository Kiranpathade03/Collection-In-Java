import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque <String> Name =new ArrayDeque<>();

        Name.addFirst("kiran"); //add element at the first
        Name.add("shubham"); //add element the last
        Name.addLast("yogesh");
        
        Name.remove(); //remove the first element because th FIFO
        System.out.println(Name);
    }
}
