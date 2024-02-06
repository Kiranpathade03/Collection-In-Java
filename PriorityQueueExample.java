import java.util.PriorityQueue;

public class PriorityQueueExample {
  public static void main(String[] args) {
    PriorityQueue <String> Name=new PriorityQueue<>();

Name.offer("Kiran"); //adding element 

Name.add("Shubham"); //adding element 

Name.poll(); //removed the first element because FIFO

System.out.println(Name.size()); //return size of queue

System.out.println(Name);
  }   
}
