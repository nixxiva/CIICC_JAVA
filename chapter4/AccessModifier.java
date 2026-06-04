package chapter4;

public class AccessModifier{

    public void greetMe(){
        System.out.println("Hello from JAVA people");
    }

// accessible by same class
    private void greetMe2(){
        System.out.println("Hello from JAVA private person");
    }

// accessible within same package or folder or subclass/ naka inherit 
    protected void greetMe3(){
        System.out.println("Hello from JAVA protected person");
    }

// accessible within same package or folder, bawal kahit naka extend or subclass
    void greetMe4(){
        System.out.println("Hello from JAVA default person");
    }

    public static void main(String[] args) {
        AccessModifier acm1 = new AccessModifier();

        acm1.greetMe();
        acm1.greetMe2();
        acm1.greetMe3();
        acm1.greetMe4();
    }


}

class ClassZ {
    
    public static void main(String[] args) {
        
        AccessModifier acm1 = new AccessModifier();
        acm1.greetMe();

        // hindi pwede
        // acm1.greetMe2();
        acm1.greetMe3();
        acm1.greetMe4();
    }
   
}