package chapter1;

import otherFolder.Global1;

public class ReferenceLesson {
    void Sample1(int p){
        int x = 100+p;
        String s = "Hello";
    }

    public static void main(String[] args) {
        Box small = new Box();
        Box small2 = new Box();
        Box small3 = new Box();
        System.out.println(small.numbers[1]);
        System.out.println(small2.numbers[1]);
        System.out.println(small3.numbers[1]);

        //Variable
        //Type - primitive(boolean,char,byte,short,int,long,float and double) or reference(Object, etc)
        //name - lowercase,starts with letters, can also start with and have _ and $ and can have numbers.
        //value - reference - can have a new object and null value; primitive - must have a initial value before using 
        //Type name;
        //Type name = value;
        //Type name,name2,name3;
        //Type name = value,name2 = value,name3;
        
        String zooName;
        int numberAnimals,numberZooWorkers;
        String s1,s2;
        String s3 = "yes", s4 = "no";
        numberAnimals=3;
        System.out.println(numberAnimals);
        ReferenceLesson ref = new ReferenceLesson();
        ref.Sample1(100);//stack3
        ref.Sample1(50);//stack4
        // small = null;
        numberZooWorkers =small.serialNumber;
        float n = Global1.EARTH_GRAVITY;
        // System.out.println(x);

    }
}

class Box{
    int numbers[]= {1,2,3};
    int serialNumber; // default value is 0 if no initial value assigned;
}