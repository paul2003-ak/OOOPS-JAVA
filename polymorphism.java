// Method Overloading (Compile time)
//Function overloading

//it is Same function name, different parameters.

class Math{

    int add(int x, int y){
        return x+y;
    }

    int add(int x, int y, int z){
        return x+y+z;
    }

}


public class polymorphism {
    public static void main(String[]args){

        Math m=new Math();
        m.add(1,2,3);  //-> 6
    }
}
