package activities;

public class Activity8 {
    public static void main(String[] args) {
        Activity8 act = new Activity8();
       try {
           act.exceptionTest("there is no exception");
           act.exceptionTest(null);
       }catch (CustomException cus)
       {
           System.out.println("Catch block : " +cus.getMessage());
       }
    }

    public void exceptionTest(String str) throws CustomException
    {
        if (str == null)
        {
            throw new CustomException("String is null");
        }
        else
        {
            System.out.println("String is : "+str);
        }
    }
}
