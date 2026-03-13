// Method Overriding (Runtime)
// Child class redefines parent method.
//same function into different class

class Animal{
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}
public class functionOveriding {
     public static void main(String[]args){

       Animal A=new Animal();
       Animal D=new Dog(); //--> *****

       A.makeSound();// Output: Animal makes a sound
       D.makeSound();// Output: Dog barks (Runtime Polymorphism)
    }
}
