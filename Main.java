//Class And Object
class Student{
    int id;
    String name;

    void display(){
        System.out.println("hello world"+ id + name);
    }

}

public class Main{
    public static void main(String[]args){
        Student s1= new Student();
        s1.id=1;
        s1.name="Ayan";
        s1.display();
    }
}