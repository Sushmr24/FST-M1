package activities;

public class Activity4 {
    public static void main(String[] args) {
        int[] array = {25, 20,10,30, 5};
        for (int j : array) {
            System.out.print(j + " ");
        }

        sort(array);
        System.out.println();
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] array){
        for (int i = 0 ; i < array.length ; i++)
        {
            int index = i;
            for (int j = i+1 ; j < array.length ; j ++)
            {
                if (array[j] < array[i])
                {
                    index  = j;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;

        }
    }
}