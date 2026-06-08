package chapter4;

import java.util.Collection;

public class VarArgsLesson {
    int counter;

    public static float marsGravity = 3.72f;

    public int sumOfAllNums(int... y){

        int sum = 0;
        for(int num: y)
            sum += num;
        return sum;

    }

    public int sumOfAllNums2(int p, int... y){

        int sum = 0;
        for(int num: y)
            sum += num;
        return sum;

    }

    public static float getEarthsGravity(){
        return 9.8f;

    }


    public static void main(String[] args) {

        VarArgsLesson vl = new VarArgsLesson();
        VarArgsLesson vl2 = new VarArgsLesson();

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(vl.sumOfAllNums(1,2,3,4,5,6,7,8,9,10));
        System.out.println(vl.sumOfAllNums(a));
        System.out.println(vl.sumOfAllNums2(0, a));

        System.out.println(getEarthsGravity());
        System.out.println(marsGravity);
    }

}
