package activities;

import java.util.ArrayList;

public class Activity9 {


    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("name1");
        array.add("name2");
        array.add("name3");
        array.add("name4");
        array.add("name5");

        for (String s : array)
        {
            System.out.println("Name of the person : " +s);
        }

        System.out.println("Third name is : "+array.get(2));
        System.out.println("is name2 is in array "+ array.contains("name2"));
        System.out.println("Size of the array is "+ array.size());

        array.remove("name3");

        System.out.println("Size of the array after remove " + array.size());

    }
}
