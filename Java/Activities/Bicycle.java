package activities;

public class Bicycle implements BicycleParts,BicycleOperations{
    int gears ;
    int currentSpeed;

    Bicycle(int gears, int currentSpeed)
    {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }


    @Override
    public void applyBrake(int decrement) {
        currentSpeed-=decrement;
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed+=increment;
        System.out.println("Current speed is : " + currentSpeed);
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
