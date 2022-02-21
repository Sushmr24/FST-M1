package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] data = {10, 77, 10, 54, -11, 10};
        int count = 0;

        for(int i = 0; i< data.length ; i++)
        {
            if (data[i] == 10)
            {
                count+=data[i] ;
            }
        }
        if(count == 30)
        {
            System.out.println("Sum of 10's in the array is 30 ");
        }
        else
        {
            System.out.println("Sum of 10's in the array is either grater than or less than 30");
        }
    }
}