package activities;

public class CustomException extends Exception{
    private String message;

    CustomException(String msg)
    {
        message = msg;
    }

    @Override
    public String getMessage()
    {
            return message;
    }
}
