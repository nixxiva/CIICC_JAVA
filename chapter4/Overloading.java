package chapter4;

public class Overloading {

    public void fly(int numMiles){
        System.out.println("integer");
    }

    public void fly(short numFeet){
        System.out.println("short");
    }

    public void fly(Object obj){
        System.out.println("object");
    }
    public boolean fly(){
        return false;
    }

    void fly(int numMiles, short numFeet){
        System.out.println("int and short");
    }

    public void fly(short numFeet, int numMiles) throws Exception{

    }

    public static void main(String[] args) {
        Overloading oll = new Overloading();
        short s = 1;
        oll.fly(1);
        oll.fly(s);
        oll.fly();
        System.out.println(oll.fly());
        oll.fly(1,(byte)1);
        oll.fly(5.2435);

    }

}
