import java.util.ArrayList;

class ArrayListExample{
    public static void main(String[] args) {
        
        ArrayList <String> Name=new ArrayList<>();

        Name.add("kiran");
        Name.add("shubham");//add element to the List
        Name.add("Yogesh");
        Name.add(1,"Abhi");//add the element at the user define with the help of index number

        

        System.out.println(Name.get(3));//get number with the help of index

        Name.remove(3); //remove the elemennt at theindex number
        

        Name.set(1, "Abhishek");//replace the value to the index

        Name.clear();

        System.out.println(Name);
    }
}