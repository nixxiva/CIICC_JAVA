package chapter1;

import java.util.*;
import otherFolder.*;

public class Main{
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        A a = new A();
        B b;
        C c;
        otherFolder.a.Makahiya makahiya;
        toy1.brand="";
        toy1.name="";
        toy1.price=0;
        toy1.quantity=12;
        Random r = new Random();
        ArrayList p;
        Scanner o;
        System.out.println(r.nextInt());
        // toy1.setPrice(price);
        System.out.println("Main");

        System.out.println(a.msg);


    }
}

//Flight-id
//Plane-type
//Cap
//Crew
//Passengers
//Person-id,Name
//Name-first,Lastname
//Lastname-id
