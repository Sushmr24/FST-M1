package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Pass1");
        plane.onboard("Pass2");
        plane.onboard("Pass3");
        plane.onboard("Pass4");
        plane.onboard("Pass5");
        plane.onboard("Pass6");

        System.out.println("take off time : " +plane.takeOff());
        System.out.println("PAssagers are : "+plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Last time landed : "+ plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());


    }
}
