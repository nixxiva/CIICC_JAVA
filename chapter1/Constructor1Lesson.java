package chapter1;

import javax.naming.NameNotFoundException;

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

class Swan{
    int numEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numEggs = 5;

        System.out.println(mother.numEggs);
    }
}

class Name{
    String first = "Nica";
    String last = "Apolinario";
    String fullName = first + last;

    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println(name1.fullName); 

        name1.first = "Linda";
        name1.last = "Walker";
        System.out.println(name1.fullName); 

        Name name2 = new Name();
        name2.fullName = name1.first + name1.last;

        System.out.println(name2.fullName);

    }

}