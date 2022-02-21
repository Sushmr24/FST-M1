package activities;

public class Activity12 {

    public static void main(String[] args) {
        Addable addable1 = (a,b) -> (a + b);
        System.out.println(addable1.add(10,20));

        Addable addable2 = (int a, int b) ->{ return a+b; } ;
        System.out.println(addable2.add(20,30));

    }
}
