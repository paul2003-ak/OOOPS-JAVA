class Student{
    int id;
    String name;

    //constructor
    Student(int id,String title){
        this.id=id;
        this.name=title;
    }

    void display(){
        System.out.println("ha ha ha ha ..");
    }
}

public class constructor {
    public static void main(String[]args){
        Student s1=new Student(1,"Ayan");
        s1.display();
    }
}
