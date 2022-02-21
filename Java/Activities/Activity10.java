package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("apple");
        hs.add("bat");
        hs.add("cat");
        hs.add("dog");
        hs.add("elephant");
        hs.add("fish");

        System.out.println("Size of the set is : "+hs.size());

        hs.remove("cat");

        if(hs.remove("gun")) {
            System.out.println("gun removed from the Set");
        } else {
            System.out.println("gun is not present in the Set");
        }

        System.out.println("is Dog is in set : "+hs.contains("dog"));
        System.out.println("Set values are : "+hs);

        }
}
