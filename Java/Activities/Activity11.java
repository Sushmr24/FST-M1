package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> colours = new HashMap<>();
        colours.put(1,"red");
        colours.put(2,"blue");
        colours.put(3,"green");
        colours.put(4,"yellow");
        colours.put(5,"white");

        colours.remove(4);

        if(colours.containsValue("green"))
        {
            System.out.println("Colours map contains Green colour ");
        }
        else
        {
            System.out.println("Colours map doesn't contains Green colour");
        }

        System.out.println("Size of the map is " + colours.size());
    }
}

