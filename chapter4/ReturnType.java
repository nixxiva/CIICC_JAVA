package chapter4;

import java.lang.invoke.StringConcatException;

public class ReturnType {

    void startEngine(){
        System.out.println("Engine is running");
    }

    int getAge(){
        return (byte)23;
    }

    Avocado getAvocado(){
        return null;
    }

    boolean oddOrEven(int a){
        // boolean result = (a % 2 == 0) ? true : false;
        // return result;

        return ((a % 2) == 0) ? true : false;
    }

    int addTwoNumbers(int a, int b){
        return a + b;
    }

    // OPTIONAL EXCEPTION
    int compareTwoStrings(String a, String b) throws StringConcatException{
        return 0;
    }

    int compareThreeStrings(String a, String b, String c) throws StringConcatException, IndexOutOfBoundsException{
        return 0;
    }

    // METHOD BODY

    void emptyBody(){} 

    void withBody(){
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        ReturnType rt = new ReturnType();
        System.out.println("Good Morning, you are now " + rt.getAge() + " years old.");

        int y = 123230, z = 1;
        System.out.println("Is the value " + y + " even number?: " + rt.oddOrEven(y));

        System.out.println("a = " + y + "\nb = " + y + "\n a + b = " + rt.addTwoNumbers(y, z));

        Avocado avocado = new Avocado();
        rt.getAvocado();
    }
}

class Avocado{


}