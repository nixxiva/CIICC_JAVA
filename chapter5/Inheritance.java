package chapter5;

import otherFolder.A;

public class Inheritance {

    public static void main(String[] args) {
        FinalParent p1 = new FinalParent();
    }

}

// pag nakafinal ang class bawal ma extend sa ibang class
final class FinalParent{
    int number;
    void getParent(){
    
    }

}

// class ChildClass extends FinalParent {
    
//     void getChildParent(){
//         getParent();
//         System.out.println(number);
//     }
// }

class Animal2  {
    String name;
    int age;

    public Animal2(String name, int age){
        this.name = name;
        this.age = age;
    }
    
}

class Lion extends Animal2{

    int LionId;
    public Lion(String name, int age, int LionId){
        super(name, age);
        this.LionId = LionId;
}

}

class MountainLion extends Lion{
    String locationString;
    public MountainLion(String name, int age, int LionId, String locationString){
        super(name, age, LionId);
        System.out.println(super.name);
    }


}