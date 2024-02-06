import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack <String> Name=new Stack<>();

        Name.push("Kiran");
        Name.push("yogesh");
        Name.push("vinay"); //add element 
         

        Name.pop();//remove element last element remove because the LIFO 
        

System.out.println(Name);
    }
}
