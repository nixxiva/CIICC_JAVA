package chapter3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLesson {

public static void main(String[] args) {
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(2);
    list2.add(3);
    list2.add(4);
    list2.add(5);
    System.out.println(list2.add(2));
    list2.add(0,10);
    System.out.println(list2);

    List nums2 = Arrays.asList(8,7,2,3,4,1,9,5,6);
    Collections.sort(nums2);
    System.out.println(nums2);
    Collections.reverse(nums2);
    System.out.println(nums2);
    Collections.shuffle(nums2);
    System.out.println(nums2);

    }
}
