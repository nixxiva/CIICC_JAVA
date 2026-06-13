package chapter4;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    java.util.Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
        System.out.println(set.add(66)); // true
        System.out.println(set.add(66)); // false
        System.out.println(set.size()); // 1
        set.remove(66);
        System.out.println(set.isEmpty()); // true
    }
}
