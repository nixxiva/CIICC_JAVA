package chapter4;

public class Constructors {

    Bunny bunny1 = new Bunny("Bugs");
    Bunny bunny2 = new Bunny("Lola");
    Hamster hamster1 = new Hamster(2);
    Hamster hamster2 = new Hamster(2, "white");

}

class Bunny{

    String name;
    
    public Bunny(String name){
        this.name = name;
        System.out.println("This is Bunny Constructor.");
    }

}

// OVERLOADING CONSTRUCTOR
class Hamster{ 
    private String color;
    private int weight;

    public Hamster(int weight){ //first constructor
        // this.weight = weight;
        // color = "brown";

        this(weight, "brown");

    }

    public Hamster(int weight, String color){ //second constructor
        this.weight = weight;
        this.color = color; 
    }
}