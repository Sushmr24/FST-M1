package activities;

public class MyBook extends Book{

    @Override
    void setTitle(String s) {
        title = s;
    }

    public static void main(String[] args) {
        MyBook newNovel = new MyBook();
        newNovel.setTitle("Invisible Man");
        System.out.println("Book title is : "+ newNovel.getTitle());
    }
}
