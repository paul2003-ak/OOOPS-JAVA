//  Abstract Class

// An abstract class cannot create objects.

// It can contain:
// 	•	abstract methods (no body)
// 	•	normal methods

abstract class Animal{
    abstract void sound();//no body
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Abstruction {
    public static void main(String[]args){
       Dog d=new Dog();
       d.sound(); // Dogs barks
    }
}


//Interface
// Interface is 100% abstraction.
interface Jungle{
    void sound();
}
class cat implements Jungle{
    public void sound(){
        System.out.println("Dog barks");
    }
}

