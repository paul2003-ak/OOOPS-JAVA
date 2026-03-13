// Hide data using private variables.

class Student{
    private int id;

    public void setId(int data){
        this.id=data;
    }
    public int getId(){
        return id;
    }
}
public class Encapsulation {
    public static void main(String[]args){
        Student s=new Student();
        s.setId(10);
        s.getId();
    }
}
