public abstract class AbstractVehicle {
    public String type;
    public int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("The vehicle is: " + type + ", and has " + numberOfWheels + " wheels");
    }
    public abstract void doVehicleSound();
}
