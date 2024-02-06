import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList <String> Name=new LinkedList<>();

        Name.add("Kiran"); 

        Name.addFirst("Shubham"); //add a string to the first

        Name.addLast("Sanket"); //add string at the last

        Name.add(2,"Vishal");  //add element in user define with the help of index number

        // delete operation

        Name.remove();//delete the first element

        Name.remove(1); //delete element with index

        Name.removeFirst(); //remove the first element

        Name.removeLast(); //remove last element 




      for(String str:Name){
        System.out.println(str);
      }
    }
}
