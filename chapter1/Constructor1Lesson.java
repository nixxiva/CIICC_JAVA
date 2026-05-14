package chapter1;

public class Constructor1Lesson {
    public static void main(String[] args) {
        
        Chick chick1 = new Chick();

        chick1.sayChick();

        Chicken andoks = new Chicken();

        System.out.println(andoks.name);
    }
}

class Chick{
    public Chick(){

        System.out.println("I am a constructor - new chick object");
    }



    void sayChick(){
        System.out.println("Hello, I am a chick");
    }

}


class Chicken{

    int numEggs = 0;
    String name;

    public Chicken(){
        name = "Duke";  
    }
}