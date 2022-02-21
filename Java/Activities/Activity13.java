package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("enter the numbers ");
        while (scan.hasNextInt())
        {
            list.add(scan.nextInt());
        }

        int index = indexGen.nextInt(list.size());
        System.out.println("Index value generated: " + index);
        System.out.println("Value in array at generated index: " + list.get(index));


        Integer nums[] = list.toArray(new Integer[0]);
        int index2 = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index2);
        System.out.println("Value in arary at generated index: " + nums[index2]);

        scan.close();


    }
}
