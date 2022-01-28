package activities;

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(4,60,10);
        System.out.println(mountainBike.bicycleDesc());
        mountainBike.speedUp(10);
        mountainBike.applyBrake(5);
    }
}
