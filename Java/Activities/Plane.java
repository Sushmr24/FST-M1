package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    Plane(int maxPassengers)
    {
        this.maxPassengers = maxPassengers;
        passengers = new ArrayList<>();
    }
    public void onboard(String passng)
    {
        passengers.add(passng);
    }

    public Date takeOff()
    {
        lastTimeTookOf = new Date();
        return new Date();
    }

    public void land()
    {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    public Date getLastTimeLanded()
    {
        return lastTimeLanded;
    }

    public List<String> getPassengers()
    {
        return passengers;
    }

}
