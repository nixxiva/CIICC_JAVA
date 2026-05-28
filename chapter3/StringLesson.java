package chapter3;

public class StringLesson {

    public static void main(String[] args) {

        String name = "fluffy";
        String a = "1";
        a  = "0";
        a += "2";
        a += "3";

        String b = "1";
        String name2 = "fluffy";

        name = null;
        name2 = null;

        String name3 = new String("fluffy");

        System.out.println(a);

        // String lower to upper case
        String word1 = "Stand Alone";
        System.out.println(word1.toUpperCase());
        System.out.println(word1.toLowerCase());
        System.out.println(word1);

        String trimSample = "               \t \n \t  Nica    \t \n ";
        System.out.println(trimSample);
        System.out.println(trimSample.trim());        

    }
}
